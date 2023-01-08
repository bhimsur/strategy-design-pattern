package io.bhimsur.strategypattern.service

import io.bhimsur.strategypattern.dto.InquiryTransferRequest

interface TransferProcess {
    fun inquiry(request: InquiryTransferRequest): String
}