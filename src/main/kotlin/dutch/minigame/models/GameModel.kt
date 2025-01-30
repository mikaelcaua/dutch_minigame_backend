package dutch.minigame.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "games")
data class GameModel(
    @Id
    val id:Int,

    @Column(name = "player_one")
    val playerOne:Int,

    @Column(name = "player_two")
    val playerTwo:Int,

    @Column(name = "current_player")
    val currentPlayer:Int
)