import week4.expressions._

object expr {

  val expr: Expr = Sum(Prod(Number(2), Var("x")), Var("y"))
  expr.show(expr)

  val expr2:Expr = Prod(Sum(Number(2), Var("x")), Var("y"))
  expr.show(expr2)
}