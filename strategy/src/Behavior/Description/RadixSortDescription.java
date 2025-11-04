package Behavior.Description;

public class RadixSortDescription implements DescriptionBehavior {
    @Override
    public String description() {
        return """
                Radix Sort

                Description:
                The Radix Sort is a non-comparative algorithm that sorts elements based on their digit positions, starting from the least significant digit to the most significant digit.

                Complexity:
                Best case: O(nk)
                Worst case: O(nk)
                Average case: O(nk)

                When to use:
                It is ideal for sorting integers or strings with fixed lengths, especially when k (the number of digits) is small.
                """;
    }
}
