package HomeWork.HW6_Ch07;

import java.util.*;

public class HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bingo = "01 02 03 04 05";
        List<String> bingoNumbers = Arrays.asList(bingo.split(" "));

        System.out.print("請輸入對獎號碼=> ");
        String mynumber = scanner.nextLine();
        List<String> myNumbers;
        if (!mynumber.contains(" ")) {
            myNumbers = new ArrayList<>();
            for (int i = 0; i < mynumber.length(); i += 2) {
                myNumbers.add(mynumber.substring(i, Math.min(i + 2, mynumber.length())));
            }
        } else {
            myNumbers = Arrays.asList(mynumber.split(" "));
        }
        int count = 0;
        for (String num : myNumbers) {
            if (bingoNumbers.contains(num)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("沒中");
        } else {
            System.out.println("中" + count + "顆球");
        }

        scanner.close();
    }
}