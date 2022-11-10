package com.yuriycode.shoppinglist.domain

data class ShoppingItem(
    val count: Int,
    val name: String,
    val enabled: Boolean,
    var id: Int = UNDEFINED_ID
) {


    companion object{
        const val UNDEFINED_ID = -1
    }
}
