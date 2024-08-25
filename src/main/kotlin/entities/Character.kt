package org.example.entities

import org.example.interfaces.IAttributes

//Strategy context
class Character(val name: String, private val breed: IAttributes) {

    private val life = 10 + breed.constitution()
    var skills = Skills()

    init {
        addSkills()
    }

    private fun addSkills() {
        skills.strength += breed.strength()
        skills.dexterity += breed.dexterity()
        skills.constitution += breed.constitution()
        skills.intelligence += breed.intelligence()
        skills.wisdom += breed.wisdom()
        skills.charisma += breed.charisma()
    }

    override fun toString(): String {
        return "${name}(${breed::class.simpleName}) attributes:\n" +
                "Total Life: ${life}\n" +
                "Strength: ${skills.strength} (+${Modifiers.modifierCost(skills.strength)})\n" +
                "Dexterity: ${skills.dexterity} (+${skills.dexterity})\n" +
                "Constitution: ${skills.constitution} (+${skills.constitution})\n" +
                "Intelligence: ${skills.intelligence} (+${skills.intelligence})\n" +
                "Wisdom: ${skills.wisdom} (+${skills.wisdom})\n" +
                "Charisma: ${skills.charisma} (+${skills.charisma})"
    }
}