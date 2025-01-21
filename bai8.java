package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Scanner;

public class bai8 {
  public static void main(String[] args) {
    ArrayList<String> traiCay = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.print("nhap trai cay : ");
      traiCay.add(scanner.next());
    }

    ArrayList<String> copyTraiCay = new ArrayList<>(traiCay);

    System.out.println("Danh sach goc: " + traiCay);
    System.out.println("Danh sach sao chep: " + copyTraiCay);
  }
}
