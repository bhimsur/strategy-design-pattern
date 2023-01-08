package io.bhimsur.strategypattern.controller

import io.bhimsur.strategypattern.constant.TransactionCategory
import io.bhimsur.strategypattern.dto.InquiryTransferRequest
import io.bhimsur.strategypattern.service.TransferService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/transfer"], produces = [MediaType.TEXT_PLAIN_VALUE])
class TransferController(val transferService: TransferService) {
    @PostMapping(value = ["inquiry"], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun inquiry(@RequestBody request: InquiryTransferRequest): String {
        return transferService.inquiry(request)
    }
}