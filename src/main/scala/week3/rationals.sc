import week3.Rational

object rationals {

  def addRational(a: Rational, b: Rational): Rational = {
    new Rational(a.numerator * b.denominator + a.denominator * b.numerator, a.denominator * b.denominator)
  }

  def makeString(rational: Rational): String = {
    rational.numerator + "/" + rational.denominator
  }

  private val x = new Rational(1, 3)
  private val y = new Rational(5, 7)
  private val z = new Rational(3, 2)

  x.sub(y).sub(z)
  y.add(y)
  x.less(y)
  x.max(y)

  new Rational(2)
}


