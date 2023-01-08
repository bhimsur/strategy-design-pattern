package io.bhimsur.strategypattern.service

import io.bhimsur.strategypattern.dto.InquiryTransferRequest
import org.springframework.stereotype.Service

@Service(value = "TRANSFER_ON_US")
class TransferOnUsService: TransferProcess {
    override fun inquiry(request: InquiryTransferRequest): String {
        return "inquiry transfer on us with amount : ${request.amount}"
    }
}