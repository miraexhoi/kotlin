class Test {

    // ? vs !!

    val name :String? = "name" // null 일수도 있는 변수에 "name" 할당

    val name2 :String = name // error, name 은 null 일 수 있기에 에러 발생

    val name3 :String? = name // ok, name3 도 nullable 한 변수이기에 할당 가능

    val name4 :String = name!! // ok, name!! 으로 name 이 null 이 아님을 보증

}
