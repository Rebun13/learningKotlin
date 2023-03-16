import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val x = scanner.nextInt()
    println(if (x % 2 == 0) "EVEN" else "ODD")
}