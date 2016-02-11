public class GnomeSort implements Sorter{

    @Override
    public int[] sort(int[] arr) throws WrongInputParameter {
        if (arr == null) throw new WrongInputParameter();
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                swap(arr, i);
                i=-1;
            }
        }
        return arr;
    }
}
