package com.example.numbergame.domain.repository

import com.example.numbergame.domain.entity.GameSettings
import com.example.numbergame.domain.entity.Level
import com.example.numbergame.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int,
    ): Question

    fun getGameSettings(level: Level): GameSettings
}