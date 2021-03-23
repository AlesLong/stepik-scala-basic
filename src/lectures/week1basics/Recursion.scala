package lectures.week1basics

import scala.annotation.tailrec

object Recursion extends App {
  def factorial(n: Long): Long = {
    if (n <= 0) 1
    else n * factorial(n - 1)
  }

  println(factorial(3)) // выводит 6


  def factorial1(n: Int): Int = {
    if (n <= 0) 1
    else {
      println(s"Имеем число $n, для которого считаем факториал ${n - 1}")
      var res = n * factorial1(n - 1)
      println(s"Вычислили факториал $n")

      res
    }
  }

  factorial1(3)


  def factorialWithTailRecursion(n: Int): Int = {
    def loop(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else loop(x-1, x * accumulator)
    }

    loop(n, 1)
  }
  println(factorialWithTailRecursion(5))


  def factorialWithTailRecursion1(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x-1, x*accumulator)
    }

    loop(n)
  }

  println(factorialWithTailRecursion1(6))


  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }

    loop(n)
  }
  print(repeatWord("Yevbes",5))
}
