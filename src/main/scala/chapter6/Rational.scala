package chapter6

class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  val numerator: Int = n / g
  val denominator: Int = d /g

  def this(n:Int) = this(n,1)

  def add(that: Rational): Rational = {
    new Rational(
      this.numerator * that.denominator + that.numerator * this.denominator,
      this.denominator * that.denominator
    )
  }

 def multiply(that: Rational) : Rational = {
   new Rational(numerator * that.numerator, denominator * that.denominator)
 }

  def lessThan(that: Rational): Boolean = {
    this.numerator * that.denominator < that.numerator * this.denominator
  }

  def max(that: Rational): Rational = {
    if(this.lessThan(that)) that else this
  }

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def toString() = numerator + "/" + denominator

  override def equals(that: Any): Boolean = {
    that.isInstanceOf[Rational] &&
      this.numerator == that.asInstanceOf[Rational].numerator &&
        this.denominator == that.asInstanceOf[Rational].denominator
  }
}

