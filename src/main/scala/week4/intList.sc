object intList {
  val cons = new Cons(0, new Cons(1, new Cons(2, new Cons(3, new Nil))))
  cons.nth(4)
}