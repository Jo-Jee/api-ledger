package kr.co.jojee.ledger.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import kr.co.jojee.ledger.dto.response.HistoryDetails
import java.time.LocalDateTime

@Entity
class History(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    var type: String,

    @Column(nullable = false)
    var amount: Int,

    @Column(nullable = false)
    var memo: String,

    @ManyToOne
    val ledger: Ledger,

    @Column(nullable = false)
    var timestamp: LocalDateTime? = null
) {
    fun toDetails(): HistoryDetails {
        return HistoryDetails(
            id = id,
            type = type,
            amount = amount,
            memo = memo,
            timestamp = timestamp.toString()
        )
    }
}
