public interface Sorter {

    int[] sort(int [] arr) throws WrongInputParameter;

    default void swap(int [] arr, int i){
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }
}
