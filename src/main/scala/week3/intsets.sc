object intsets {

  val t1: IntSet = new NonEmpty(3, Empty, Empty)
  val t2: IntSet = new NonEmpty(4, Empty, Empty)
  val t3: IntSet = t2.union(t1)

  abstract class IntSet {
    def incl(x: Int): IntSet
    def contains(x: Int): Boolean
    def union(other: IntSet): IntSet
  }

  object Empty extends IntSet {
    override def contains(x: Int): Boolean = false
    override def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
    override def toString: String = "."
    override def union(other: IntSet): IntSet = other
  }

  class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

    override def contains(x: Int): Boolean = {
      if (x < elem) left.contains(x)
      else if (x > elem) right.contains(x)
      else true
    }

    override def incl(x: Int): IntSet = {
      if (x < elem) new NonEmpty(elem, left.incl(x), right)
      else if (x > elem) new NonEmpty(elem, left, right.incl(x))
      else this
    }

    override def toString: String = {
      "{" + left + elem + right + "}"
    }

    override def union(other: IntSet): IntSet = {
      left.union(right).union(other).incl(elem)
    }
  }

}