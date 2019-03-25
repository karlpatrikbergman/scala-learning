//package chapter6
//
//import org.scalatest.FunSuite
//
//class RationalTest extends FunSuite {
//
//  test("Adding Rational 1/2 to Rational 2/3 should result in 7/6") {
//    val oneHalf = new Rational(1, 2)
//    val twoThirds = new Rational(2, 3)
//    val result = oneHalf + twoThirds
//    //assert(result == new Rational(7,6)) //TODO: override equals method
//    println(s"1/2 + 2/3 equals $result")
//  }
//
//  test("Adding 5 to 1/2 should result in 11/2") {
//    val oneHalf = new Rational(1,2)
//    val result = oneHalf + 5
//    println(s"1/2 + 5 = $result")
//  }
//
//  test("Retrieving max value out of 1/2 and 2/3 should return ...") {
//    val oneHalf = new Rational(1, 2)
//    val twoThirds = new Rational(2, 3)
//    val result = oneHalf.max(twoThirds)
//    assert(twoThirds == result)
//  }
//
//  test("Given nominator and denominator not in normalized form should result in normalized Rational") {
//    val result = new Rational(5, 10)
//    println(s"5/10 in normalized form is $result") //TODO: Replace with assert using equals
//  }
//
//  test("Multiplying 1/2 with 2/3 should result in") {
//    val oneHalf = new Rational(1, 2)
//    val twoThirds = new Rational(2, 3)
//    val result = oneHalf * twoThirds
//    println(s"1/2 * 2/3 = $result") //TODO: Replace with assert using equals
//  }
//
//  //TODO: Add test verifying (build in) operator precedence
//
//  test("Multiplying 1/2 with 5 should result in 5/2") {
//    val oneHalf = new Rational(1, 2)
//    val result = oneHalf * 5
//    println(s"1/2 * 5 = $result")
//  }
//
//  test("Subtracting 1/2 from 2/3 should result in -1/6") {
//    val oneHalf = new Rational(1, 2)
//    val twoThirds = new Rational(2, 3)
//    val result = oneHalf - twoThirds
//    println(s"1/2 - 2/3 equals $result ") //TODO: Replace with assert using equals
//   }
//
//  test("Subtracting 5 from 1/2 should result in -9/2") {
//    val oneHalf = new Rational(1, 2)
//    val result = oneHalf - 5
//    println(s"1/2 - 5 = $result") //TODO: Replace with assert using equals
//  }
//
//  //TODO: Add
//  //TODO: Add divide Rationals test
//  //TODO: Add divide Rational by integer test
//}
