package dutch.minigame.controllers
import dutch.minigame.models.PlayerModel
import dutch.minigame.services.PlayerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/players")
class PlayerController (val playerService: PlayerService){

    @GetMapping("")
    fun teste(): List<PlayerModel>{
       return playerService.getAllPlayers()
    }
}