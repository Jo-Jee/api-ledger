package kr.co.jojee.ledger.dto.request

data class CreateRecordBody(
    val type: String,
    val amount: Int,
    val memo: String
)
