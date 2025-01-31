package dutch.minigame.controllers

import dutch.minigame.models.GameModel
import dutch.minigame.services.GameService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/games")
class GameController (val gameService: GameService){

    @GetMapping("")
    fun teste():List<GameModel>{
        return gameService.getAllGames()
    }
}