import org.example.interfaces.IAttributes

class GnomeRock : IAttributes {
    override fun strength(): Int {
        return 0
    }

    override fun dexterity(): Int {
        return 0
    }

    override fun constitution(): Int {
        return 1
    }

    override fun intelligence(): Int {
        return 2
    }

    override fun wisdom(): Int {
        return 0
    }

    override fun charisma(): Int {
        return 0
    }

}