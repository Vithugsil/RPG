package org.example.entities.breeds

import org.example.interfaces.IAttributes

class Human : IAttributes {
    val life = 10 + constitution();
    override fun strength(): Int {
        return 1
    }

    override fun dexterity(): Int {
        return 1
    }

    override fun constitution(): Int {
        return 1
    }

    override fun intelligence(): Int {
        return 1
    }

    override fun wisdom(): Int {
        return 1
    }

    override fun charisma(): Int {
        return 1
    }

}