fun IfElseExpression(){
    val number = -50
    val result = if (number>0){
        println("Positive number")
    }else{
        println("Negative number")
    }
}

fun IfElseExpression2(){
    val remain = 1
    val result = if(remain>0) "มีสินค้า"
    else "สินค้าหมด"
    println(result)
}

fun IfElseExpression3() {
    val number = 100

    val result = if(number<0) "Negative number"
    else if (number in 0..9) "Single digit number"
    else if (number in 10..99) "Double digit number"
    else "number has more digits"
    println(result)
}