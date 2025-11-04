package Sorter;

import Behavior.Description.QuickSortDescription;
import Behavior.Sort.QuickSort;

public class QuickSorter extends Sorter{
    public QuickSorter(){
        super(new QuickSort(), new QuickSortDescription());
    }
}
