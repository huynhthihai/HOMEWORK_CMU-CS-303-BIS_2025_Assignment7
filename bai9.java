package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Scanner;

public class bai9 {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.print("nhap so : ");
      number.add(scanner.nextInt());
    }
    int lonNhat = number.get(0);
    int nhoNhat = number.get(0);

    for (int i = 1; i < number.size(); i++) {
      int num = number.get(i);

      if (num > lonNhat) {
        lonNhat = num;
      }

      if (num < nhoNhat) {
        nhoNhat = num;
      }
    }

    System.out.println("So lon nhat trong danh sach: " + lonNhat);
    System.out.println("So nho nhat trong danh sach: " + nhoNhat);

  }
}
