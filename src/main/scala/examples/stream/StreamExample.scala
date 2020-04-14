package examples.stream

import akka.actor.ActorSystem
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.Sink
import akka.stream.scaladsl.Source

import scala.async.Async.async
import scala.async.Async.await
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object StreamExample extends App {
  implicit val actorSystem = ActorSystem()

  def run() = async {
    val resultFuture: Future[Seq[String]] = Source(1 to 10)
      .via(Flow[Int].mapAsync(2)((i: Int) => Future(i.toString+" monkey")))
      .runWith(Sink.seq)

    val result = await {
      resultFuture
    }
    println(result)
  }

  run()
}
