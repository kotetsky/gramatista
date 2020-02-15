package com.spikart.gramatista.repository.api.source

import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ServerApi {

    @GET("tocker/")
    fun getCryptocurrencies(@Query("start") start: String): Observable<List<Cryptocurrency>>
}