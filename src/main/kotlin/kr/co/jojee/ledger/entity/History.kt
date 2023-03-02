package kr.co.jojee.ledger.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import kr.co.jojee.ledger.dto.response.HistoryDetails

@Entity
class History(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val type: String,

    @Column(nullable = false)
    val amount: Int,

    @Column(nullable = false)
    val memo: String,

    @ManyToOne
    val ledger: Ledger
) {
    fun toDetails(): HistoryDetails {
        return HistoryDetails(
            id = id,
            type = type,
            amount = amount,
            memo = memo
        )
    }
}