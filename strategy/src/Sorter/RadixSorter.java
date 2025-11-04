package Sorter;

import Behavior.Description.RadixSortDescription;
import Behavior.Sort.RadixSort;

public class RadixSorter extends Sorter {
    public RadixSorter(){
        super(new RadixSort(), new RadixSortDescription());
    }
}
