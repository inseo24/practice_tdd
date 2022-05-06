package com.example.ddd

abstract class Money(
    protected var amount: Int,
    protected var currency: String,
) {
    open fun currency(): String {
        return currency
    }

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        other as Money
        return amount == other.amount && javaClass == other.javaClass
    }

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount, "USD")
        fun franc(amount: Int): Franc = Franc(amount, "CHF")
    }
}