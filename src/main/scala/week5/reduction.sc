object reduction {

  def sum(xs: List[Int]): Int = {
    (0 :: xs) reduceLeft (_ + _)
  }

  def product(xs: List[Int]): Int = {
    (1 :: xs) reduceLeft (_ * _)
  }

  def sum2(xs: List[Int]): Int = {
    xs.sum
  }

  def concat[T](xs: List[T], ys: List[T]): List[T] = {
    xs.foldRight(ys)(_ :: _)
  }

  def mapFun[T, U](xs: List[T], f: T => U): List[U] = {
    xs.foldRight(List[U]())((x, y) => f(x) :: y)
  }


  def lengthFun[T](xs: List[T]): Int = {
    xs.foldRight(0)((_, y) => y + 1)
  }


  val list: List[Int] = List(1, 2, 3, 4, 5)
  val list2: List[Int] = List(6, 7, 8, 9, 10)

  def function: (Int) => Int = x => x * 2

  val fun: List[Int] = mapFun(list, function)

}