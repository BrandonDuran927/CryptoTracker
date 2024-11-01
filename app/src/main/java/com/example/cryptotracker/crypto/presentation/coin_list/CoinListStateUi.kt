package com.example.cryptotracker.crypto.presentation.coin_list

import com.plcoding.cryptotracker.crypto.presentation.models.CoinUi


// MVI APPROACH
//@Immutable
data class CoinListStateUi(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)