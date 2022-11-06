package com.yuriycode.shoppinglist.domain

data class ShoppingItem(
    val item: Int,
    val count: Int,
    val name: String,
    val enabled: Boolean
)
