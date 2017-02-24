object pairs {

  def isPrime(n: Int): Boolean = {
    (2 until n) forall (d => n % d != 0)
  }

  var n = 7

  (1 until n).flatMap(i =>
    (1 until i) map (j =>
      (i, j))).filter { case (x, y) => isPrime(x + y) }


  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)
}