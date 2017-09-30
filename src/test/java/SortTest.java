
import static org.junit.Assert.*;

public class SortTest {

    @org.junit.Test
    public void bubbleSortable() throws Exception {
        int[] arr = {4,3,2,1};
        int[] arrSort = {1,2,3,4};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortableArr = bubbleSort.sortable(arr);
        assertArrayEquals(arrSort, sortableArr);
        /*for (int a: sortableArr){
            System.out.println(a);
        }*/
    }

    @org.junit.Test
    public void bucketSortable() throws Exception {
        int[] arr = {35,46,14,41,38};
        int[] arrSort = {14,35,38,41,46};
        BucketSort bucketSort = new BucketSort();
        int[] sortableArr = bucketSort.sortable(arr);
        assertArrayEquals(arrSort, sortableArr);
        for (int a: sortableArr){
            System.out.println(a);
        }
    }

    @org.junit.Test
    public void digitSortable() throws Exception {
        int[] arr = {4,3,2,1};
        int[] arrSort = {1,2,3,4};
        DigitSort digitSort = new DigitSort();
        int[] sortableArr = digitSort.sortable(arr);
        assertArrayEquals(arrSort, sortableArr);
        /*for (int a: sortableArr){
            System.out.println(a);
        }*/
    }

}