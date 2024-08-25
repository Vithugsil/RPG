package org.example.entities

import org.example.enums.Attributes

class DistributionPoints {
    companion object {

        private var totalPoints = 27
        fun distributePoints(character: Character, attribute: Attributes, points: Int) {
            if (totalPoints > points) {
                when (attribute) {
                    Attributes.STRENGTH -> {
                        totalPoints -= Modifiers.modifierCost(character.skills.strength)
                        character.skills.strength += points
                    }

                    Attributes.DEXTERITY -> {
                        totalPoints -= Modifiers.modifierCost(character.skills.dexterity)
                        character.skills.dexterity += points
                    }

                    Attributes.CONSTITUTION -> {
                        totalPoints -= Modifiers.modifierCost(character.skills.constitution)
                        character.skills.constitution += points
                    }

                    Attributes.INTELLIGENCE -> {
                        totalPoints -= Modifiers.modifierCost(character.skills.intelligence)
                        character.skills.intelligence += points
                    }

                    Attributes.WISDOM -> {
                        totalPoints -= Modifiers.modifierCost(character.skills.wisdom)
                        character.skills.wisdom += points
                    }

                    Attributes.CHARISMA -> {
                        totalPoints -= Modifiers.modifierCost(character.skills.charisma)
                        character.skills.charisma += points
                    }
                }
            } else {
                throw error("limit points exceeded")
            }
        }
    }
}