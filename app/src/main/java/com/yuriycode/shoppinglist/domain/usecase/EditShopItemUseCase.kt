package com.yuriycode.shoppinglist.domain.usecase

import com.yuriycode.shoppinglist.domain.ShopListRepository
import com.yuriycode.shoppinglist.domain.ShoppingItem

class EditShopItemUseCase(private val shopListRepository:ShopListRepository) {

    fun editShopItem(shopItem: ShoppingItem){
        shopListRepository.editShopItem(shopItem)
    }
}