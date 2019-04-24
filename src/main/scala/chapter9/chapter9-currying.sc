
def plainOldSum(x: Int, y: Int): Int = x + y
plainOldSum(1, 2)

val addOne = plainOldSum(1,_: Int)
addOne(2)

// When you inkvoke curriedSum you get two traditional function invokations
// back to back The first function takes the single parameter x and returns
// a function value for the second function. The second function takes a
// single parameter y.
def curriedSum(x: Int)(y: Int): Int = x + y
curriedSum(1)(2)

// In spirit this is what is happening
def first(x: Int): Int => Int = (y: Int) => x + y
val second: (Int => Int) = first(1)
second(2)
// These first and second functions are just an illustration of the currying
// process. They are not directly connected to the curriedSum function.

// Playing around
def foo(x: Int)(s: String)(b: Boolean): String = (x.toString + s + b.toString).toUpperCase
foo(10)("hej")(false)

val f = foo(7)_ //Partial application
f("hello")(true)
f("Salut")(true)


// Det här kommer att bli användbart!
def fileEndsWith(path: String)(query: String): String = s"Search result for $query in path $path"
val search = fileEndsWith("/some/path/to/files")_

search("jpg")
search("zip")
