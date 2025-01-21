package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Random;

public class bai12 {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();

    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      int randomNumber = random.nextInt(100) + 1;
      number.add(randomNumber);
    }

    int sum = 0;
    for (int num : number) {
      sum += num;
    }

    System.out.println("Cac so ngau nhien: " + number);
    System.out.println("Tong cac so: " + sum);
  }
}
