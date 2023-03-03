package kr.co.jojee.ledger.dto.response

data class LedgerDetails(
    val id: Long?,
    val name: String,
    val budget: Long,
    val balance: Long
)
