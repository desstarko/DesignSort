import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {
        System.out.println("Our sorts and their id:\n\n---Bucket Sort, id - 101.\n---Bubble Sort, id - 102.\n---Digit Sort, id - 103.");
        System.out.println("\nPlease, enter the sort id or the title of sort: ");
        Scanner sc = new Scanner(System.in);
        String currentSorter = sc.nextLine();
        Factory factory = new Factory();
        ISort sorter = factory.getSorter(currentSorter);
        if (sorter != null) {
            System.out.println("You choose: " + sorter.getName()+".");
        }
        else{
            System.out.println("Bad data.");
        }
        System.out.println("Please, enter the size of array: ");
        int sizeOfArr = sc.nextInt();
        ArrCreater arrCreater = new ArrCreater();
        int[] arr = arrCreater.createArr(sizeOfArr);
        if(arr==null)
            System.out.println("Bad data.");
        System.out.println("Starting Array:");
        arrCreater.randomizeArr(arr);
        arrCreater.showArr(arr);
        System.out.println("Sorting Array:");
        sorter.sortable(arr);
        arrCreater.showArr(arr);
        }

    }

