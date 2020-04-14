package examples.commandlineargs

object HelloWorld extends App {
  if (args.length == 0) {
    println("dude, i need at least one parameter")
  } else {
    println(s"Hello ${args(0)}")
  }
}
