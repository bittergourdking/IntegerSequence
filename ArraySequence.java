import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  //private variables
  private int currentIndex;
  private int []data;
  //constructor
  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other) {

  }

  //methods
  public void reset() {

  }

  public int length() {
    return 0;
  }

  public boolean hasNext() {
    return false;
  }

  public int next() {
    return 0;
  }
}
