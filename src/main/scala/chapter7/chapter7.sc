/**
  * Almost all of Scalas control structures result in a value
  * This makes it possible to skip temporary variables, and us val instead
  * of var
  *
  * Another benefit is that is better supports equal reasoning; the intro
  * duced variable is equal to the expression that computes it.
  *
  */
//val input = true
//val result = if(input) "foo" else "bar"
////println(result)
//
//var x = 10
//val y = while(x > 0) {
//  x -= 1
//}
//println(s"y",y)
// while does not return value
// while and do-while are called loops and not expressions because they
// don't result in an interesting value

//val filesHere = (new java.io.File("/home/pabe/dev/scala-learning/src/main/scala/chapter7/a-directory-with-files")).listFiles
//for (file <- filesHere) //this syntax is called "generator"
//  println(file.getName)

//val txtFiles = for {
//  file <- filesHere
//  if (file.getName.endsWith("txt"))
//} yield file
//
//txtFiles
//  .map(file => file.getName)
//  .foreach(println)
//
//filesHere
//  .map(file => file.getName)
//  .foreach(println)

def foo(n: Int) = {
  if(n % 2 == 0)
    n / 2
  else
    throw new IllegalArgumentException
}

val res = foo(3)
println(res)
