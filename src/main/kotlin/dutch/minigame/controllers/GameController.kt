package dutch.minigame.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/game")
class GameController {

    @GetMapping("/")
    fun teste():String{
        return "OLÁAAAA"
    }
}