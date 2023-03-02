package kr.co.jojee.ledger.service

import kr.co.jojee.ledger.dto.request.CreateRecordBody
import kr.co.jojee.ledger.entity.Ledger
import kr.co.jojee.ledger.entity.History
import kr.co.jojee.ledger.repository.LedgerRepository
import kr.co.jojee.ledger.repository.HistoryRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class LedgerService(
    val ledgerRepository: LedgerRepository,
    val historyRepository: HistoryRepository
) {
    fun findById(id: Long): Ledger {
        return ledgerRepository.findById(id).orElseThrow { throw ResponseStatusException(HttpStatus.NOT_FOUND, "가계부를 찾을 수 없습니다.") }
    }

    fun createLedger(): Ledger {
        val newLedger = Ledger()

        return ledgerRepository.save(newLedger)
    }

    fun createHistory(id: Long, createRecordBody: CreateRecordBody): History {
        val ledger = ledgerRepository.findById(id).orElseThrow{ throw ResponseStatusException(HttpStatus.NOT_FOUND, "가계부를 찾을 수 없습니다.") }

        val newHistory = History(
            type = createRecordBody.type,
            amount = createRecordBody.amount,
            memo = createRecordBody.memo,
            ledger = ledger
        )

        return historyRepository.save(newHistory)
    }
}
