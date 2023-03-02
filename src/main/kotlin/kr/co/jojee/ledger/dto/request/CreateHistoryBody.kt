package kr.co.jojee.ledger.dto.request

data class CreateHistoryBody(
    val type: String,
    val amount: Int,
    val memo: String,
    val timestamp: String
)
