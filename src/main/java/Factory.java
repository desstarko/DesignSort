public class Factory {
    public ISort getSorter(String currentSorter){
        if (currentSorter.equals("101") || currentSorter.equals("Bubble Sort")){
            return new BubbleSort();
        }

        else if (currentSorter.equals("102") || currentSorter.equals("Bucket Sort")){
            return new BucketSort();
        }

        else if (currentSorter.equals("103") || currentSorter.equals("Digit Sort")){
            return new DigitSort();
        }

        else return null;

    }
}