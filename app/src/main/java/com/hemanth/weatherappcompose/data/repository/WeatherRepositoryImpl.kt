package com.hemanth.weatherappcompose.data.repository

import com.hemanth.weatherappcompose.data.mappers.toWeatherInfo
import com.hemanth.weatherappcompose.data.remote.WeatherApi
import com.hemanth.weatherappcompose.domain.repository.WeatherRepository
import com.hemanth.weatherappcompose.domain.util.Resource
import com.hemanth.weatherappcompose.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(api.getWeatherData(lat, long).toWeatherInfo())
        } catch (e: Exception) {
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}