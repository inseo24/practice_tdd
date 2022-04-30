package com.example.ddd

open abstract class Money(
    protected var amount: Int
) {

    abstract fun times(multiplier: Int): Money

    override fun equals(other: Any?): Boolean {
        other as Money
        return amount == other.amount && javaClass == other.javaClass
    }

    companion object {
        fun dollar(amount: Int): Dollar = Dollar(amount)
        fun franc(amount: Int): Franc = Franc(amount)
    }
}