package chapter15

import org.scalatest.FunSuite

class ExprTest extends FunSuite {

  test("Understanding case classes...") {
    val op = BinOp("+", Number(1.0), Var("x"))
    println(op)
  }

  test("SimplyfyTop test") {
    val expr = UnOp("-", UnOp("-", Var("x")))
    val result = SomeUtil.simplifyTop(expr)
    println(result)

  }

}
