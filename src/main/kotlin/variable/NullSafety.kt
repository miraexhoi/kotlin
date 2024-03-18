package variable

// var/var1 변수명: 변수타입 = 초기화값

fun main() {
    var name: String = "Mirae Choi"
    /*
    * name = null
    * -> non-null type string 으로 선언했기 때문에 null 값 주입 불가
    * */
    var nullableName: String? = "Mirae Choi"
    /* nullable 선업 방법: 변수 타입 뒤에다가 [?] 붙이기 */
    val score: Int? = null

    name.length // 3
    /* nullableName.length */

    // 1. 조건문을 통해 Null 확인하기
    if (nullableName != null) {
        println(nullableName.length)
    }
    // 2. ? 연산자를 통해 안전하게 호출
    println(nullableName?.length)
    // 3. ?: 엘비스 연산자
    val length = nullableName?.length ?: 0
    println(length)
    // 4. !!
    println(nullableName!!.length)



}