package kr.co.jojee.ledger.repository

import kr.co.jojee.ledger.entity.Ledger
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface LedgerRepository: JpaRepository<Ledger, Long?> {
}