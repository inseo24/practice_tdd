package com.example.ddd

class Dollar(
    var amount: Int
) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }
}
