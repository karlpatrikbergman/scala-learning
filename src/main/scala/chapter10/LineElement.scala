package chapter10

package chapter10

class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width: Int = s.length
  override def height: Int = 1

}
