package examples.option

import org.scalatest.FunSuite

class OptionTest extends FunSuite {


  class Foo(v: String) {
    val value: String = v

    def getValue(): String = this.value
  }

  test("simple option test") {

    val foo = new Foo("bar")
//    val fooOption: Option[Foo] = Option(foo)
    val fooOption: Option[Foo] = Option(null)
//    fooOption.map(_.getValue())

    fooOption match {
      case Some(value) if value.getValue == "bar" => println(s"Foo.getValue() equals bar")
      case Some(value) => println(s"Foo.getValue() is different from bar")
      case None => println("Foo was not set")
    }
  }
}
