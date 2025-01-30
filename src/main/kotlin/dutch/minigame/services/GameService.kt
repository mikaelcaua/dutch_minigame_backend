package dutch.minigame.services

import dutch.minigame.models.GameModel
import dutch.minigame.repositories.GameRepository
import org.springframework.stereotype.Service

@Service
class GameService(val gameRepository: GameRepository) {

    fun getAllGames():List<GameModel>{
        return gameRepository.findAll()
    }
}