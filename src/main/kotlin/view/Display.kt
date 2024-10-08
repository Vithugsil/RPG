package org.example.view

import org.example.entities.Character
import org.example.entities.DistributionPoints

class Display {
    companion object {
        fun welcome() {
            println("Welcome to your new RPG, pleaser begin creating your character")
        }

        fun firstChoice(){
            println("[1] - Create character\n[2] - Exit")
        }

        fun hello(){
            println("\nChoose what you prefer sir.")
        }

        fun nameLabel() {
            println("First choose your nickname:")
        }

        fun breedLabel() {
            println(
                "Choose your race:\n" +
                        "[1] - Dragon Born\n" +
                        "[2] - Dwarf Hill\n" +
                        "[3] - Dwarf Mountain\n" +
                        "[4] - Elf Drow\n" +
                        "[5] - Elf Forest\n" +
                        "[6] - Elf High\n" +
                        "[7] - Gnome\n" +
                        "[8] - Gnome Forest\n" +
                        "[9] - Gnome Rock\n" +
                        "[10] - Half Elf\n" +
                        "[11] - Halfling\n" +
                        "[12] - Halfling Lightfoot\n" +
                        "[13] - Halfling Stout\n" +
                        "[14] - Half Orc\n" +
                        "[15] - Human\n" +
                        "[16] - Tiefling"
            )
        }

        fun rangePoints(point: Int) {
            if (point > 15) {
                println("\nThe strength attribute value cannot exceed 15.\n")
            } else if (point < 8) {
                println("\nThe strength attribute value cannot be lower than 8.\n")
            }
        }

        fun showAttributes(character: Character) {
            println(character.toString())
            println("Which attribute you would like to increase?")
        }

        fun askPoints() {
            println("How many points do you wanna increase ?")
        }

        fun increaseOrDecrease() {
            println("Do you want to increase or decrease attribute")
        }

        fun exitOpt() {
            println("\n[0] - Exit")
        }

        fun notEnoughPoints() {
            print("not enough points")
        }

        fun shouwPoints(){
            println("\nYou have ${DistributionPoints.totalPoints} points left\n")
        }

    }
}