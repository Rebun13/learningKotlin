fun main() {
    // put your code here
    val inputNumber = readln().toUInt()
    val tens = inputNumber - inputNumber % 10u
    print((tens % 100u)/10u)
}