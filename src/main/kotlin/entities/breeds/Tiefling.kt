import org.example.interfaces.IAttributes

class Tiefling  : IAttributes {
    override fun strength(): Int {
        return 0
    }

    override fun dexterity(): Int {
        return 0
    }

    override fun constitution(): Int {
        return 0
    }

    override fun intelligence(): Int {
        return 1
    }

    override fun wisdom(): Int {
        return 0
    }

    override fun charisma(): Int {
        return 2
    }

}