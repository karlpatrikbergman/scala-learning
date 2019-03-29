package chapter8

import java.io.File

class FileMatcher(aPath: String) {

  require(aPath.nonEmpty, "Path must not be empty string")

  private val path: String = aPath

  private def filesHere = (new java.io.File(path)).listFiles

  // Placeholder syntax. In this case the compiler knows _ must be string
  // Also notice we are using closure, since the free parameter 'query' is 'closed in' in the function object
  def filesEnding(query: String): Array[File] = filesMatching(_.endsWith(query))

  //Without placeholder syntax
  def filesEnding2(query: String): Array[File] = filesMatching((fileName: String) => fileName.endsWith(query))

  def filesContaining(query: String): Array[File] = filesMatching(_.contains(query))
  def filesRegex(query: String): Array[File] = filesMatching(_.matches(query))

  private def filesMatching(matcher: String => Boolean): Array[File] = {
    filesHere.filter(file => matcher(file.getName))
  }
}
