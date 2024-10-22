package com.example.data.model

import kotlinx.serialization.Serializable


val expenses = mutableListOf(
    Expense(
        id = 0,
        amount = 70.0,
        categoryName = "GROCERIES",
        description = "Weekly buy"
    ),
    Expense(
        id = 1,
        amount = 10.0,
        categoryName = "SNACKS",
        description = "Home"
    ),
    Expense(
        id = 2,
        amount = 21000.0,
        categoryName = "CAR",
        description = "Ausi A1"
    ),
    Expense(
        id = 3,
        amount = 15.0,
        categoryName = "COFFEE",
        description = "Beans and Cream"
    ),
    Expense(
        id = 4,
        amount = 25.0,
        categoryName = "PARTY",
        description = "Weekend Party"
    ),
    Expense(
        id = 5,
        amount = 120.0,
        categoryName = "HOUSE",
        description = "Expenses"
    ),
    Expense(
        id = 6,
        amount = 25.0,
        categoryName = "OTHER",
        description = "Cleaning"
    )
)

var lastExpense = expenses.size.toLong()

@Serializable
data class Expense (
    val id: Long = lastExpense++,
    val amount: Double,
    val categoryName: String,
    val description: String
)
