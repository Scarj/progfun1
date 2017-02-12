object rationals {

  def addRational(a: Rational, b: Rational): Rational = {
    new Rational(a.numer * b.denom + a.denom * b.numer, a.denom * b.denom)
  }

  def makeString(rational: Rational): String = {
    rational.numer + "/" + rational.denom
  }

  private val x = new Rational(1, 3)
  private val y = new Rational(5, 7)
  private val z = new Rational(3, 2)

  x.sub(y).sub(z)
  y.add(y)
  x.less(y)
  x.max(y)

  new Rational(2)


  class Rational(x: Int, y: Int) {
    require(y != 0, "denominator must be non-zero")

    def this(x: Int) = this(x, 1)

    def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    val numer: Int = x / gcd(x, y)
    val denom: Int = y / gcd(x, y)

    def neg: Rational = new Rational(-this.numer, this.denom)

    def less(rational: Rational): Boolean = this.numer * rational.denom < rational.numer * this.denom

    def max(rational: Rational): Rational = if(this.less(rational)) rational else this

    def add(rational: Rational): Rational = {
      new Rational(this.numer * rational.denom + rational.numer * this.denom, this.denom * rational.denom)
    }

    def sub(rational: Rational): Rational = add(rational.neg)


    override def toString: String = this.numer + "/" + this.denom
  }

}


