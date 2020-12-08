import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  //private variables
  private int currentIndex;
  private int []data;
  //constructor
  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other) {
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  //methods
  public void reset() {
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    return false;
  }

  public int next() {
    return 0;
  }
}
