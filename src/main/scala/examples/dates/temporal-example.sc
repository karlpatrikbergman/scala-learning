import java.time.LocalDate
import java.time.Month
import java.time.temporal.ChronoUnit.DAYS


val electionDay: LocalDate = LocalDate.of(2020, Month.NOVEMBER, 3)
val today: LocalDate = LocalDate.now()

println(s"%d days to go...%n", DAYS.between(today, electionDay));


/** ********************************************************************************************************************/


import java.time.ZoneId
import java.time.ZonedDateTime

val akademiInstanceStartDate = ZonedDateTime.of(2019, 5, 20, 13, 0, 0, 0, ZoneId.of("UTC"))
val now = ZonedDateTime.now(ZoneId.of("UTC"))

def isWithinRange(date: LocalDate, minDateInclusive: LocalDate, maxDateInclusive: LocalDate) : Boolean = {
  println("date: " + date)
  println("minDateInclusive: " + minDateInclusive)
  println("maxDateInclusive: " + maxDateInclusive)


  (date.isEqual(minDateInclusive) || date.isAfter(minDateInclusive)) &&
    (date.isEqual(maxDateInclusive) || date.isBefore(maxDateInclusive))
}

def isWithinRange2(date: ZonedDateTime, minDateInclusive: ZonedDateTime, maxDateInclusive: ZonedDateTime) : Boolean = {
  isWithinRange(date.toLocalDate, maxDateInclusive.toLocalDate, maxDateInclusive.toLocalDate)
}


val foo = isWithinRange2(akademiInstanceStartDate, now, now.plusDays(5))
//val foo = isWithinRange(akademiInstanceStartDate.toLocalDate, now.toLocalDate, now.plusDays(5).toLocalDate)
