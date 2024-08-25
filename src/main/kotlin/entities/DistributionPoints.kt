package org.example.entities

import org.example.enums.Attributes

class DistributionPoints {
    companion object {

        var totalPoints = 27
        var attributeFlag = true
        fun distributePoints(character: Character, attribute: Attributes, points: Int) {

            if (totalPoints >= points && totalPoints != 0) {
                when (attribute) {
                    Attributes.STRENGTH -> {
                        if (character.skills.strength + points <= 15) {
                            for (i in 1..points) {
                                val cost =
                                    Modifiers.modifierCost(character.skills.strength + 1)

                                if (totalPoints > 0 && (totalPoints - cost) >= 0) {
                                    totalPoints -= cost
                                    character.skills.strength += 1
                                } else {
                                    println("You do not have enough points remaining.")
                                    println()
                                }
                            }
                        } else {
                            println("The strength attribute value cannot exceed 15.")
                        }
                    }

                    Attributes.DEXTERITY -> {
                        if (character.skills.dexterity + points <= 15) {
                            for (i in 1..points) {
                                val cost =
                                    Modifiers.modifierCost(character.skills.dexterity + 1)

                                if (totalPoints > 0 && (totalPoints - cost) >= 0) {
                                    totalPoints -= cost
                                    character.skills.dexterity += 1
                                } else {
                                    println("You do not have enough points remaining.")
                                    println()
                                }
                            }
                        } else {
                            println("The dexterity attribute value cannot exceed 15")
                        }
                    }

                    Attributes.CONSTITUTION -> {
                        if (character.skills.constitution + points <= 15) {
                            for (i in 1..points) {
                                val cost =
                                    Modifiers.modifierCost(character.skills.constitution + 1)

                                if (totalPoints > 0 && (totalPoints - cost) >= 0) {
                                    totalPoints -= cost
                                    character.skills.constitution += 1
                                } else {
                                    println("You do not have enough points remaining.")
                                    println()
                                }
                            }
                        } else {
                            println("The constitution attribute value cannot exceed 15")
                        }
                    }

                    Attributes.INTELLIGENCE -> {
                        if (character.skills.intelligence + points <= 15) {
                            for (i in 1..points) {
                                val cost =
                                    Modifiers.modifierCost(character.skills.intelligence + 1)

                                if (totalPoints > 0 && (totalPoints - cost) >= 0) {
                                    totalPoints -= cost
                                    character.skills.intelligence += 1
                                } else {
                                    println("You do not have enough points remaining.")
                                    println()
                                }
                            }
                        } else {
                            println("The intelligence attribute value cannot exceed 15")
                        }
                    }

                    Attributes.WISDOM -> {
                        if (character.skills.wisdom + points <= 15) {
                            for (i in 1..points) {
                                val cost =
                                    Modifiers.modifierCost(character.skills.wisdom + 1)

                                if (totalPoints > 0 && (totalPoints - cost) >= 0) {
                                    totalPoints -= cost
                                    character.skills.wisdom += 1
                                } else {
                                    println("You do not have enough points remaining.")
                                    println()
                                }
                            }
                        } else {
                            println("The wisdom attribute value cannot exceed 15")
                        }
                    }

                    Attributes.CHARISMA -> {
                        if (character.skills.charisma + points <= 15) {
                            for (i in 1..points) {
                                val cost =
                                    Modifiers.modifierCost(character.skills.charisma + 1)

                                if (totalPoints > 0 && (totalPoints - cost) >= 0) {
                                    totalPoints -= cost
                                    character.skills.charisma += 1
                                } else {
                                    println("You do not have enough points remaining.")
                                    println()
                                }
                            }
                        } else {
                            println("The charisma attribute value cannot exceed 15")
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

    }

}