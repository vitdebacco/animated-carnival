package com.envylabs.monitor.services.faker

import com.envylabs.monitor.models.Address
import com.envylabs.monitor.services.AddressService
import com.github.javafaker.Faker
import org.springframework.stereotype.Service
import kotlin.random.Random
import kotlin.random.nextInt

@Service
class AddressServiceImpl : AddressService {

    private val faker = Faker()

    override fun all(limit: Int): List<Address> {
        var numResults = Random.nextInt(0..limit)
        val result = mutableListOf<Address>()

        while (numResults-- > 0) {
            result.add(generateAddress())
        }

        return result
    }

    private fun generateAddress(): Address {
        val state = faker.address().stateAbbr()

        return Address(
            street = faker.address().streetAddress(),
            city = faker.address().city(),
            state = state,
            zipCode = faker.address().zipCodeByState(state)
        )
    }
}
