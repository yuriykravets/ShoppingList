package com.yuriycode.shoppinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShoppingItem)

    fun deleteShopItem(shopItem: ShoppingItem): ShoppingItem

    fun editShopItem(shopItem: ShoppingItem)

    fun getShopList(): List<ShoppingItem>

    fun idAccessItem(shopItemId: Int): ShoppingItem

}