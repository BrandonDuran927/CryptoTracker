package com.example.cryptotracker.crypto.presentation.coin_list

import com.example.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnClickCoin(val coinUi: CoinUi) : CoinListAction
}

