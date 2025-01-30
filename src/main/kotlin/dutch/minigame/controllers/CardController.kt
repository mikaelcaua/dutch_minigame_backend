package dutch.minigame.controllers

import dutch.minigame.models.CardModel
import dutch.minigame.services.CardService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cards")
class CardController(val cardService: CardService) {

    @GetMapping("")
    fun teste(): List<CardModel> {
        return cardService.startGame()
    }
}
