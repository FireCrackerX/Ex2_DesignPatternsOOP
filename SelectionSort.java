import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort implements SortingAlgorithms {

    public SelectionSort() {
        System.out.print("Selection sort is sorting the items...");
    }

    @Override
    public ArrayList<Integer> sortList(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums;   
    }
}
