package Behavior.Description;

public class QuickSortDescription implements DescriptionBehavior {
    @Override
    public String description() {
        return """
                Quick Sort

                Description:
                The Quick Sort is another divide and conquer algorithm that selects a pivot and divides the list into two subarrays: one with elements smaller than the pivot and another with elements larger than the pivot. This process is recursive, applied to the subarrays until the entire list is sorted.

                Complexity:
                Best case: O(n log n)
                Worst case: O(n²)
                Average case: O(n log n)

                When to use:
                It is very efficient in practice for large datasets, though it has a worst-case complexity of O(n²) (usually avoided with a proper pivot choice).
                """;

    }
}
