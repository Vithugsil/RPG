package org.example.view

import org.example.entities.Character

class Display {
    companion object {
        fun welcome() {
            println("Welcome to your new RPG, pleaser begin creating your character")
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

        fun showAttributes(character: Character) {
            println(character.toString())
            println("Which attribute you would like to increase?")
        }
        fun askPoints(){
            println("How many points do you want increase ?")
        }

        fun exitOpt(){
            println("\n[0] - Exit")
        }
    }
}