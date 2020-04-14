package examples.stream

import akka.NotUsed
import akka.actor.ActorSystem
import akka.stream.scaladsl._
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

case class UserID(id: String)

object StudentDetails extends App {
  implicit val actorSystem = ActorSystem()

  val userIDSource: Source[UserID, NotUsed] = Source(List(UserID("id1")))

  val maxLookupCount = 10
  val maxLookupConcurrentStream =
    userIDSource.via(Flow[UserID].mapAsync(maxLookupCount)(concurrentDBLookup))
      .to(Sink.foreach(println))
      .run()

  def concurrentDBLookup(userID: UserID): Future[String] = Future {
    getFromDatabase(userID)
  }

  def getFromDatabase(userID: UserID): String = {
    userID.id match {
      case "id1" => "piyush"
      case "id2" => "girish"
      case "id3" => "vidisha"
      case _ => "anuj"
    }
  }
}
