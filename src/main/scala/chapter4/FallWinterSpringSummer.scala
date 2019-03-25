package chapter4

object FallWinterSpringSummer extends App {
  for(season <- List("Fall", "Winter", "Spring", "Summer"))
    println(s"Season ", ChecksumAccumulator.calculate(season))
}
