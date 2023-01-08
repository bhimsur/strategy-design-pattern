package io.bhimsur.strategypattern.dto

import io.bhimsur.strategypattern.constant.TransactionCategory

data class InquiryTransferRequest(
    val amount: Double,
    val transactionCategory: TransactionCategory
)