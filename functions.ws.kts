// 1. Ecrire une fonction qui affiche les x premiers nombres pairs ou impairs

fun displayEvenOrOddNumbers(x: Int, even: Boolean = true) {
    var count = 0
    var number = 0
    while (count < x) {
        when (even) {
            true -> if (number % 2 == 0) {
                println(number)
                count++
            }
            false -> if (number % 2 != 0) {
                println(number)
                count++
            }
        }
        number++
    }
}

// 2. Ecrire une fonction qui affiche les x premiers nombres de la suite Fibonacci

fun displayFibonacci(x: Int) {
    var first = 0
    var second = 1
    var count = 0
    while (count < x) {
        println(first)
        val next = first + second
        first = second
        second = next
        count++
    }
}

// 3. Ecrire une fonction qui calcule le factoriel d’un nombre x, utiliser 10 par défaut si aucun nombre n’est spécifié.

fun factorial(x: Int): Long {
    return when {
        x < 0 -> error("Factorial not defined for negative numbers")
        x == 0 || x == 1 -> 1L
        else -> {
            var result: Long = 1
            for (i in 1..x) {
                result *= i
            }
            result
        }
    }
}

// 4. Ecrire une fonction qui affiche les x premiers nombres premiers

fun displayPrimes(x: Int) {
    var count = 0
    var number = 2
    while (count < x) {
        if (isPrime(number)) {
            println(number)
            count++
        }
        number++
    }
}

fun isPrime(num: Int): Boolean {
    return when {
        num < 2 -> false
        else -> {
            for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
                if (num % i == 0) return false
            }
            true
        }
    }
}

val evenOrOddNumberNumber = 5
val fibonacciNumber = 10
val factorialWanted = 6
val primesNumber = 10

displayEvenOrOddNumbers(evenOrOddNumberNumber, true) // Display even numbers

displayEvenOrOddNumbers(evenOrOddNumberNumber, false) // Display odd numbers

displayFibonacci(fibonacciNumber) // Display Fibonacci numbers

println("Factorial of $factorialWanted is: ${factorial(factorialWanted)}")

displayPrimes(primesNumber) // Display prime numbers