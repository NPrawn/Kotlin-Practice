class Warrior(name: String, hp: Int, attackPower: Int) : Character(name, hp, attackPower), Attackable, Defendable {

    override fun attack(target: String) {
        println("$name slashes $target with power $attackPower")
    }

    override fun defend() {
        println("$name blocks attack")
    }
}