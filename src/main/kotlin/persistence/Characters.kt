package org.example.persistence

import org.example.entities.Character

class Characters {
    companion object {
        private val charactersList = mutableListOf<Character>()

        fun addCharacter(character: Character) {
            charactersList.addLast(character)
        }

        fun searchCharacter(name: String): Boolean {
            charactersList.forEach {
                if (it.name.equals(name)) {
                    return true
                }
            }
            return false
        }
    }

}