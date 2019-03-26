package chapter7

class MultiplicationTable {

  def makeTable() = makeRowsSeq.mkString("\n")

  def makeRowsSeq():IndexedSeq[String] =
    for(rowIndex <- 1 to 10) yield makeRow(rowIndex)

  def makeRow(rowIndex: Int): String = makeRowSeq(rowIndex).mkString

  private def makeRowSeq(rowIndex: Int): IndexedSeq[String] =
    for(columnIndex <- 1 to 10 ) yield {
      val product = (rowIndex * columnIndex).toString
      val padding = " " * (4 - product.length)
      padding + product
    }
}

