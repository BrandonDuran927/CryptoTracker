package com.example.cryptotracker.crypto.data.networking.dto

import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinDto
import kotlinx.serialization.Serializable

@Serializable
data class CoinResponseDto(
    val data: List<CoinDto>
)
