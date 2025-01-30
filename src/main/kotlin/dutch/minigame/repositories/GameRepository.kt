package dutch.minigame.repositories

import dutch.minigame.models.GameModel
import org.springframework.data.jpa.repository.JpaRepository

interface GameRepository:JpaRepository<GameModel, Int>