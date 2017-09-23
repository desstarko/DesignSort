public class BubbleSort implements ISort {

    String id = "Bubble Sortable";

    public int[] sortable(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = i; j >= 1; j--) {

                //меняем элементы местами

                int a = arr[j];

                arr[j] = arr[j - 1];
                arr[j - 1] = a;
            }
        }
        return arr;
    }


}
