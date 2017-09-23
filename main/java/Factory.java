public class Factory {

    public ISort getSort(String currentSort){
        if (currentSort.equals("Bubble")) {
            return new BubbleSort();
        } else if (currentSort.equals("Bucket")) {
            return new BucketSort();
        } else if (currentSort.equals("Digit")) {
            return new DigitSort();
        } else {
            throw new IllegalArgumentException("I do not know this sorting");
        }
    }

}
