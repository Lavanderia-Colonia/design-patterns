package Sorter;

import Behavior.Description.InsertionSortDescription;
import Behavior.Sort.InsertionSort;

public class InsertionSorter extends Sorter{
    public InsertionSorter() {
        super(new InsertionSort(), new InsertionSortDescription());
    }
}
