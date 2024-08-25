package org.example

import org.example.builder.Characterbuilder
import org.example.entities.Character
import org.example.entities.DistributionPoints
import org.example.entities.DistributionPoints as pt
import org.example.entities.breeds.Human
import java.util.*
import org.example.view.Display as dp


fun main() {
    var isGameRunning = true;
    do {
        println("[1] - Create character\n[2] - Exit")
        val firstChoice = readln().toIntOrNull()
        if (firstChoice == 2 || firstChoice == null) {
            isGameRunning = false
        } else {
            dp.welcome()
            dp.nameLabel()
            val nameInput = readln().trimStart()
            dp.breedLabel()
            val breedInput = readln().toInt()
            val character = Characterbuilder.build(nameInput, breedInput)

            while (pt.totalPoints >= 0) {
                if (pt.totalPoints == 0) {
                    break
                } else {
                    println("You have ${pt.totalPoints} points left")
                    dp.showAttributes(character)
                    when (val choice = readln().toInt()) {
                        0 -> {
                            if(pt.totalPoints == 0){
                                break
                            }else{
                                continue
                            }
                        }
                        else -> {
                            val verifiedChoice = pt.verifyChoice(choice)
                            dp.askPoints()
                            val points = readln().toInt()
                            pt.distributePoints(character, verifiedChoice, points)
                        }
                    }
                }
            }
            println("\nHere's you character")
            println(character.toString())
            isGameRunning = false
        }
    } while (isGameRunning)

}

