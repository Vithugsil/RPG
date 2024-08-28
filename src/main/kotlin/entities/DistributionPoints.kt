package org.example.entities

import org.example.enums.Attributes
import org.example.view.Display as dp

class DistributionPoints {
    companion object {

        var totalPoints = 27
        var attributeFlag = true
        fun distributePoints(character: Character, attribute: Attributes, points: Int) {

            if (totalPoints > 0) {
                when (attribute) {
                    Attributes.STRENGTH -> {
                        if (points in 8..15) {
                            totalPoints -= Modifiers.modifierCost(points)
                            character.skills.strength = points
                        } else {
                            dp.rangePoints(points)
                        }
                    }
                    Attributes.DEXTERITY -> {
                        if (points in 8..15) {
                            totalPoints -= Modifiers.modifierCost(points)
                            character.skills.dexterity = points
                        } else {
                            dp.rangePoints(points)
                        }
                    }
                    Attributes.CONSTITUTION -> {
                        if (points in 8..15) {
                            totalPoints -= Modifiers.modifierCost(points)
                            character.skills.constitution = points
                        } else {
                            dp.rangePoints(points)
                        }
                    }
                    Attributes.INTELLIGENCE -> {
                        if (points in 8..15) {
                            totalPoints -= Modifiers.modifierCost(points)
                            character.skills.intelligence = points
                        } else {
                            dp.rangePoints(points)
                        }
                    }
                    Attributes.WISDOM -> {
                        if (points in 8..15) {
                            totalPoints -= Modifiers.modifierCost(points)
                            character.skills.wisdom = points
                        } else {
                            dp.rangePoints(points)
                        }
                    }

                    Attributes.CHARISMA -> {
                        if (points in 8..15) {
                            totalPoints -= Modifiers.modifierCost(points)
                            character.skills.charisma = points
                        } else {
                            dp.rangePoints(points)
                        }
                    }
                }
            } else {
                println("limit points reached")
                attributeFlag = false
            }
        }

        fun verifyChoice(choice: Int): Attributes {
            var userChoice: Attributes = Attributes.STRENGTH
            when (choice) {
                1 -> {
                    userChoice = Attributes.STRENGTH
                }

                2 -> {
                    userChoice = Attributes.DEXTERITY
                }

                3 -> {
                    userChoice = Attributes.CONSTITUTION
                }

                4 -> {
                    userChoice = Attributes.INTELLIGENCE
                }

                5 -> {
                    userChoice = Attributes.WISDOM
                }

                6 -> {
                    userChoice = Attributes.CHARISMA
                }


            }
            return userChoice
        }

        fun verifyIncreaseOrDecrease(choice: String) : Boolean {
            return choice.startsWith('I') || choice.startsWith('i')
        }
    }

}