package dutch.minigame.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Id
import jakarta.persistence.Table

enum class Suit {
    hearts,
    diamonds,
    clubs,
    spades
}

@Entity
@Table(name = "cards")
data class CardModel(

    @Id
    val id: Int,

    @Column(name = "number")
    val number: Int,

    @Enumerated(EnumType.STRING)
    @Column(name = "suit")
    val suit: Suit
)
