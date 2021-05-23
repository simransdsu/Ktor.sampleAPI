package com.jetbrains.handson.httpapi.models

import kotlinx.serialization.Serializable
import java.util.*

val customerStorage = mutableListOf<Customer>()

@Serializable
data class Customer(
    val id: String = UUID.randomUUID().toString(),
    val firstName: String,
    val lastName: String,
    val email: String
)
