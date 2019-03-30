//val intRange = 1 to 10
//intRange
//  .filter(_ > 5)
//  .foreach(println)

// Another way to think about this kind of expression, in which an
// underscore is used to represent an entire parameter list, is as a
// way to transform a def into a function value. For example, if you have a
// local function, such as:
// sum(a: Int, b: Int, c: Int): Int
//
// you can "wrap" it in a function value whose apply method has the same parameter list
// and result types. When you apply this function value to some arguments,
// it in turn applies sum to those same arguments and returns the result.
//
// Although you can't assign a method or nested function to a variable, or
// pass it as an argument to another function, you can do these things
// if you wrap the method or nested function in a function value by placing an
// underscore after its name.
class Calculator {
  def sum(a: Int, b: Int, c: Int): Int = a + b + c
}

// Wrapping a method in a function value by placing an underscore after its name
// so that it can be assigned to a variable
val calc = new Calculator
val a  = calc.sum _
a(1, 2, 3)

