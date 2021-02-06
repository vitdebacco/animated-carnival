package com.envylabs.monitor.models.api

import com.envylabs.monitor.models.Address

data class Addresses(
    val addresses: List<Address>,
    val count: Int
)
