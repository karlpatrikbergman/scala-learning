//val more = 1
//val addMore = (x: Int) => x + more // x is a bound variable, more is a free variable
//val res = addMore(10)

// At runtime a function value (the object) is created from the
// function literal "addMore". The function value created is called a
// "Closure"
// The name arises from the act of "closing" the function literal by
// "capturing" the bindings of its free variables.

// Test
var more = 1
val addMore = (x: Int) => x + more // x is a bound variable, more is a free variable
val res = addMore(10)
more = 3
val res2 = addMore(10)

val f1 = (x: Int) => x + 1 // This is called a closed term because it is already closed as written
val freeVariable = 5
val f2 = (x: Int) => x + freeVariable // This is called an open term