package chapter8

import scala.io.Source

object LongLines {

  def processFile(fileName: String, witdh: Int): List[String] = {
    val b = List.newBuilder[String]

    def processLine(line: String) = {
      if(line.length > witdh) b += line.trim
    }

    val source = Source.fromFile(fileName)
    for(line <- source.getLines())
      processLine(line)

    b.result()
  }
}
