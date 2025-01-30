package dutch.minigame.repositories

import dutch.minigame.models.PlayerModel
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository: JpaRepository<PlayerModel, Int>{
}