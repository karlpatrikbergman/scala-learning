package chapter10

import org.scalatest.FunSuite

class ElementTest extends FunSuite {

  test("ArrayElement") {
    val arrayElement = new ArrayElement(Array("hello", "world"))
    assert(arrayElement.height == 2)
    assert(arrayElement.width == 5)
  }

  test("LineElement") {
    val lineElement = new LineElementOld("hej")
    assert(lineElement.height == 1)
    assert(lineElement.width == 3)
  }

  test("foo") {
    val element1 = new ArrayElement(Array("e1-line1", "e1-line2", "e1-line3", "é1-line4"))
    println(s"element1.width: ${element1.width}")
    println(s"element1.height: ${element1.height}")

    val element2 = new ArrayElement(Array("e2-line1", "e2-line2", "e1-line3", "e2-line4"))
    println(s"element2.width: ${element2.width}")
    println(s"element2.height: ${element2.height}")

    val element3 = element1 above element2
    println(s"element3.width: ${element3.width}")
    println(s"element3.height: ${element3.height}")
  }

}
