object polynomials {

  class Poly(terms0: Map[Int, Double]) {
    def this(bindings: (Int, Double)*) = this(bindings.toMap)
    val terms: Map[Int, Double] = terms0.withDefaultValue(0.0)

    def +(other: Poly) = new Poly(terms ++ other.terms.map(adjust))

    def adjust(term: (Int, Double)): (Int, Double) = {
      val (exp, coeff) = term
      exp -> (coeff + terms(exp))
    }

    override def toString: String =
      (for ((exp, coeff) <- terms.toList.sorted.reverse) yield coeff + "x^" + exp).mkString(" + ")
  }


  val p1: Poly = new Poly(0 -> 2.0, 3 -> 4.0, 5 -> 6.2)
  val p2: Poly = new Poly(0 -> 3.0, 3 -> 7.0)

  p1 + p2
}