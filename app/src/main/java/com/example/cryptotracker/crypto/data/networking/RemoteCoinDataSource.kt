package com.plcoding.cryptotracker.crypto.data.networking

import com.plcoding.cryptotracker.core.data.networking.constructUrl
import com.plcoding.cryptotracker.core.data.networking.safeCall
import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result
import com.plcoding.cryptotracker.core.domain.util.map
import com.plcoding.cryptotracker.crypto.data.mappers.toCoin
import com.plcoding.cryptotracker.crypto.data.networking.dto.ResponseCoinDto
import com.plcoding.cryptotracker.crypto.domain.Coin
import com.plcoding.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        /*
        Makes a network call using safeCall to fetch data as a ResponseCoinDto object.
        Then maps the result data to a list of Coin objects using the .toCoin() extension function.
         */
        return safeCall<ResponseCoinDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { responseCoinDto ->
            responseCoinDto.data.map { it.toCoin() }
        }
    }
}
