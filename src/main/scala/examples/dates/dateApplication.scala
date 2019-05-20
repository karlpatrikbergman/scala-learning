package examples.dates

import java.time.LocalDate
import java.time.ZoneId
import java.time.ZonedDateTime

object dateApplication  {
  def main(args: Array[String]): Unit = {

    def isWithinRange(date: LocalDate, minDateInclusive: LocalDate, maxDateInclusive: LocalDate) : Boolean = {
      println("date: " + date)
      println("minDateInclusive: " + minDateInclusive)
      println("maxDateInclusive: " + maxDateInclusive)

      (date.isEqual(minDateInclusive) || date.isAfter(minDateInclusive)) &&
        (date.isEqual(maxDateInclusive) || date.isBefore(maxDateInclusive))
    }

    def isWithinRange2(date: ZonedDateTime, minDateInclusive: ZonedDateTime, maxDateInclusive: ZonedDateTime) : Boolean = {
      isWithinRange(date.toLocalDate, minDateInclusive.toLocalDate, maxDateInclusive.toLocalDate)
    }

    val akademiInstanceStartDate = ZonedDateTime.of(2019, 5, 20, 13, 0, 0, 0, ZoneId.of("UTC"))
    val now = ZonedDateTime.now(ZoneId.of("UTC"))

    val showAkademiInstance = isWithinRange2(akademiInstanceStartDate, now, now.plusDays(5))
    println("showAkademiInstance: " + showAkademiInstance)
    //val foo = isWithinRange(akademiInstanceStartDate.toLocalDate, now.toLocalDate, now.plusDays(5).toLocalDate)
  }

}
