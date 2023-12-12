import java.util.ArrayList;
import java.util.Collections;

public class MergeSort implements SortingAlgorithms{

    public MergeSort() {
        System.out.print("Merge sort is sorting the items...");
    }

    @Override
    public ArrayList<Integer> sortList(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums;   
    }
}
