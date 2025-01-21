package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Random;

public class bai6 {
  public static void main(String[] args) {
    ArrayList<Integer> n = new ArrayList<>();

    Random random = new Random();

    for (int i = 0; i < 15; i++) {
      n.add(random.nextInt(50) + 1);
    }

    int demChan = 0;
    int demLe = 0;

    for (int i = 0; i < 15; i++) {
      int num = n.get(i);
      if (num % 2 == 0) {
        demChan++;
      } else {
        demLe++;
      }
    }
    System.out.println("Cac so: " + n);
    System.out.println("So luong so le: " + demLe);
    System.out.println("So luong so chan: " + demChan);

  }
}
