package com.example.numbergame.domain.usecase

import com.example.numbergame.domain.entity.GameSettings
import com.example.numbergame.domain.entity.Level
import com.example.numbergame.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}