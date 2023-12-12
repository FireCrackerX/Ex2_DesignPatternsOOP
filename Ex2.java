import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static final int MAX = 5;
    public static void main(String[] args) {
        ArrayList<Integer> nums = getNums();
        nums = sortList(nums);
        printList(nums);    
    }

    public static ArrayList<Integer> getNums() {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(nums.size() < MAX) {
            String s = inp.nextLine();
            if(checkNumberFormat(s)) {
                int num = Integer.parseInt(s);
                if(checkRange(num)) {
                    nums.add(num);
                }
                else {
                    continue;
                }
            }
            else {
                continue;
            }
        }
        inp.close();
        return nums;
    }

    public static boolean checkNumberFormat(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
        return true;
    }

    public static boolean checkRange(int num) {
        if(num<0 || num > 10) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> sortList(ArrayList<Integer> nums) {
        new MergeSort().sortList(nums);
        return nums;
    }

    public static void printList(ArrayList<Integer> nums) {
        for(int num : nums) {
            System.out.print(num+" ");
        }
    }

}