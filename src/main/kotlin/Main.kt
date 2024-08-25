package org.example

import Gnome
import org.example.entities.Character
import org.example.entities.DistributionPoints as dp
import org.example.entities.breeds.Human
import org.example.enums.Attributes
import org.example.persistence.Characters
import org.example.persistence.Characters as cl



fun main() {

    val a = Character("Ednaldo Pereira", Gnome())
    println(a.toString())

}