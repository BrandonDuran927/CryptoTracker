package com.example.cryptotracker.crypto.data.networking

import com.plcoding.cryptotracker.core.data.networking.constructUrl
import com.example.cryptotracker.core.data.networking.safeCall
import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.example.cryptotracker.core.domain.util.Result
import com.example.cryptotracker.core.domain.util.map
import com.example.cryptotracker.crypto.data.mappers.toCoin
import com.example.cryptotracker.crypto.data.mappers.toCoinPrice
import com.example.cryptotracker.crypto.data.networking.dto.CoinResponseDto
import com.example.cryptotracker.crypto.data.networking.dto.CoinHistoryDto
import com.example.cryptotracker.crypto.domain.Coin
import com.example.cryptotracker.crypto.domain.CoinDataSource
import com.example.cryptotracker.crypto.domain.CoinPrice
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import java.time.ZoneId
import java.time.ZonedDateTime

class RemoteCoinDataSource(
    private val httpClient: HttpClient
) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        /*
        Makes a network call using safeCall to fetch data as a ResponseCoinDto object.
        Then maps the result data to a list of Coin objects using the .toCoin() extension function.
         */
        return safeCall<CoinResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { responseCoinDto ->
            responseCoinDto.data.map { it.toCoin() }
        }
    }

    override suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError> {
        val startMillis = start
            .withZoneSameInstant(ZoneId.of("UTC"))
            .toInstant()
            .toEpochMilli()
        val endMillis = end
            .withZoneSameInstant(ZoneId.of("UTC"))
            .toInstant()
            .toEpochMilli()

        return safeCall<CoinHistoryDto> {
            httpClient.get(
                urlString = constructUrl("/assets/${coinId}/history")
            ) {
                parameter("interval", "h6")
                parameter("start", startMillis)
                parameter("end", endMillis)
            }
        }.map { response ->
            response.data.map { coinPriceDto -> coinPriceDto.toCoinPrice() }
        }
    }
}
