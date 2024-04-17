### Java Programming Assignment: Date and Time File Processing

#### Objective
Create a Java class named `DateTimeProcessor` to process date and time data read from a CSV file. Your class will perform specific computations on this data and return the results.

#### Instructions

1. **Class Structure**: Implement the class `DateTimeProcessor` which should contain methods to handle the required computations on date and time.
   
2. **File Format**: The input file will be a CSV (Comma Separated Values) format containing several fields with dates and times. Assume the format of each line in the file is as follows:
   ```
   startDate,endDate,startTime,endTime
   ```
   where `startDate` and `endDate` are in the format `YYYY-MM-DD`, and `startTime` and `endTime` are in the format `HH:MM`.

3. **Methods to Implement**:
   - `long calculateDaysBetweenDates(String startDate, String endDate)`: Returns the number of days between `startDate` and `endDate`.
   - `Duration calculateDurationBetweenTimes(String startTime, String endTime)`: Returns the `Duration` between `startTime` and `endTime`.
   - Other methods as required by the computation needs of your task.

4. **Reading from File**: The `DateTimeProcessor` class should include a method:
   - `void processFile(String filePath)`: Reads the file from `filePath`, processes each line using the other class methods, and prints the results. Assume each line is formatted correctly.

5. **Required Java Classes and Methods**:
   - Use `java.time.LocalDate` for date operations.
   - Use `java.time.LocalTime` and `java.time.Duration` for time operations.
   - Use `java.nio.file.Files` and `java.nio.file.Paths` for file operations.
   - Use `java.util.stream.Stream` for efficient file processing.

6. **Required Imports**:
   ```java
   import java.time.LocalDate;
   import java.time.LocalTime;
   import java.time.Duration;
   import java.nio.file.Files;
   import java.nio.file.Paths;
   import java.io.IOException;
   import java.util.stream.Stream;
   ```

7. **Main Function**: Provided by the instructor, this will instantiate `DateTimeProcessor`, call `processFile` with the path to the input file.

8. **Expected Outputs**: Your method should clearly print the results of the computations for each line in the file, formatted for clarity and ease of understanding.

#### Example Input File (`test1.txt`)
```
2023-01-01,2023-01-31,09:00,17:00
2023-02-01,2023-02-28,08:30,16:30
```

#### Deliverable
Submit a `.java` file containing the `DateTimeProcessor` class with all required methods fully implemented and ready to be called by the provided main function. Ensure your class handles potential exceptions, such as date parsing errors or file read issues, gracefully.
