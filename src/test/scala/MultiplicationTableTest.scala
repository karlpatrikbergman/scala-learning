import chapter7.MultiplicationTable
import org.scalatest.FunSuite

class MultiplicationTableTest extends FunSuite {
  val multiplicationTable = new MultiplicationTable()

  test("Should make a multiplication table string") {
    //assert("" == multiplicationTable.makeTable())
    println(multiplicationTable.makeTable())
  }

}
