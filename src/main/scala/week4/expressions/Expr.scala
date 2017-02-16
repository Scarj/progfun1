package week4.expressions

trait Expr {
  def eval(expr: Expr): Int = {
    expr match {
      case Number(n) => n
      case Sum(e1, e2) => eval(e1) + eval(e2)
    }
  }

  def show(e: Expr): String = {
    e match {
      case Number(n) => "" + n
      case Prod(Sum(s1, s2), p2) => "(" + show(Sum(s1, s2)) + ") * " + show(p2)
      case Prod(e1,e2) => show(e1) + " * " + show(e2)
      case Sum(e1, e2) => show(e1) + " + " + show(e2)
      case Var(name) => name
    }
  }
}
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
case class Number(n: Int) extends Expr
case class Var(name: String) extends Expr
