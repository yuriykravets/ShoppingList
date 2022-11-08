package com.yuriycode.shoppinglist.domain.usecase

import com.yuriycode.shoppinglist.domain.ShopListRepository
import com.yuriycode.shoppinglist.domain.ShoppingItem

class DeleteShopItemUseCase(private val shopListRepository:ShopListRepository) {

    fun deleteShopItem(shopItem: ShoppingItem){
        shopListRepository.deleteShopItem(shopItem)
    }
}