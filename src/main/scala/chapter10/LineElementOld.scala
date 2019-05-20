package chapter10

class LineElementOld(s: String) extends ArrayElement(Array(s)) {
  override def width: Int = s.length
  override def height: Int = 1

}
