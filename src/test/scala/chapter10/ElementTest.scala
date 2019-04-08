package chapter10

import org.scalatest.FunSuite

class ElementTest extends FunSuite {

  test("ArrayElement") {
    val arrayElement = new ArrayElement(Array("hello", "world"))
    assert(arrayElement.height == 2)
    assert(arrayElement.width == 5)
  }

  test("LineElement") {
    val lineElement = new LineElement("hej")
    assert(lineElement.height == 1)
    assert(lineElement.width == 3)
  }

}
