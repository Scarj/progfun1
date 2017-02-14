package week3

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be non-zero")

  def this(x: Int) = this(x, 1)

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  val numerator: Int = x / gcd(x, y)
  val denominator: Int = y / gcd(x, y)

  def neg: Rational = new Rational(-this.numerator, this.denominator)

  def less(rational: Rational): Boolean = this.numerator * rational.denominator < rational.numerator * this.denominator

  def max(rational: Rational): Rational = if (this.less(rational)) rational else this

  def add(rational: Rational): Rational = {
    new Rational(this.numerator * rational.denominator + rational.numerator * this.denominator, this.denominator * rational.denominator)
  }

  def sub(rational: Rational): Rational = add(rational.neg)

  override def toString: String = this.numerator + "/" + this.denominator
}
