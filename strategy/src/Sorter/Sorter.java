package Sorter;
import Behavior.Sort.SortBehavior;
import Behavior.Description.DescriptionBehavior;

abstract class Sorter {
    private final SortBehavior sortBehavior;
    private final DescriptionBehavior descriptionBehavior;

    public Sorter(SortBehavior sb, DescriptionBehavior db) {
        this.sortBehavior = sb;
        this.descriptionBehavior = db;
    }

    public void performSort(int[] array) {
        sortBehavior.sort(array);
    }

    public String getDescription(){
        return descriptionBehavior.description();
    }

}
