package chapter2

object ChapterTwoApp extends App {

  def greet() = println("Hello, world!")
  //greet()

  val myList = List("patrik", "linda", "niria", "stella")
  //myList.foreach(println)

  for(str <- myList)
    println(str)

}
