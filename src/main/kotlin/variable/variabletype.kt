package variable

// var/var1 변수명: 변수타입 = 초기화값

fun main() {
    // 정수형 (Integer)
    val one: Int = 1
    val threeBillion: Long = 3000000000
    val oneLong = 1L
    /* => val oneLong: Long = 1 */
    val oneByte: Byte = 1
    val threeBillionUnderBar: Long = 3_000_000_000

    // 실수형 (Float types)
    val pi = 3.1415
    val e = 2.3443545
    val eFloat: Float = 2.71823988912f
    /* 반드시 뒤에 f를 추가해주기 */

    // Boolean
    val isAlive: Boolean = false

    // String
    // 문자열 사이 변수를 선언
    val name: String = "Mirae Choi"
    val age: Int = 18
    val result: String = "My name is ${name} and I'm ${age} years old."
    print(result)
}