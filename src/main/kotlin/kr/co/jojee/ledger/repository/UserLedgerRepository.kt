package kr.co.jojee.ledger.repository

import kr.co.jojee.ledger.entity.UserLedger
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserLedgerRepository: JpaRepository<UserLedger, Long?> {
    fun findByUserId(id: Long): List<UserLedger>
}