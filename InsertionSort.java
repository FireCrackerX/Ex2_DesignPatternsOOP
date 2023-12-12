import java.util.ArrayList;
import java.util.Collections;

public class InsertionSort implements SortingAlgorithms {

    public InsertionSort() {
        System.out.print("Insertion sort is sorting the items...");
    }

    @Override
    public ArrayList<Integer> sortList(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums;   
    }
}
