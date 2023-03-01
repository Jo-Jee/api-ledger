package kr.co.jojee.ledger.repository

import kr.co.jojee.ledger.entity.Record
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RecordRepository: JpaRepository<Record, Long?> {
}