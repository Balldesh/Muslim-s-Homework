import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_55 {
  public static void main(String[] args) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    try {
      System.out.print("Введите количество чисел: ");
      int count = Integer.parseInt(reader.readLine());

      int minEven = Integer.MAX_VALUE;
      boolean hasEven = false;

      for (int i = 0; i < count; i++) {
        System.out.print("Введите число: ");
        int number = Integer.parseInt(reader.readLine());
        if (number > 0 && number % 2 == 0 && number < minEven) {
          minEven = number;
          hasEven = true;
        }
      }

      if (hasEven) {
        System.out.println("Минимальное чётное число: " + minEven);
      } else {
        System.out.println("-1");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}