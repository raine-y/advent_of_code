import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayTwo {
    public static void main(String[] args) {
        File input = new File("../input.txt");
        dayTwo dayTwo = new dayTwo();

        System.out.println(dayTwo.idCheck(input));
    }

    public int idCheck(File input) {
        int total = 0;
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String[] array = scanner.nextLine().split(",");
                for (int i = 0; i < array.length; i++) {
                    String[] range = array[i].split("-");
                    long start = Long.parseLong(range[0].trim());
                    long end = Long.parseLong(range[1].trim());
                    for (long id = start; id <= end; id++) {

                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return total;
    }
}