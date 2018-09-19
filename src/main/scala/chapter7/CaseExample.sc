val args = Array("salt")
val firstArg = if (args.length > 0) args(0) else ""

val friend =
  firstArg match {
    case "salt" => "pepper"
    case "chips" => "vinegar"
    case "eggs" => "facon"
    case _ => "huh?"
  }

println(friend)
