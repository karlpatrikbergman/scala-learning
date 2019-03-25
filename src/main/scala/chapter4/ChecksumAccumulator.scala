package chapter4

import scala.collection.mutable

/**
  * Skip "return" at the end of methods
  * Think of each method as an expression that yields one value, which is returned.
  * This philosophy will encourage you to make methods quite small, to factor larger methods
  * into multiple smaller ones.
  *
  * Although the Scala compiler will correctly infer the result types of the
  * add and checksum methods shown in the previous example, readers of the
  * code will also need to mentally infer the result types by studying the bodies
  * of the methods.
  *
  * Methods with a result type of Unit , such as ChecksumAccumulator ’s
  * add method, are executed for their side effects. A side effect is generally
  * defined as mutating state somewhere external to the method or performing
  * an I/O action. In add ’s case, the side effect is that sum is reassigned.
  * A method that is executed only for its side effects is known as a procedure.
  */
class ChecksumAccumulator {
  private var sum: Int = 0
  def add(b: Byte): Unit = sum += b
  def checksum(): Int =  ~(sum & 0xFF) + 1
}

// The type named ChecksumAccumulator is defined by the singleton object’s companion class.
//  [...] a singleton object is initialized the first time some code accesses it.
object ChecksumAccumulator {

  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int =
    if(cache.contains(s)) {
      println(s"String '$s' is already in cache")
      cache(s)
    } else {
      val checksumAccumulator = new ChecksumAccumulator
      for (char: Char <- s: String) {
        checksumAccumulator.add(char.toByte)
      }
      val checksum = checksumAccumulator.checksum()
      cache += (s -> checksum)
      checksum
    }
}
