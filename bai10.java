package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Scanner;

public class bai10 {
  public static void main(String[] args) {
    ArrayList<String> ten = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.print("nhap ten: ");
      ten.add(scanner.next());
    }

    System.out.println("Danh sach ten ban dau: " + ten);

    ArrayList<String> tenKhongTrung = new ArrayList<>();

    for (String name : ten) {

      if (!tenKhongTrung.contains(name)) {
        tenKhongTrung.add(name);
      }
    }

    System.out.println("Danh sach sau khi loai bo ten trung lap: " + tenKhongTrung);
  }
}
