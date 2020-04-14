package chapter9

class Foo(bar: String)(baz: String) {

  def x(): Unit = {
    println(s"Hello $bar $baz")
  }

}

object Foo extends App {
  val foo = new Foo("patrik")(_)
  foo("bergman").x()
}
