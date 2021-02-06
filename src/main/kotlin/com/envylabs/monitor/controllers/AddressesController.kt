package com.envylabs.monitor.controllers

import com.envylabs.monitor.models.api.Addresses
import com.envylabs.monitor.services.AddressService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/addresses")
class AddressesController(
    private val addressService: AddressService
) {

    @GetMapping
    fun index(): Addresses {
        val addresses = addressService.all()

        return Addresses(
            addresses = addresses,
            count = addresses.size
        )
    }
}
