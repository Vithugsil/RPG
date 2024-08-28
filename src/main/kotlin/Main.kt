package org.example

import org.example.builder.Characterbuilder
import org.example.entities.DistributionPoints as pt
import org.example.view.Display as dp

fun main() {
    while (true) {
        dp.hello()
        dp.firstChoice()
        val firstChoice = readln().toIntOrNull()
        if (firstChoice == 2 || firstChoice == null) {
            break
        } else {
            dp.welcome()
            dp.nameLabel()
            val nameInput = readln().trimStart()
            dp.breedLabel()
            val breedInput = readln().toInt()
            val character = Characterbuilder.build(nameInput, breedInput)
            while (pt.totalPoints > 0) {
                dp.shouwPoints()
                dp.showAttributes(character)
                val choice = readln().toInt()
                val skillChoice = pt.verifyChoice(choice)
                dp.askPoints()
                val pointsInput = readln().toInt()
                pt.distributePoints(character, skillChoice, pointsInput)
            }
            println("\nHere's you character")
            println(character.toString())
            break
        }
    }
}