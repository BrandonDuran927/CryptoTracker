package com.plcoding.cryptotracker.crypto.presentation.models

import android.icu.text.NumberFormat
import androidx.annotation.DrawableRes
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.core.presentation.util.getDrawableIdForCoin
import java.util.Locale

// PRESENTATION MODEL OF COIN UI TO DISPLAY PROPERLY
data class CoinUi(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    @DrawableRes val iconRes: Int
)

// DATA CLASS HELPER FOR FORMATTING THE TRUE VALUE TO UI
data class DisplayableNumber(
    val value: Double,
    val formatted: String
)

// Extension function for the Coin model
fun Coin.toCoinUi(): CoinUi {
    return CoinUi(
        id = id,
        name = name,
        symbol = symbol,
        rank = rank,
        priceUsd = priceUsd.toDisplayableDouble(),
        marketCapUsd = marketCapUsd.toDisplayableDouble(),
        changePercent24Hr = changePercent24Hr.toDisplayableDouble(),
        iconRes = getDrawableIdForCoin(symbol)
    )
}

// Extension function for the Double data types
fun Double.toDisplayableDouble(): DisplayableNumber {
    val formatter = NumberFormat.getInstance(Locale.getDefault()).apply {
        minimumFractionDigits = 2
        maximumFractionDigits = 2
    }

    return DisplayableNumber(
        value = this,
        formatted = formatter.format(this)
    )
}
