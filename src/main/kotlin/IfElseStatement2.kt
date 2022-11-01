fun IfElseStatement(){
    var balance = 30_00
    val withdraw = 2_500

    if (balance<withdraw){
        println("ยอดเงินคงเหลือไม่เพียงพอ")
    }else if (withdraw>20_00){
        println("ถอนเงินไม่เกิน 20_000 บาท")
    }else if (withdraw % 100 !=0){
        println("ต้องเป็นจำนวนเต็มร้อยเท่านั้น")
    }else{
        balance -= withdraw //balance = balance - withdraw
        print("ยอดเงินคงเหลือ: $balance บาท")
    }
}