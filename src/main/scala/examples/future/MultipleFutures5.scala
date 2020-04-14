package examples.future

import scala.async.Async.async
import scala.async.Async.await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object MultipleFutures5 extends App {

  val startTime = time

  def longRunningCalculation(i: Int) = Future {
    sleep(2000)
    i * 2
  }

  def longRunningUpperCase(s: String) = Future {
    sleep(100)
    s.toUpperCase
  }

  def twoLongRunningTasks() = async {

    val f1 = longRunningCalculation(10)
    val f2 = longRunningUpperCase("Patrik")
    println(s"\nentering `awaits`: $delta")
    val r1 = await { f1 }
    val r2 = await { f2 }

    println(s"\nresult = $r1 $r2  (delta = $delta)")
  }

  twoLongRunningTasks()

  // important for a little parallel demo: keep the jvm alive
  sleep(3000)

  def delta = System.currentTimeMillis - startTime
  def time = System.currentTimeMillis
  def sleep(time: Long): Unit = Thread.sleep(time)

}
