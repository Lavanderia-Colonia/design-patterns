package Behavior.Description;

public class HeapSortDescription implements DescriptionBehavior {
    @Override
    public String description() {
        return """
                Heap Sort

                Description:
                The Heap Sort uses a data structure called a heap, a complete binary tree. It constructs a max heap and then repeatedly removes the largest element (the root), rebuilding the heap after each removal.

                Complexity:
                Best case: O(n log n)
                Worst case: O(n log n)
                Average case: O(n log n)

                When to use:
                It is efficient and guarantees a time complexity of O(n log n), but it is not stable, meaning it may change the relative order of equal elements.
                """;
    }
}
