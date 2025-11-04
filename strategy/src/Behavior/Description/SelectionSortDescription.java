package Behavior.Description;

public class SelectionSortDescription implements DescriptionBehavior{
    @Override
    public String description() {
        return """
                Selection Sort

                Description:
                The Selection Sort algorithm divides the list into two parts: the sorted part and the unsorted part. It selects the smallest (or largest) element from the unsorted part and places it in the correct position in the sorted part. This process is repeated until the entire list is sorted.

                Complexity:
                Best case: O(n²)
                Worst case: O(n²)
                Average case: O(n²)

                When to use:
                It is efficient in terms of swaps, as it performs at most one swap per iteration, but it is still inefficient for large lists.
                """;

    }
}
