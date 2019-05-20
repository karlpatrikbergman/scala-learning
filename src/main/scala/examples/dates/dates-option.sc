import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

def formatDate(dateOption: Option[ZonedDateTime], dateTimeFormatter: DateTimeFormatter): String = {
  dateOption match {
    case Some(date) => date.format(dateTimeFormatter)
    case None => ""
  }
}

//val now: Option[ZonedDateTime] = Some(ZonedDateTime.now())
val dateOptionWithValueNone: Option[ZonedDateTime] = None

val formattedDate = formatDate(dateOptionWithValueNone.map(_.withZoneSameInstant(ZoneId.of("UTC"))), DateTimeFormatter.RFC_1123_DATE_TIME)



