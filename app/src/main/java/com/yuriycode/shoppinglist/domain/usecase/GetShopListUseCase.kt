package com.yuriycode.shoppinglist.domain.usecase

import com.yuriycode.shoppinglist.domain.ShopListRepository
import com.yuriycode.shoppinglist.domain.ShoppingItem

class GetShopListUseCase(private val shopListRepository:ShopListRepository) {

    fun getShopList(): List<ShoppingItem> {
        return shopListRepository.getShopList()
    }
}