package kr.co.jojee.ledger.controller

import kr.co.jojee.ledger.dto.request.CreateHistoryBody
import kr.co.jojee.ledger.dto.response.HistoryDetails
import kr.co.jojee.ledger.dto.response.LedgerDetails
import kr.co.jojee.ledger.dto.response.LedgerMetadata
import kr.co.jojee.ledger.service.LedgerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("ledger/v1")
class LedgerController(
    val ledgerService: LedgerService
) {
    @GetMapping("/ledger/{id}")
    fun findById(@PathVariable id: Long): LedgerDetails {
        return ledgerService.findById(id).toDetails()
    }

    @PostMapping("/ledger/")
    fun createLedger(): LedgerDetails {
        return ledgerService.createLedger().toDetails()
    }

    @PostMapping("/ledger/{id}/history")
    fun createHistory(@PathVariable id: Long, @RequestBody createHistoryBody: CreateHistoryBody): HistoryDetails {
        return ledgerService.createHistory(id, createHistoryBody).toDetails()
    }

    @GetMapping("/user/{id}/ledger")
    fun findByUserId(@PathVariable id: Long): List<LedgerMetadata> {
        return ledgerService.findByUserId(id).map { it.toMetadata() }
    }
}
