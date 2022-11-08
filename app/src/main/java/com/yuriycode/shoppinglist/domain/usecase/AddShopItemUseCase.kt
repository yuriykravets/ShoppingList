package com.yuriycode.shoppinglist.domain.usecase

import com.yuriycode.shoppinglist.domain.ShopListRepository
import com.yuriycode.shoppinglist.domain.ShoppingItem

class AddShopItemUseCase(private val shopListRepository:ShopListRepository) {

    fun addShopItem(shopItem: ShoppingItem) {
        shopListRepository.addShopItem(shopItem)
    }
}