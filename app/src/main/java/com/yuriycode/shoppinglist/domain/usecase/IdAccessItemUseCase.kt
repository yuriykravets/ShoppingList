package com.yuriycode.shoppinglist.domain.usecase

import com.yuriycode.shoppinglist.domain.ShopListRepository
import com.yuriycode.shoppinglist.domain.ShoppingItem

class IdAccessItemUseCase(private val shopListRepository:ShopListRepository) {

    fun idAccessItem(shopItemId: Int): ShoppingItem{
        return shopListRepository.idAccessItem(shopItemId)
    }
}