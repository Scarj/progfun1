package week4

import java.util.NoSuchElementException

trait List[T] {
  def head: T

  def tail: List[T]

  def isEmpty: Boolean

  def nth(n: Int): T
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  override def isEmpty: Boolean = false

  override def nth(n: Int): T = {
    def loop(i: Int, list: List[T]): T = {
      if (list.isEmpty) throw new IndexOutOfBoundsException("index out of bound: " + n)
      else if (i == n) list.head
      else loop(i + 1, list.tail)
    }

    loop(0, this)
  }
}

class Nil[T] extends List[T] {
  override def isEmpty: Boolean = true
  override def head: Nothing = throw new NoSuchElementException("Nil.head")
  override def tail: Nothing = throw new NoSuchElementException("Nil.tail")
  override def nth(n: Int): Nothing = throw new NoSuchElementException("Nil.nth(" + n + ")")
}

object List {
  def singleton(elem: Any) = new Cons(elem, new Nil)
}

