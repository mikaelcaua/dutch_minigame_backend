package dutch.minigame.services
import dutch.minigame.models.PlayerModel
import dutch.minigame.repositories.PlayerRepository
import org.springframework.stereotype.Service

@Service
class PlayerService (val playerRepository: PlayerRepository){

    fun getAllPlayers():List<PlayerModel>{
        return playerRepository.findAll()
    }

}