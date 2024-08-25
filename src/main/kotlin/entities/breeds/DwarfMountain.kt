package dungeons_n_kotlin.classes.breeds

import org.example.interfaces.IAttributes


class DwarfMountain : IAttributes {
    override fun strength(): Int {
        return 1
    }

    override fun dexterity(): Int {
        return 0
    }

    override fun constitution(): Int {
        return 2
    }

    override fun intelligence(): Int {
        return 0
    }

    override fun wisdom(): Int {
        return 0
    }

    override fun charisma(): Int {
        return 0
    }

}