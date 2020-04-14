package examples.future

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.Failure
import scala.util.Success

object MultipleFutures3 extends App {

  val startTime = time

  // Future #1
  println(s"creating f1:  $delta")
  val f1 = longRunningCalculation(10)

  // Future #2
  Thread.sleep(100)
  println(s"\ncreating f2:  $delta")
  val f2 = longRunningUpperCase("Patrik")

  println(s"\nentering `for`: $delta")
  val result = for {
    r1 <- f1
    r2 <- f2
  } yield (r1, r2)

  println("\nBEFORE onComplete")
  result.onComplete {
    case Success(x) => {
      println(s"\nresult = $x (delta = $delta)")
      println("note that you don't get the result until the last future completes")
    }
    case Failure(e) => e.printStackTrace
  }
  println("AFTER onComplete\n")

  // important for a little parallel demo: keep the jvm alive
  sleep(3000)

  def longRunningCalculation(i: Int) = Future {
    sleep(1000)
    i * 2
  }

  def longRunningUpperCase(s: String) = Future {
    sleep(700)
    s.toUpperCase
  }

  def delta = System.currentTimeMillis - startTime
  def time = System.currentTimeMillis
  def sleep(time: Long): Unit = Thread.sleep(time)

}
