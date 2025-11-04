package Behavior.Description;

public class InsertionSortDescription implements DescriptionBehavior {
    @Override
    public String description(){
        return """
                Insertion Sort

                Description:
                The Insertion Sort algorithm divides the list into a sorted part and an unsorted part. It picks elements from the unsorted part and inserts them into the correct position in the sorted part. This process is repeated until the entire list is sorted.

                Complexity:
                Best case: O(n) (when the list is already sorted)
                Worst case: O(n²)
                Average case: O(n²)

                When to use:
                It is efficient when the list is partially sorted or when the number of elements to be sorted is small.
                """;
    }
}
