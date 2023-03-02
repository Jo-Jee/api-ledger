package kr.co.jojee.ledger.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import kr.co.jojee.ledger.dto.response.LedgerDetails

@Entity
class Ledger(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val budget: Long = 0,

    @Column(nullable = false)
    val balance: Long = 0
) {
    fun toDetails(): LedgerDetails {
        return LedgerDetails(
            id = id,
            budget = budget,
            balance = balance
        )
    }
}
