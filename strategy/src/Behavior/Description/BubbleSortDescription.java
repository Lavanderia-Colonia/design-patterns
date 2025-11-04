package Behavior.Description;

public class BubbleSortDescription implements DescriptionBehavior {
    @Override
    public String description() {
        return """
                Bubble Sort

                Description:
                The Bubble Sort algorithm repeatedly traverses the list, comparing pairs of adjacent elements. If an element is out of order, it is swapped with the next one. This process is repeated until the list is fully sorted.

                Complexity:
                Best case: O(n) (when the list is already sorted)
                Worst case: O(n²)
                Average case: O(n²)

                When to use:
                Although not efficient for large lists, Bubble Sort is easy to implement and may be useful for small lists or when the list is already partially sorted.
                """;
    }
}
