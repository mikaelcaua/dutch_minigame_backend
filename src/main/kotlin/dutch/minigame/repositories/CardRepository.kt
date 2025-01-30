package dutch.minigame.repositories

import dutch.minigame.models.CardModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface CardRepository : JpaRepository<CardModel, Int>{

    @Query(value = "SELECT * FROM cards", nativeQuery = true)
    fun startGame(player_one: Int, player_two:Int):List<CardModel>
}