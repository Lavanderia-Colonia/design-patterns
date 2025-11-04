package Sorter;

import Behavior.Sort.BubbleSort;
import Behavior.Description.BubbleSortDescription;

public class BubbleSorter extends Sorter {
    public BubbleSorter() {
        super(new BubbleSort(), new BubbleSortDescription());
    }
}
