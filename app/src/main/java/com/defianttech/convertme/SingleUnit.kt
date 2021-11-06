package com.defianttech.convertme

class SingleUnit(val id: Int, val name: String, val multiplier: Double, val offset: Double) {
    var isEnabled = true

    override fun toString(): String {
        return name
    }
}
