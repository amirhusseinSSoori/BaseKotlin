package com.amirhusseinsoori.kotlinBase.functions.lambda

class Lambda {
    val upperCase: (String) -> String = { str: String -> str.uppercase() }
    val upperCase1 = { str: String -> str.uppercase() }
    val upperCase2: (String) -> String = { it.uppercase() }
}

fun main() {
    select(SelectLambda.MODEL1)
}

fun select(select: SelectLambda) {
    val lambda = Lambda()
    when (select) {
        SelectLambda.MODEL1 -> {
            print(lambda.upperCase("hello"))
        }
        SelectLambda.ModeL2 -> {
            print(lambda.upperCase1("hello"))
        }
        SelectLambda.ModeL3 -> {
            print(lambda.upperCase2("hello"))
        }
    }

}


enum class SelectLambda {
    MODEL1,
    ModeL2,
    ModeL3
}