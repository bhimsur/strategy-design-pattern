package io.bhimsur.strategypattern.service

import io.bhimsur.strategypattern.dto.InquiryTransferRequest
import org.springframework.stereotype.Service

@Service(value = "TRANSFER_OFF_US")
class TransferOffUsService: TransferProcess {
    override fun inquiry(request: InquiryTransferRequest): String {
        return "inquiry transfer off us with amount ${request.amount}"
    }
}