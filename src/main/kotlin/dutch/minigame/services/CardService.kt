package dutch.minigame.services
import dutch.minigame.models.CardModel
import dutch.minigame.repositories.CardRepository
import org.springframework.stereotype.Service

@Service
class CardService (val cardRepository: CardRepository){

    fun startGame(): List<CardModel> {
        return cardRepository.startGame(1,2)
    }
}
