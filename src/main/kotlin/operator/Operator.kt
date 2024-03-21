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

    /* 1. 복합 대입 연산자
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
}