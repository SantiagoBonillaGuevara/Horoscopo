package com.example.horoscapp.domain

interface Repository {
    suspend fun getPrediction(sign: String)
}