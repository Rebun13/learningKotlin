import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()
    var A = 0
    var B = 0
    var C = 0
    var D = 0
    repeat(count) {
        val currentValue = scanner.nextInt()
        if (currentValue == 2)
            D++
        else if (currentValue == 3)
            C++
        else if (currentValue == 4)
            B++
        else if (currentValue == 5)
            A++
    }
    print("$D $C $B $A")
}