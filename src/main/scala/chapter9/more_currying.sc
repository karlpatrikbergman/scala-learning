//
//def sum(a: Int, b: Int): Int = a + b
//
//def curriedSum1 = (sum _).curried
//
//val addFive = curriedSum1(5)
//
//addFive(4)
//
//def curriedSum2(x: Int)(y: Int) = x + y
//
//val addFour = curriedSum2(4) _
//
//

def add(a: Int, b: Int, c: Int) = a + b + c

val f: Int => Int => Int => Int = (add _).curried

val g = f(2)
val h = g(3)

