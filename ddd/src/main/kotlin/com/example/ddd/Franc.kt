package com.example.ddd

class Franc(
    private var amount: Int
) {

    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(obj: Any?): Boolean {
        obj as Franc
        if (amount != obj.amount) return false
        return true
    }
}
