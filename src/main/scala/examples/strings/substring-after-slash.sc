
/**
  * Get every thing after last slash using lastIndexOf
  */
val doubleDutchImgSrc: String = "https://ddreg-prod-eu.azureedge.net/eventgrid/img/937d848a-783a-466b-b6cf-e00bf00d40f6.png"

val indexOfLastSLash = doubleDutchImgSrc.lastIndexOf("/")
//println(doubleDutchImgSrc.substring(indexOfLastSLash, doubleDutchImgSrc.length))

/**
  * Get everything after last slash using regex
  */
val stringAfterLastSlashPattern = "([^eventgrid/]+$)".r

val result: Option[String] =stringAfterLastSlashPattern.findFirstIn(doubleDutchImgSrc)
//println(result.get)


/**
  * Get everything after eventgrid/
  */
val pattern = "(?<=eventgrid/).*".r
val res = pattern.findFirstIn(doubleDutchImgSrc)
println(res.getOrElse("No match"))
