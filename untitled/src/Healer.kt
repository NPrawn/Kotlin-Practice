class Healer(name: String, hp: Int, attackPower: Int) : Character(name, hp, attackPower), Healable{
    override fun heal(target: Character, amount: Int) {
        target.hp += amount
        println("$name heals ${target.name} for $amount HP. Total HP: ${target.hp}")
    }
}