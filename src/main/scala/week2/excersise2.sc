object excersise2 {

  def sum(f: Int => Int, a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum(f, a + 1, b)
  }

  def sum4(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum4(f)(a + 1, b)
  }

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)

  def sumInts2(a: Int, b: Int): Int = sum(x => x, a, b)

  def sumCubes(a: Int, b: Int): Int = sum(cube, a, b)

  def sumCubes2(a: Int, b: Int): Int = sum(x => x * x * x, a, b)

  def sumFact(a: Int, b: Int): Int = sum(fact, a, b)

  def id(x: Int): Int = x

  def cube(x: Int): Int = x * x * x

  def fact(x: Int): Int = {
    def loop(x: Int, result: Int): Int = {
      if (x == 0) result else loop(x - 1, result * x)
    }

    loop(x, 1)
  }

  def sum2(f: Int => Int, a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }

    loop(a, 0)
  }

  def sum3(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      if (a > b) 0
      else f(a) + sumF(a + 1, b)
    }

    sumF
  }

  def sum3Ints: (Int, Int) => Int = sum3(x => x)

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  }

  def fact2(x: Int): Int = product(x => x)(1, x)

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int = {
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }

  def product2(f: Int => Int): (Int, Int) => Int = mapReduce(f, (a, b) => a * b, 1)
}