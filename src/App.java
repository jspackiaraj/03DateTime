public class App {

    public static void main(String[] args) {
        DateTimeProcessor processor = new DateTimeProcessor();
        
        // Specify the path to your CSV file
        String filePath = "test1.txt"; // Make sure this path is correct or adjusted based on your file location
        
        processor.processFile(filePath);
    }
}
