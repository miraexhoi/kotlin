package operator

fun main() {
    /* 1. 산술 연산자
     * +,-,*,/,&
     * */

    var a: Int = 3
    var b: Int = 2

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)

    /* 2. 복합 대입 연산자
     * +=,-=,*=,/=,&
     * */

    var c: Int = 11
    c += 3
    println("c = $c")
    c -= 3
    println("c = $c")
    c *= 3
    println("c = $c")
    c /= 3
    println("c = $c")
    c %= 3
    println("c = $c")

    /* 3. 증감 연산자
     * ++, --
     * */

    var value:Int = 10
    value++
    println("value = $value")
    value--
    println("value = $value")

    /* 4. 비교 연산자
     * <, <=, >, >=, ==, !=
     * */

    var d: Int = 3
    var e: Int = 3

    println(a < b)
    println(a <= b)
    println(a > b)
    println(a >= b)
    println(a == b)
    println(a != b)

    /* 5. 논리 연산자
     * ||(OR 연산자), &&(AND 연산자), !(NOT 연산자)
     * */

    println(true || true)
    println(false || true)
    println(true || false)
    println(false || false)

    println(true && true)
    println(false && true)
    println(true && false)
    println(false && false)

    println(!true)
    println(!false)
}