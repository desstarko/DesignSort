public class BubbleSort implements ISort {

    public String getName(){
        String name = ("Bucket Sort");
        return name;
    }

    public String getId(){
        String id = ("102");
        return id;
    }

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
