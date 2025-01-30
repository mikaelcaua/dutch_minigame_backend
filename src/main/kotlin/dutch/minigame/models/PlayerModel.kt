package dutch.minigame.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "players")
data class PlayerModel (

    @Id
    val id:Int,

    @Column(name="name")
    val name:String

)