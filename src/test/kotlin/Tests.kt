import org.example.entities.Character
import org.example.entities.Modifiers
import org.example.entities.Skills
import org.example.entities.breeds.Human
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


class Tests {

    private val characterTester = Character("test", Human())

    @Test
    fun `ensure that the minimum attribute value is 8`() {
        characterTester.skills = Skills()

        assertEquals(8, characterTester.skills.strength)
        assertEquals(8, characterTester.skills.dexterity)
        assertEquals(8, characterTester.skills.constitution)
        assertEquals(8, characterTester.skills.intelligence)
        assertEquals(8, characterTester.skills.wisdom)
        assertEquals(8, characterTester.skills.charisma)
    }

    @Test
    fun `ensure attribute costs calculation is correct`() {
        characterTester.skills = Skills()
        var attributeValue = characterTester.skills.strength

        assertEquals(0, Modifiers.modifierCost(attributeValue))

        attributeValue += 1

        assertEquals(1, Modifiers.modifierCost(attributeValue))

        attributeValue += 1

        assertEquals(2, Modifiers.modifierCost(attributeValue))
    }

    @Test
    fun `ensure attribute modifiers calculation is correct`() {
        characterTester.skills = Skills()
        var attributeValue = characterTester.skills.strength

        assertEquals(-1, Modifiers.modifierAttribute(attributeValue))

        attributeValue += 1

        assertEquals(-1, Modifiers.modifierAttribute(attributeValue))

        attributeValue += 1

        assertEquals(0, Modifiers.modifierAttribute(attributeValue))

        attributeValue += 1

        assertEquals(0, Modifiers.modifierAttribute(attributeValue))

        attributeValue += 1

        assertEquals(1, Modifiers.modifierAttribute(attributeValue))

        attributeValue += 1

        assertEquals(1, Modifiers.modifierAttribute(attributeValue))

        attributeValue += 1

        assertEquals(2, Modifiers.modifierAttribute(attributeValue))

        attributeValue += 1

        assertEquals(2, Modifiers.modifierAttribute(attributeValue))
    }

    @Test
    fun `ensure character's initial health points are 10`() {
        val hp = characterTester.life
        assertEquals(10, hp)
    }


}