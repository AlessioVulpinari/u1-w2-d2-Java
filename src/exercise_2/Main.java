package exercise_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = randomNumberList(5);
        System.out.println(list1);
        System.out.println(reverseList(list1));
        printOddOrEven(list1, true);
        printOddOrEven(list1, false);
    }

    public static List<Integer> randomNumberList(int num) {
        List<Integer> listOfRandomNum = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Random random = new Random();
            int randomNum = random.nextInt(0, 100);
            listOfRandomNum.add(randomNum);
        }
        Collections.sort(listOfRandomNum);
        return listOfRandomNum;
    }

    public static List<Integer> reverseList(List<Integer> list) {
        return list.reversed();
    }

    public static void printOddOrEven(List<Integer> intList, boolean even) {
        if (even) {
            for (int i = 0; i < intList.size(); i++) {
                if (i % 2 == 0) System.out.println("Pari: " + intList.get(i));
            }
        } else {
            for (int i = 0; i < intList.size(); i++) {
                if (i % 2 != 0) System.out.println("Dispari: " + intList.get(i));
            }
        }
    }
}
