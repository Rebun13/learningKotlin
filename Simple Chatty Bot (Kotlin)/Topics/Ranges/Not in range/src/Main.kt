import java.util.Scanner

fun main() {
    // write your code here
    val scanner = Scanner(System.`in`)
    val value = scanner.nextInt()
    print(value !in 1..10)
}