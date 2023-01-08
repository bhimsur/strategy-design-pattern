package io.bhimsur.strategypattern.service

import io.bhimsur.strategypattern.dto.InquiryTransferRequest
import org.springframework.stereotype.Service

@Service
class TransferService(
    private val transferMap: Map<String, TransferProcess>,
) {
    fun inquiry(request: InquiryTransferRequest): String {
        val transfer: TransferProcess? = this.transferMap[request.transactionCategory.name]
        if (transfer != null) {
            return transfer.inquiry(request)
        }
        return "Invalid Transaction Category"
    }
}