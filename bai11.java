package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Random;

public class bai11 {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      number.add(random.nextInt(100) + 1);
    }

    int largest = number.get(0);
    int smallest = number.get(0);

    for (int i = 1; i < number.size(); i++) {
      int num = number.get(i);

      if (num > largest) {
        largest = num;
      }

      if (num < smallest) {
        smallest = num;
      }
    }

    System.out.println("Cac so ngau nhien: " + number);
    System.out.println("So lon nhat trong danh sach: " + largest);
    System.out.println("So nho nhat trong danh sach: " + smallest);

  }
}
