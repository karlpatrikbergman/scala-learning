import java.net.URLDecoder
import java.nio.charset.StandardCharsets

//val categories: String = "strategisk%20kommunikation,h%C3%A5llbarhet,public%20management"
//val urlDecodedCategories: String = URLDecoder.decode(categories, StandardCharsets.UTF_8.name())
//val categoriesArray: Array[String] = urlDecodedCategories.split(",",-1).map(_.trim)
//
//val otherCategoriesArray: Array[String] = Array("hållbarhet", "tipsrundor", "musik")
//val res: Array[String] = categoriesArray.intersect(otherCategoriesArray)


def toUppercase(myString: String): String = {
  myString.toUpperCase
}

val stringOptionValueSome: Option[String] = Some("pizza")
val x = stringOptionValueSome.map(toUppercase(_))

val stringOptionValueNone: Option[String] = None
val y = stringOptionValueNone.map(toUppercase(_))





