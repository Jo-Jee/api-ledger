package kr.co.jojee.ledger.repository

import kr.co.jojee.ledger.entity.History
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface HistoryRepository: JpaRepository<History, Long?> {
}