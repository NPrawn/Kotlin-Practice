open class Character(
    val name: String,
    var hp: Int,
    val attackPower: Int) {

    open fun attack(target: String) {
        println("$name attacks $target with power $attackPower!")
    }
}