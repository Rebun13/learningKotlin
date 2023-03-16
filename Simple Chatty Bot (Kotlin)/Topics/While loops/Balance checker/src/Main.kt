import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    var enoughMoney = true
    while (scanner.hasNextInt()) {
        val payment = scanner.nextInt()
        if (payment > balance) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $payment.")
            enoughMoney = false
            break
        } else {
            balance -= payment
        }
    }
    if(enoughMoney)
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
}