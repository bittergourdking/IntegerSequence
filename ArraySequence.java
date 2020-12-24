import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  //private variables
  private int currentIndex;
  private int []data;
  //constructors
  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq) {
    otherseq.reset();
    data = new int[otherseq.length()];
    for (int i = 0; i < otherseq.length(); i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }
  //methods
  public void reset() {
    currentIndex = 0;
  }

  public int length() {
    return data.length;
  }

  public boolean hasNext() {
    return (currentIndex <= (data.length - 1));
  }

  public int next() {
    if (hasNext()) {
      currentIndex++;
      return (data[currentIndex - 1]);
    } else {
      throw new NoSuchElementException("Element does not exist.");
    }
  }
}
