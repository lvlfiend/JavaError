package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
      doRecursion();
      doLoop();
   }

    // StackOverflowError рекурсия
   public static void doRecursion() {
        doRecursion();
   }

    // OutOfMemoryError бесконечный цикл
    public static void doLoop() {
        List list = new ArrayList<>();
        while (true) {
            byte[] b = new byte[1048576];
            list.add(b);
        }
    }

}
