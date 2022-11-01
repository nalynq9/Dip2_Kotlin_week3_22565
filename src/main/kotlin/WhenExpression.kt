fun WhenExpression(){
    val extname = ".kt"
    when(extname){
        ".kt"-> println("Kotlin File")
        ".java"-> println("Java File")
        else-> println("Unknown")
    }
}

fun  WhenExpression2(){
    val country = "Thailand"
    when(country){
        "UK","USA","AUS","CANADA"-> println("English")
        "Vieatnam","Loa","Thailand"-> println("Suwannaphom")
        "China","Taiwan","Hong Kong"-> println("Chinese")
    }
}

fun WhenExpression3() {
    val device = "iPhone"
    val os = when (device) {
        "Oppo", "Vivo", "Sumsung" -> "Android"
        "iPhone" -> "ios"
        "iPad" -> "iPadOS"
        else -> "Unknown"
    }
    println(os)
}