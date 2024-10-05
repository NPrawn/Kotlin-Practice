open class Enemy(
    val name: String,
    var hp: Int,
    val attackPower: Int
) {
    open fun attack(target: Character) {
        println("Goblin attacks ${target.name}.")
        println("${target.name}'s HP remains ${target.hp}")
    }
}