package com.yuriycode.shoppinglist.data

import com.yuriycode.shoppinglist.domain.ShopListRepository
import com.yuriycode.shoppinglist.domain.ShoppingItem

object ShopListRepositoryImpl : ShopListRepository {

    private var shopList = mutableListOf<ShoppingItem>()

    private var autoIncrementId = 0

    override fun addShopItem(shopItem:ShoppingItem) {
        if (shopItem.id == ShoppingItem.UNDEFINED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem:ShoppingItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem:ShoppingItem) {
        val oldElement = idAccessItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopList():List<ShoppingItem> {
        return shopList.toList()
    }

    override fun idAccessItem(shopItemId:Int):ShoppingItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId is not found")
    }
}