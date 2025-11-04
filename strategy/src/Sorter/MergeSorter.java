package Sorter;

import Behavior.Description.MergeSortDescription;
import Behavior.Sort.MergeSort;

public class MergeSorter extends Sorter {
    public MergeSorter(){
        super(new MergeSort(), new MergeSortDescription());
    }
}
