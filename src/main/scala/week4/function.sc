object function {

  trait Function1[A, B] {
    def apply(x: A): B
  }

  def f1 = new Function1[Int, Int] {
    override def apply(x: Int): Int = x * x
  }

  f1.apply(2)
  f1.apply(7)

  def intToInt = (x:Int) => f1(x)

   intToInt(4)



}