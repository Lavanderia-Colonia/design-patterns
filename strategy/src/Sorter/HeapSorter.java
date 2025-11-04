package Sorter;

import Behavior.Description.HeapSortDescription;
import Behavior.Sort.HeapSort;

public class HeapSorter extends Sorter{
    public HeapSorter(){
        super(new HeapSort(), new HeapSortDescription());
    }
}
