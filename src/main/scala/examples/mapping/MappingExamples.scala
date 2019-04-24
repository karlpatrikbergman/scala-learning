package examples.mapping

object MappingExamples extends App {
//  val listOfLowerCaseStrings = List("patrik", "linda", "niria", "stella")
//  val listOfUpperCaseStrings = listOfLowerCaseStrings.map(s => s.toUpperCase)
//  listOfUpperCaseStrings.foreach(s => println(s))
//
//  val listOfLists =List(List("bergman"), List("hörnqvist"))
//  val listOfFamilyNames = listOfLists.flatten
//  listOfFamilyNames.foreach(name => println(name))


  case class Foo (
    bar: List[Option[String]]
  )


}
