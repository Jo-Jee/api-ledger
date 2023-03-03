package kr.co.jojee.ledger.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import kr.co.jojee.ledger.dto.response.LedgerDetails
import kr.co.jojee.ledger.dto.response.LedgerMetadata

@Entity
class Ledger(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val name: String = "내 가계부",

    @Column(nullable = false)
    val budget: Long = 0,

    @Column(nullable = false)
    val balance: Long = 0
) {
    fun toDetails(): LedgerDetails {
        return LedgerDetails(
            id = id,
            name = name,
            budget = budget,
            balance = balance
        )
    }

    fun toMetadata(): LedgerMetadata {
        return LedgerMetadata(
            id = id,
            name = name
        )
    }
}
