package chapter6

import org.scalatest.FunSuite

class RationalTest extends FunSuite {

  test("Adding Rational 1/2 to Rational 2/3 should result in 7/6") {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    assert(oneHalf + twoThirds == new Rational(7,6))
  }

  test("Adding 5 to 1/2 should result in 11/2") {
    val oneHalf = new Rational(1,2)
    assert(oneHalf + 5 == new Rational(11, 2))
  }

  test("Should calculate lessThan correctly") {
    val half = new Rational(1,2)
    val twoThirds = new Rational(2,3)
    assert(half.lessThan(twoThirds))
  }

  test("Retrieving max value out of 1/2 and 2/3 should return ...") {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    assert(oneHalf.max(twoThirds) == twoThirds)
  }

  test("Given nominator and denominator not in normalized form should result in normalized Rational") {
    assert(new Rational(5, 10) == new Rational(1, 2))
  }

  test("Multiplying 1/2 with 2/3 should result in") {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    assert(oneHalf * twoThirds == new Rational(2, 6))
  }

  test("Multiplying 1/2 with 5 should result in 5/2") {
    val oneHalf = new Rational(1, 2)
    assert(oneHalf * 5 == new Rational(5, 2))
  }

  test("Subtracting 1/2 from 2/3 should result in -1/6") {
    val oneHalf = new Rational(1, 2)
    val twoThirds = new Rational(2, 3)
    assert(oneHalf - twoThirds == new Rational(-1, 6))
   }

  test("Subtracting 5 from 1/2 should result in -9/2") {
    val oneHalf = new Rational(1, 2)
    assert(oneHalf - 5 == new Rational(-9, 2))
  }

  //TODO: Add divide Rationals test
  //TODO: Add divide Rational by integer test
}
