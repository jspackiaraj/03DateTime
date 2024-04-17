import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Duration;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;

public class DateTimeProcessor {

    // Method to calculate days between two dates
    public long calculateDaysBetweenDates(String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return java.time.temporal.ChronoUnit.DAYS.between(start, end);
    }

    // Method to calculate duration between two times
    public Duration calculateDurationBetweenTimes(String startTime, String endTime) {
        LocalTime start = LocalTime.parse(startTime);
        LocalTime end = LocalTime.parse(endTime);
        return Duration.between(start, end);
    }

    // Method to process each line of the file
    public void processFile(String filePath) {
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(line -> {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    long days = calculateDaysBetweenDates(parts[0], parts[1]);
                    Duration duration = calculateDurationBetweenTimes(parts[2], parts[3]);
                    System.out.printf("Dates: %s to %s - %d days, Times: %s to %s - %s hours, %s minutes%n",
                                      parts[0], parts[1], days, parts[2], parts[3],
                                      duration.toHoursPart(), duration.toMinutesPart());
                }
            });
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
