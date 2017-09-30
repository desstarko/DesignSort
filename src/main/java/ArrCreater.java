import java.util.Random;


public class ArrCreater {

    public int[] createArr(int size){
        int[] arr = new int[size];
        return arr;
    }

    public void randomizeArr(int[] arr){
        Random randomizer = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomizer.nextInt(50);
        }
    }

    public void showArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
