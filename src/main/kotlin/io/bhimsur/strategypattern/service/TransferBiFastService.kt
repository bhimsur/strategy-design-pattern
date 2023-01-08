package io.bhimsur.strategypattern.service

import io.bhimsur.strategypattern.dto.InquiryTransferRequest
import org.springframework.stereotype.Service

@Service(value = "TRANSFER_BI_FAST")
class TransferBiFastService: TransferProcess{
    override fun inquiry(request: InquiryTransferRequest): String {
        return "inquiry transfer bi-fast with amount ${request.amount}"
    }
}