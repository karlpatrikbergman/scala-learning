package chapter6

import org.scalatest.FunSuite

class RationalTest2 extends FunSuite {

  test("Should add correctly") {
    val half = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    assert(half.add(twoThirds) == new Rational(7,6))
  }

  test("Should calculate lessThan correctly") {
    val half = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    assert(half.lessThan(twoThirds))
  }

  test("Should return max") {
    val half = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    assert(half.max(twoThirds) == twoThirds)
  }

  test("Auxiliary constructor") {
    assert(new Rational(5) == new Rational(5,1))
  }

  test("Should multiply correctly") {
    val half = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    assert(half.multiply(twoThirds) == new Rational(1,3))
  }
}
