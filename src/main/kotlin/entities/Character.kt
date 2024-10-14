package org.example.entities

import org.example.interfaces.IAttributes



//Strategy context
class Character(val name: String, val breed: IAttributes) {

    var skills = Skills()
    var life = 10


    override fun toString(): String {
        return "${name}(${breed::class.simpleName}) attributes:\n" +
                "Total Life: ${life + (skills.constitution + Modifiers.modifierAttribute(skills.constitution))} \n" +
                "Base Point | Breed modifier | Modifier\n" +
                "[1] - Strength: ${skills.strength} +[${breed.strength()}]  +(${Modifiers.modifierAttribute(skills.strength)})\n" +
                "[2] - Dexterity: ${skills.dexterity} +[${breed.dexterity()}] +(${Modifiers.modifierAttribute(skills.dexterity)})\n" +
                "[3] - Constitution: ${skills.constitution} +[${breed.constitution()}] +(${Modifiers.modifierAttribute(skills.constitution)})\n" +
                "[4] - Intelligence: ${skills.intelligence} +[${breed.intelligence()}] +(${Modifiers.modifierAttribute(skills.intelligence)})\n" +
                "[5] - Wisdom: ${skills.wisdom} +[${breed.wisdom()}] +(${Modifiers.modifierAttribute(skills.wisdom)})\n" +
                "[6] - Charisma: ${skills.charisma}  +[${breed.charisma()}] +(${Modifiers.modifierAttribute(skills.charisma)})"
    }
}