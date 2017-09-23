public class DigitSort implements ISort{

    String id = "Digit Sortable";

    public int[] sortable(int[] arr) {
        int cnt[][] = new int[4][];
        int b[];
        int i, j;
        int a_len = arr.length;

        if (a_len < 2) {
            // массив длиной 1 элемент не нужно сортировать :)
            return new int[0];
        }

        // инициализируем счетчик [cnt]
        for (j = 0; j < 4; j++) {
            cnt[j] = new int[257];
            for (i = 0; i < 257; i++) cnt[j][i] = 0;
        }

        // выделяем память под копию сортируемого массива
        b = new int[a_len];

        // подсчитываем количество элементов для каждого значения j-го разряда
        for (i = 0; i < a_len; i++) {
            for (j = 0; j < 4; j++) {
                cnt[j][1 + ((arr[i] >>> (8 * j)) & 0xff)]++;
            }
        }

        for (j = 0; j < 4; j++) {
        /*
            вычисляем позиции cnt[i], начиная с которых будут располаться элементы
            с соответствующим значением j-го разряда
        */
            for (i = 1; i < 256; i++) cnt[j][i] += cnt[j][i - 1];
            // расставляем элементы из массива a в массив b в указанном порядке
            for (i = 0; i < a_len; i++) {
                b[cnt[j][(arr[i] >>> (8 * j)) & 0xff]++] = arr[i];
            }
// копируем массив b на место массива a
            for (i = 0; i < a_len; i++) arr[i] = b[i];
        }

        return arr;
    }

}
