package example.scheduler

import akka.actor.ActorSystem

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

object SchedulerApp2 extends App {

  implicit val system = ActorSystem() // ActorMaterializer requires an implicit ActorSystem
  implicit val ec: ExecutionContext = ExecutionContext.global
  val scheduler = system.scheduler

  val jobs = List(
    "job 0",
    "job 1",
    "job 2",
    "job 3",
    "job 4",
    "job 5",
  )


  jobs
    .zip(Range.inclusive(0, 15 * (jobs.size - 1), 30))
    .foreach {
    case (job, initialDelay) =>
      scheduler.scheduleWithFixedDelay(initialDelay.seconds, 30.seconds)(() => {
        println(job)
        ()
      })

  }


  def sleep(time: Long): Unit = Thread.sleep(time)
}
