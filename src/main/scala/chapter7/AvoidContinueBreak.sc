val args = Array("-bar.scala", "foo.txt", "foo.scala")

def searchForIt(i: Int): Int = {
  if(i > args.length) -1
  else if (args(i).startsWith("-")) searchForIt(i+1)
  else if (args(i).endsWith(".scala")) i
  else searchForIt(i+1)
}

val i = searchForIt(0)
