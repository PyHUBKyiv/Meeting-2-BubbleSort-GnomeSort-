import org.junit.Assert;
import org.junit.Test;

public class SorterTest {

    private final Sorter sorter = new GnomeSort(); ;

    @Test
    public void checkEmptyArray() throws WrongInputParameter {
        int[] expected = {};
        int [] result = sorter.sort(expected);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void checkArrayWithOneDigit() throws WrongInputParameter {
        int[] expected = {1};
        int [] result = sorter.sort(expected);
        Assert.assertArrayEquals(expected, result);
    }

    @Test(expected = WrongInputParameter.class)
    public void checkNullInput() throws WrongInputParameter {
        sorter.sort(null);
    }

    @Test
    public void sortArrayWith2Elems() throws WrongInputParameter {
        int [] expected = {1,2};
        int [] result = sorter.sort(new int[]{2, 1});
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void sortArrayWithAnother2Elems() throws WrongInputParameter {
        int [] expected = {4,5};
        int [] result = sorter.sort(new int[]{5, 4});
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void sortArrayWithCustomElements() throws WrongInputParameter {
        int [] expected = {-1,1,2,3,4,5,9,50};
        int [] result = sorter.sort(new int[]{9,1,2,-1,50,5,4,3});
        Assert.assertArrayEquals(expected, result);
    }







}