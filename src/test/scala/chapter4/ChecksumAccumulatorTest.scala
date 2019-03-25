package chapter4

import org.scalatest.FunSuite

class ChecksumAccumulatorTest extends FunSuite {

  test("ChecksumAccumulator with sum 7  should have checksum -7") {
    val checksumAccumulator = new ChecksumAccumulator
    checksumAccumulator.add(7)
    assert(checksumAccumulator.checksum() == -7)
  }

  test("Should calculate the right checksum") {
    // Testing cache
    // val firstChecksum = ChecksumAccumulator.calculate("Every value is an object")
    // val secondChecksmm = ChecksumAccumulator.calculate("Every value is an object")

    assert(ChecksumAccumulator.calculate("Every value is an object") == -202)
  }
}

