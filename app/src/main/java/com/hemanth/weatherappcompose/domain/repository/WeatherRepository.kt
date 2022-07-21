package com.hemanth.weatherappcompose.domain.repository

import com.hemanth.weatherappcompose.domain.util.Resource
import com.hemanth.weatherappcompose.domain.weather.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>

}