fun main(args: Array<String>) {
    println("Hello World!")
    println("Program arguments: ${args.joinToString()}")

    Lesson1p2_OperatorsAndTypes()
    Lesson1p3_Conditions()
    Lesson1p4_Nullability()
    Lesson1p5_ArraysLoops()

    println("\n--- Kết thúc Lab 1.2 ---")
}

fun Lesson1p2_OperatorsAndTypes() {
    println("\n## Phần 2: Toán tử và Kiểu dữ liệu")
    println("1 + 1 = ${1 + 1}")
    println("53 - 3 = ${53 - 3}")
    println("50 / 10 = ${50 / 10}")
    println("1.0 / 2.0 = ${1.0 / 2.0}")
    println("6.0 * 50 = ${6.0 * 50}")
    println("----------------------------------")

    // Gọi phương thức trên số
    println("2.times(3) = ${2.times(3)}")
    println("3.5.plus(4) = ${3.5.plus(4)}")
    println("2.4.div(2) = ${2.4.div(2)}")
    println("----------------------------------")

    // Ép kiểu
    val i: Int = 6
    val b1 = i.toByte()
    println("Ép kiểu Int ($i) sang Byte: $b1")
    val b2: Byte = 1
    // val i1: Int = b2 // Lỗi: không thể gán Byte cho Int
    val i4: Int = b2.toInt() // OK: Phải ép kiểu tường minh
    println("Ép kiểu Byte ($b2) sang Int: $i4")
    println("----------------------------------")

    // Biến var và val
    var fish = 1
    fish = 2
    val aquarium = 1
    println("Biến var 'fish' đã thay đổi giá trị: $fish")
    println("Biến val 'aquarium' là bất biến: $aquarium")
    println("----------------------------------")

    // String templates
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish and $numberOfPlants plants")
    println("I have ${numberOfFish + numberOfPlants} total items")
}

fun Lesson1p3_Conditions() {
    println("\n## Phần 3: Điều kiện và Booleans")
    // Case 1: if/else cơ bản
    val numberOfFish = 50
    val numberOfPlants = 23
    print("Case 1 - if/else: ")
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    // Case 2: if với range
    val fish = 50
    print("Case 2 - if với range: ")
    if (fish in 1..100) {
        println("fish ($fish) is in range 1..100")
    }

    // Case 3: if/else if/else
    print("Case 3 - if/else if/else: ")
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    // Case 4: when statement
    print("Case 4 - when: ")
    when (numberOfFish) {
        0 -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }
}

fun Lesson1p4_Nullability() {
    println("\n## Phần 4: Nullability")
    // var rocks: Int = null // Lỗi
    var marbles: Int? = null
    println("Biến nullable 'marbles' có thể giữ giá trị: $marbles")
    println("----------------------------------")

    // Safe call ?.
    var fishFoodTreats: Int? = 6
    fishFoodTreats = fishFoodTreats?.dec()
    println("Dùng safe call '?.' để giảm giá trị: $fishFoodTreats")

    // Elvis operator ?:
    fishFoodTreats = null
    val treats = fishFoodTreats?.dec() ?: 0
    println("Dùng elvis operator '?:' khi biến là null: $treats")
}

fun Lesson1p5_ArraysLoops() {
    println("\n## Phần 5: Mảng, List, và Vòng lặp")
    val school = listOf("mackerel", "trout", "halibut")
    println("listOf (bất biến): $school")

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println("mutableListOf (có thể thay đổi): $myList")
    println("----------------------------------")

    // Thao tác XÓA phần tử
    myList.remove("shark")
    println("List sau khi xóa 'shark': $myList")

    // Thao tác THÊM phần tử
    myList.add("shark")
    println("List sau khi thêm 'shark': $myList")
    println("----------------------------------")

    val schoolArray = arrayOf("shark", "salmon", "minnow")
    println("Vòng lặp for:")
    for (element in schoolArray) {
        print("$element ")
    }
    println()

    println("Vòng lặp for với index:")
    for ((index, element) in schoolArray.withIndex()) {
        println("Item at $index is $element")
    }
    println("----------------------------------")

    println("Các loại vòng lặp for khác:")
    print("Range 1..5: ")
    for (i in 1..5) print(i)
    println()

    print("Range 5 downTo 1: ")
    for (i in 5 downTo 1) print(i)
    println()

    print("Range 3..6 step 2: ")
    for (i in 3..6 step 2) print(i)
    println()

    print("Range 'd'..'g': ")
    for (i in 'd'..'g') print (i)
    println()
}