package chapter32

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


object FutureApp extends App {




  val fut = Future {
    Thread.sleep(5000)
    println("hej")
  }

  val res = Await.result(fut, 6000 millis);
  println(res.toString)

}
