package com.example.horoscapp.data

import com.example.horoscapp.domain.Repository
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImplementation @Inject constructor(retrofit: Retrofit) : Repository {
    override suspend fun getPrediction(sign: String) {
        TODO("Not yet implemented")
    }
}