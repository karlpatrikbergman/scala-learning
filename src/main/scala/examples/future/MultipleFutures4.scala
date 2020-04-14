package examples.future

import scala.async.Async.async
import scala.async.Async.await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object MultipleFutures4 extends App {

  val startTime = time

  def longRunningCalculation(i: Int) = Future {
    sleep(1000)
    i * 2
  }

  def longRunningUpperCase(s: String) = Future {
    sleep(700)
    s.toUpperCase
  }

  def twoLongRunningTasks() = async {

    val f1 = longRunningCalculation(10)
    val f2 = longRunningUpperCase("Patrik")
    println(s"\nentering `for`: $delta")
    val result = await {
      for {
        r1 <- f1
        r2 <- f2
      } yield (r1, r2)
    }
    println(s"\nresult = $result (delta = $delta)")
  }

  twoLongRunningTasks()

  // important for a little parallel demo: keep the jvm alive
  sleep(3000)

  def delta = System.currentTimeMillis - startTime
  def time = System.currentTimeMillis
  def sleep(time: Long): Unit = Thread.sleep(time)

}
