import week3.{Empty, IntSet, NonEmpty}

object intsets {

  val t1: IntSet = new NonEmpty(3, Empty, Empty)
  val t2: IntSet = new NonEmpty(4, Empty, Empty)
  val t3: IntSet = t2.union(t1)



  val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty))
  // val b: Array[IntSet] = a //Exception

}