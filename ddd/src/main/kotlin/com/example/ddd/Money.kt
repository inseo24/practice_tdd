package com.example.ddd

open class Money(
    protected var amount: Int
) {
    override fun equals(other: Any?): Boolean {
        other as Money
        return amount == other.amount
    }
}