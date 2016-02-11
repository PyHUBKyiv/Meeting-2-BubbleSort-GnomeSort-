public class BubbleSort implements Sorter {

    @Override
    public int[] sort(int[] arr) throws WrongInputParameter {
        if (arr == null) throw new WrongInputParameter();
        if (arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if(arr[j] > arr[j+1]){
                        swap(arr, j);
                    }
                }
            }
        }
        return arr;
    }

}
