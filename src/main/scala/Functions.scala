import smile.math.{Math, beta, digamma, erf, gamma, lgamma}

import scala.util.Random

object Functions extends App {
  val number = Random.nextDouble() * Random.nextInt(50)
  val numbers = Array.fill(10)(Random.nextInt(50))

  println(s"Number: $number")

  // Traditional functions
  println("--- Traditional functions ---")
  println(s"log: ${Math.log(number)}")
  println(s"abs: ${Math.abs(number)}")
  println(s"exp: ${Math.exp(number)}")

  println(s"Numbers: ${numbers.mkString(", ")}")
  println(s"max: ${Math.max(numbers)}")
  println(s"min: ${Math.min(numbers)}")

  // Statistical functions
  println("--- Statistical functions ---")
  println(s"mean: ${Math.mean(numbers)}")
  println(s"median: ${Math.median(numbers)}")
  println(s"var: ${Math.`var`(numbers)}")
  println(s"sd: ${Math.sd(numbers)}")

  // Special functions
  println("--- Special functions ---")
  println(s"factorial(12): ${Math.factorial(12)}")
  println(s"choose(10, 3): ${Math.choose(10, 3)}")
  println(s"logistic: ${Math.logistic(number)}")
  println(s"digamma: ${digamma(number)}")
  println(s"erf: ${erf(number)}")
  println(s"lgamma: ${lgamma(number)}")
  println(s"gamma: ${gamma(number)}")
  println(s"beta: ${beta(numbers(0), numbers(1))}")
}
