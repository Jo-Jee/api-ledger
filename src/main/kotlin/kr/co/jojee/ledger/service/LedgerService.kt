package kr.co.jojee.ledger.service

import kr.co.jojee.ledger.entity.Ledger
import kr.co.jojee.ledger.repository.LedgerRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class LedgerService(
    val ledgerRepository: LedgerRepository
) {
    fun findById(id: Long): Ledger {
        return ledgerRepository.findById(id).orElseThrow { throw ResponseStatusException(HttpStatus.NOT_FOUND, "가계부를 찾을 수 없습니다.") }
    }
}
