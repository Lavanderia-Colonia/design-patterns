import Sorter.*;
import java.util.Random;

public class StrategyTest {
    public static void BubleSorter() {
        int[] array = new int[10];
        Random rnd = new Random();
        BubbleSorter sorter = new BubbleSorter();

        System.out.println(sorter.getDescription());

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        System.out.println("Before Sorting: ");
        for (int i : array) {
            System.out.print("[" + i + "] ");
        }

        sorter.performSort(array);

        System.out.println("\n");
        System.out.println("After Sorting: ");
        for (int i : array) {
            System.out.print("[" + i + "] ");
        }
    }

    public static void QuickSorter() {
        int[] array = new int[10];
        Random rnd = new Random();
        QuickSorter sorter = new QuickSorter();

        System.out.println(sorter.getDescription());

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        System.out.println("Before Sorting: ");
        for (int i : array) {
            System.out.print("[" + i + "] ");
        }

        sorter.performSort(array);

        System.out.println("\n");
        System.out.println("After Sorting: ");
        for (int i : array) {
            System.out.print("[" + i + "] ");
        }
    }

    public static void RadixSorter() {
        int[] array = new int[10];
        Random rnd = new Random();
        RadixSorter sorter = new RadixSorter();

        System.out.println(sorter.getDescription());

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(100);
        }

        System.out.println("Before Sorting: ");
        for (int i : array) {
            System.out.print("[" + i + "] ");
        }

        sorter.performSort(array);

        System.out.println("\n");
        System.out.println("After Sorting: ");
        for (int i : array) {
            System.out.print("[" + i + "] ");
        }
    }

}
