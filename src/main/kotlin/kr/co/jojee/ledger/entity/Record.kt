package kr.co.jojee.ledger.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
class Record(
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
}