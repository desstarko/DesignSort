public class DigitSort implements ISort{

    public String getName(){
        String name = ("Digit Sort");
        return name;
    }

    public String getId(){
        String id = ("103");
        return id;
    }

    public int[] sortable(int[] arr) {
        int cnt[][] = new int[4][];
        int b[];
        int i, j;
        int a_len = arr.length;

        if (a_len < 2) {
            return new int[0];
        }


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

            for (i = 1; i < 256; i++) cnt[j][i] += cnt[j][i - 1];

            for (i = 0; i < a_len; i++) {
                b[cnt[j][(arr[i] >>> (8 * j)) & 0xff]++] = arr[i];
            }

            for (i = 0; i < a_len; i++) arr[i] = b[i];
        }

        return arr;
    }

}
