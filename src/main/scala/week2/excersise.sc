object excersise {
  def factorial(x: Int): Int = {

    def innerFactorial(x: Int, result: Int): Int = {
      if (x == 0) {
        result
      } else {
        innerFactorial(x - 1, result * x)
      }
    }

    innerFactorial(x, 1)
  }

  factorial(5)
}