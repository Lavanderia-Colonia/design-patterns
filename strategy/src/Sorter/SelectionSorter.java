package Sorter;

import Behavior.Description.SelectionSortDescription;
import Behavior.Sort.SelectionSort;

public class SelectionSorter extends Sorter{
    public SelectionSorter(){
        super(new SelectionSort(), new SelectionSortDescription());
    }
}
