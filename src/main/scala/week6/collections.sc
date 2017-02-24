object collections {

  val xs = Array(1, 2, 3, 44)
  val ds: Vector[Double] = Vector(1.0, 2.0, 3.0, 44.0)
  xs map (x => x * 2)
  xs.sum
  xs.max

  val s = "Hello world"
  s filter (c => c.isUpper)

  val zipped: Array[(Int, Char)] = xs zip s
  val (ints, chars) = zipped.unzip
  s flatMap (c => List(c, '.'))

  val rR: Range = 1 until 5
  val sR: Range = 1 to 5
  val range: Range = 1 to 10 by 3
  range.foreach(print)

  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double = {
    xs.zip(ys).map(xy => xy._1 * xy._2).sum
  }

  def scalarProduct2(xs: Vector[Double], ys: Vector[Double]): Double = {
    xs.zip(ys).map { case (x, y) => x * y }.sum
  }

  def scalarProduct3(xs: Vector[Double], ys: Vector[Double]): Double = {
    (for ((x, y) <- xs zip ys) yield x * y).sum
  }


  scalarProduct3(ds,ds)

  def isPrime(n: Int): Boolean = {
    (2 until n) forall (d => n % d != 0)
  }

}