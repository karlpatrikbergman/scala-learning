package chapter32

import org.scalatest.FunSuite

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

class FooTest extends FunSuite {

  test("Understanding Scala Future") {

    val fut = Future {
      Thread.sleep(10000); 21 +21
      println("hej")
    }
    println(fut.isCompleted)
  }


}
