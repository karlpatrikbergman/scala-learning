package chapter8

import org.scalatest.FunSuite

class LongLinesTest extends FunSuite {

  test("") {
    val longLines = LongLines.processFile("/home/pabe/dev/scala-learning/src/main/scala/chapter8/LongLines.scala", 45)
    longLines.foreach(println)
  }

}
