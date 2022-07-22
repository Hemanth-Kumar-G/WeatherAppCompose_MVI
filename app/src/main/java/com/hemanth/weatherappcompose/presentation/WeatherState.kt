package com.hemanth.weatherappcompose.presentation

import com.hemanth.weatherappcompose.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
