package chapter3

object ChapterThreeApp extends App {

  def stringExample() {
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!" // transforms to greetStrings.update("World)
    for(i <- 0 to 2)           // transforms to (0).to(2), which results in a collection range 0 to 2
      print(greetStrings(i))   // greetStrings(i) transforms to greetStrings.apply(i)

    //(0).to(2) // scala.collection.immutable.Range.Inclusive = Range 0 to 2
  }
  //stringExample()

  def listExample() {
    // Results in calling the factory method "apply" on the companion object of Array.
    // Equals to calling a static method on a class Array (Java)
    val numNames = Array("one", "two", "three")
    println(numNames)

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour

    val zeroOneTwoThreeFour = 0 :: oneTwoThreeFour
    println(zeroOneTwoThreeFour)
  }
  //listExample()

  def tuplesExample(): Unit = {
    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)
  }
  //tuplesExample()

  def immutableSetExample(): Unit = {
    // Means invoking factory method jetSet.apply()- Returns an immutable.Set
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear" // This will create and return a new Set. Obs jetSet is var
    println(jetSet)
    println(jetSet.contains("Cessna"))
  }
  //immutableSetExample()

  def mutableSetExample(): Unit = {
    val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek" // equals calling method +, as in movieSet.+("Shrek")
    println(movieSet)
  }
  //mutableSetExample()

  def immutableHashSetExample(): Unit = {
      val hashSet = scala.collection.immutable.HashSet("Tomatoes", "Chillies")
      println(hashSet + "Coriander")
  }
  //immutableHashSetExample()

  def mutableMapExample(): Unit = {
    val treasureMap = scala.collection.mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island")                // Transforms to (1).->("Go to island) which returns Tuble(int,String)
    treasureMap += ((2).->("Find big X on the ground")) // Pass Tuple to + method of Map object
    treasureMap += (1 -> "Dig")
    println(treasureMap(2))
  }
  //mutableMapExample()

  def immutableMapExample(): Unit = {
    val romanNumeral = Map(
      1 -> "I",
      2 -> "II",
      3 -> "III",
      4 -> "IV"
    )
    println(romanNumeral(4))
  }
  immutableMapExample()

}

