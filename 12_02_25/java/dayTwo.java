import java.io.File;
import java.util.Scanner;

public class dayTwo {
    public static void main(String[] args) {
        File input = new File("../input.txt");
        String[] ranges = readInput(input);
        invalidSum(ranges);
    }

    public static void invalidSum(String[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String[] range = array[i].split("-");
            long start = Long.parseLong(range[0].trim());
            long end = Long.parseLong(range[1].trim());
            for (long id = start; id <= end; id++) {
                if (Long.toString(id).length() % 2 == 0) {
                    sum += invalidCheck(id);
                }
            }
        }
        System.out.println("Invalid ID sum: " + sum);
    }

    private static int invalidCheck(long id) {
        String idString = String.valueOf(id);
        int length = idString.length();
        int mid = length / 2;
        String firstHalf = idString.substring(0, mid);
        String secondHalf = idString.substring(length - mid);
    }

    private static String[] readInput(File input) {
        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String[] array = scanner.nextLine().split(",");
                return array;
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }

}