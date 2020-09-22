package example.scheduler

import akka.actor.ActorSystem

import scala.concurrent.duration._
import scala.concurrent.ExecutionContext

object SchedulerApp3 extends App {

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

  scheduler.scheduleWithFixedDelay(0.seconds, 15.seconds)(() => {
    jobs.foreach {
      job => {
        scheduler.scheduleOnce(10.seconds)(println(job))
      }
    }
  })

  //  scheduler.scheduleOnce(5.seconds)(println("hej"))

  //  scheduler.scheduleWithFixedDelay(0.seconds, 30.seconds)(() => {
  //    jobs.foreach(scheduler.scheduleOnce(0.seconds)(println(_)))
  //    ()
  //  })

  def sleep(time: Long): Unit = Thread.sleep(time)
}
