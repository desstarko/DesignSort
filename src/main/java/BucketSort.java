public class BucketSort implements ISort{

    public String getName(){
        String name = ("Bubble Sort");
        return name;
    }

    public String getId(){
        String id = ("101");
        return id;
    }

    public int[] sortable(int[] arr) {

        //поиск максимального элемента массива
        int maxValue = arr[0];

        for (int k = 1; k < arr.length; k++) {
            if (arr[k] > maxValue)
                maxValue = arr[k];
        }

        int i, j;
        //создадим вспомогательный массив
        int[] bucket = new int[maxValue + 1];
        //распределим числа по карманам
        for(i = 0; i < arr.length; i++ ) {
            bucket[arr[i]]++;
        }

        //отсортируем числа в карманах используя сортировку подсчетом
        for(i = 0, j = 0; i < bucket.length; i++) {
            for(; bucket[i]>0; (bucket[i])--) {
                arr[j++] = i;
            }
        }
        return arr;
    }


}
