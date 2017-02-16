import week4.{Cons, Nil, List}

object intList {
  val cons = new Cons(0, new Cons(1, new Cons(2, new Cons(3, Nil))))
  cons.nth(0)

  val apply: List[Int] = List.apply(1,2)
  val empty:List[String] = List.apply()
}