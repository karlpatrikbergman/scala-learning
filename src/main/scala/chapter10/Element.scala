package chapter10

abstract class Element {
  // contents is declared as a method that has no implementation.
  // In other words, the method is an abstract member of class Element
  // Note that the contents method in class Element does not carry an abstract modifier. A method is abstract
  // if it does not have an implementation (i.e., no equals sign or body).
  // Class Element 'declares' the abstract method contents, but currently defines no 'concrete' methods.
  def contents: Array[String]  // The contents can be represented as an array of strings, where each string represents a line
  def height:Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
  // All methods above are are defined as "parameterless methods", which is the recommended way to define methods thsat
  // when there are no parameters and the method access mutable state by only reading fields of the containing objet
}
