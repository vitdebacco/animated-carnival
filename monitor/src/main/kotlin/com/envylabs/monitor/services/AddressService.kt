package com.envylabs.monitor.services

import com.envylabs.monitor.models.Address

interface AddressService {
    fun all(limit: Int = 100): List<Address>
}
