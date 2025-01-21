package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Scanner;

public class bai7 {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.print("nhap so : ");
      number.add(scanner.nextInt());
    }
    int size = number.size();
    for (int i = 0; i < size / 2; i++) {
      int temp = number.get(i);
      number.set(i, number.get(size - 1 - i));
      number.set(size - 1 - i, temp);
    }
    System.out.println("Danh sach sau khi dao: " + number);
  }
}
