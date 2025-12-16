import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayOne {
    public static void main(String[] args) {
        File input = new File("input.txt");

        int position = 50;
        int count = 0;

        try (Scanner myReader = new Scanner(input)) {
            while (myReader.hasNextLine()) {

                String line = myReader.nextLine();

                int step = Integer.parseInt(line.replaceAll("[\\D]", ""));

                if (line.startsWith("R")) {
                    position += step;
                }
                if (line.startsWith("L")) {
                    position -= step;
                }
                position %= 100;

                if (position == 0) {
                    count++;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Final position: " + position);
        System.out.println("Number of times position was zero: " + count);

    }
}