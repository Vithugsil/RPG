package org.example.builder

import Dragonborn
import DwarfHill
import ElfDrow
import ElfForest
import ElfHigh
import Gnome
import GnomeForest
import GnomeRock
import HalfElf
import HalfOrc
import Halfling
import HalflingLightfoot
import HalflingStout
import Tiefling
import dungeons_n_kotlin.classes.breeds.DwarfMountain
import org.example.entities.Character
import org.example.entities.breeds.Human
import kotlin.system.exitProcess

class Characterbuilder {
    companion object {
        fun build(name: String, choice: Int): Character {
            val char: Character?
            when (choice) {
                1 -> char = Character(name, Dragonborn())
                2 -> char = Character(name, DwarfHill())
                3 -> char = Character(name, DwarfMountain())
                4 -> char = Character(name, ElfDrow())
                5 -> char = Character(name, ElfForest())
                6 -> char = Character(name, ElfHigh())
                7 -> char = Character(name, Gnome())
                8 -> char = Character(name, GnomeForest())
                9 -> char = Character(name, GnomeRock())
                10 -> char = Character(name, HalfElf())
                11 -> char = Character(name, Halfling())
                12 -> char = Character(name, HalflingLightfoot())
                13 -> char = Character(name, HalflingStout())
                14 -> char = Character(name, HalfOrc())
                15 -> char = Character(name, Human())
                16 -> char = Character(name, Tiefling())
                else -> exitProcess(0)
            }
            return char
        }
    }
}