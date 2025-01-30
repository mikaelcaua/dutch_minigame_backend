package dutch.minigame.repositories

import dutch.minigame.models.CardModel
import dutch.minigame.models.CardSuit
import org.springframework.data.jpa.repository.JpaRepository

interface CardRepository:JpaRepository<CardModel, Int>{

    fun startGame(): List<CardModel>{
        return List<CardModel>(CardModel(cardSuit =CardSuit.clubs ,1))
    }
}
