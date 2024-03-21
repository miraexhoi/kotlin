package operator

fun main() {
    /** 주어진 세 과목의 평균을 출력하세요. */
    var math: Int = 78
    var korean: Int = 88
    var english: Int = 89

    val total = math+korean+english
    val average = total / 3
    println("average = $average")

    /**
     * - 세 과목의 점수를 제공.
     * - 60점 미만이면 fail
     * - 세 과목 중 하나라도 60점 미만이면 fail
     * - pass 인지 fail 인지 결과 출력
     */

    var mathscore: Int = 60
    var koreanscore: Int = 50
    var englishscore: Int = 90

    val mathResult: Boolean = mathscore >= 60
    val koreanResult: Boolean = koreanscore >= 60
    val englishResult: Boolean = englishscore >= 60

    val result = mathResult && koreanResult && englishResult
    println("result = $result")

}