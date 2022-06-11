package com.amirreza.data.repository

import com.amirreza.data.configuration.local.WatchListDouInterface
import com.amirreza.domain.entity.WatchListWeather
import com.amirreza.domain.repository.WatchListRepository

class WatchListRepositoryImpl(private val watchListDou: WatchListDouInterface):WatchListRepository {
    override fun addCityToWatchList(watchListWeather: WatchListWeather) {
        watchListDou.add(watchListWeather)
    }

    override fun deleteCityFromWatchList(watchListWeather: WatchListWeather) {
        watchListDou.delete(watchListWeather)

    }
    override fun getNumberOfCityInDatabase(): Int {
        return watchListDou.numberOfCityInDatabase
    }
}