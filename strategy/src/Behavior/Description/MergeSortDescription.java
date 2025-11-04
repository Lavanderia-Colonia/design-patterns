package Behavior.Description;

public class MergeSortDescription implements DescriptionBehavior {

    @Override
    public String description() {
        return """
                Merge Sort

                Description:
                The Merge Sort is a divide and conquer algorithm that divides the list into two halves, recursively sorts each half, and then merges the two sorted halves. This results in an efficient and stable algorithm.

                Complexity:
                Best case: O(n log n)
                Worst case: O(n log n)
                Average case: O(n log n)

                When to use:
                It is highly efficient for large lists and is stable, meaning it maintains the relative order of equal elements.
                """;

    }
}
