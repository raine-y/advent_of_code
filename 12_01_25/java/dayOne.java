import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayOne {
    public static void main(String[] args) {
        File input = new File("../input.txt");
        dayOne dayOne = new dayOne();

        System.out.println("Part One Count: " + dayOne.partOne(input));
    }

    public int partOne(File input) {
        int position = 50;
        int count = 0;

        try (Scanner scanner = new Scanner(input)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int step = Integer.parseInt(line.replaceAll("[\\D]", ""));

                if (line.startsWith("R")) {
                    for (int i = 0; i < step; i++) {
                        position = (((position + 1) % 100) + 100) % 100;
                        if (position == 0)
                            count++;
                    }
                }

                if (line.startsWith("L")) {
                    for (int i = 0; i < step; i++) {
                        position = (((position - 1) % 100) + 100) % 100;
                        if (position == 0)
                            count++;
                    }
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return count;

    }
}