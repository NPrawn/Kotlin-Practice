class Mage(name: String, hp: Int, attackPower: Int, var mana: Int) : Character(name, hp, attackPower), Attackable, Defendable {

    override fun attack(target: String) {
        println("$name casts a spell on $target with power $attackPower!")
        println("Mana left: $mana")
    }

    override fun defend() {
        if (mana >= 10) {
            println("$name uses a magical shield Mana left: $mana")
            mana -= 10;
        } else {
            println("can't block attack")
        }
    }
}