package kr.co.jojee.ledger.dto.response

data class HistoryDetails(
    val id: Long?,
    val type: String,
    val amount: Int,
    val memo: String
)
