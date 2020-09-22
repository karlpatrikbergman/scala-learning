package example.scheduler

import java.time.Duration

import akka.actor.ActorSystem

import scala.concurrent.ExecutionContext

object SchedulerApp extends App {

  implicit val system = ActorSystem()  // ActorMaterializer requires an implicit ActorSystem
  implicit val ec: ExecutionContext = ExecutionContext.global

  val scheduler = system.scheduler
  val initialDelay: Duration = Duration.ofSeconds(2)
  val delay: Duration = Duration.ofSeconds(2)
  val runnable0: Runnable = () => { sleep(4000); println("tjoho from runnable 0") }
  val runnable1: Runnable = () => { sleep(4000); println("tjoho from runnable 1") }

  scheduler.scheduleWithFixedDelay(initialDelay, delay, runnable0, ec)
  scheduler.scheduleWithFixedDelay(initialDelay, delay, runnable1, ec)

  scheduler.scheduleWithFixedDelay(
    initialDelay,
    delay,
    () => { sleep(4000) },
    ec
  )

  def sleep(time: Long): Unit = Thread.sleep(time)
}
