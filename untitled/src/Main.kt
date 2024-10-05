import kotlin.random.Random

fun main() {
    val warrior = Warrior("Thor", 100, 20)
    val mage = Mage("Merlin", 80, 30, 100)
    val enemies = listOf("Goblin", "Orc", "Dark Knight")
    for (enemy in enemies) {
        warrior.attack(enemy)
        if((1..2).random() == 1) {
            warrior.defend()
        }
        mage.attack(enemy)
        if ((1..2).random() == 1) {
            mage.defend()
            println("End of round against $enemy")
        }

        println("Battle ends! Time to heal.")
        val healer = Healer("Athena", 60, 10)
        healer.heal(warrior, 20)
        healer.heal(mage, 30)
    }
}

fun main6() {
    val options = arrayOf("가위", "바위", "보")
    val computerChoice = options[Random.nextInt(3)]
    print("가위바위보: ")
    val user = readLine()
    if (computerChoice == user) {
        println("비겼습니다")
    }else if (
        (user == "가위" && computerChoice == "보") ||
        (user == "바위" && computerChoice == "가위") ||
        (user == "보" && computerChoice == "바위")
    ) {
        println("이겼습니다")
    } else {
        println("졌습니다. 컴퓨터의 선택: $computerChoice")
    }
}

fun main5() {
    val ans = (1..9).shuffled().take(3)

    while (true) {
        print("세 자리 숫자를 입력해주세요.: ")
        val input = readlnOrNull()?.map {it.toString().toInt()}
        if (input == null || input.size != 3) {
            println("세 자리 숫자를 입력해주세요.: ")
            continue
        }
        val strike = ans.zip(input).count(){ it.first == it.second}
        val ball = input.count{it in ans} - strike

        if (strike == 3) {
            println("정답!")
            break
        }

        println("스트라이크: ${strike} 볼: ${ball}")
    }
}

fun main4() {
    val a = readLine()?.toInt() ?: 0
    var result = 0
    for (i in 1..a) {
        result += i
    }

    println("${result}")
}

fun main3() {
    print("수 입력: ")
    val a = readLine()?.toInt() ?: 0

    if (a > 0) {
        println("양수")
    }
    else if (a < 0) {
        println("음수")
    } else {
        println("0")
    }
}

fun main2() {
    print("첫번째 수: ")
    var a = readLine()?.toInt() ?: 0
    print("두번째 수: ")
    var b = readLine()?.toInt()?: 0

    println("결과: ${a} + ${b} = ${a + b}")
}

fun main1() {
    val a = 10; val b= 5
    println("덧셈: ${a + b}")
    println("뺄셈: ${a - b}")
    println("곱셈: ${a * b}")
    println("나눗셈: ${a / b}")
}