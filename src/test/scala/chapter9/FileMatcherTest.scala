package chapter9

import org.scalatest.FunSuite

class FileMatcherTest extends FunSuite {

  private val path: String = "/home/pabe/dev/scala-learning/src/test/resources/a-directory-with-files"
  private val fileMatcher = new FileMatcher(path)


  test("Should find files with ending with 'scala'") {
    assert(fileMatcher.filesEnding("scala").size == 1)
  }

  test("Should files containing 'starmarket'") {
    assert(fileMatcher.filesContaining("starmarket").size == 2)
  }

}
