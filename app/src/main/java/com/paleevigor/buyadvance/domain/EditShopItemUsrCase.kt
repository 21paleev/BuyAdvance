package com.paleevigor.buyadvance.domain

class EditShopItemUsrCase (private val shopListRepository: ShopListRepository){
    fun editShopItem(shopItem: ShopItem){
shopListRepository.editShopItem(shopItem)
    }
}