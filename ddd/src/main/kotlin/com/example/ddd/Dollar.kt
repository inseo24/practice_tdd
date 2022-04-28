package com.example.ddd

class Dollar(
    private var amount: Int
) {

    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(obj: Any?): Boolean {
        obj as Dollar
        if (amount != obj.amount) return false
        return true
    }
}
