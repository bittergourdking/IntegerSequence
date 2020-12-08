import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  //private variables
  private int start, end, current;
  //constructor
  public Range(int start, int end) {
    if (start <= end) {
      this.start = start;
      this.end = end;
      current = start;
    } else {
      throw new IllegalArgumentException("Start must be smaller than end.");
    }
  }
  //methods
  public void reset() {
    current = start;
  }

  public int length() {
    return (end + 1 - start);
  }

  public boolean hasNext() {
    return (current <= end);
  }

  public int next() {
    if (hasNext()) {
      current++;
      return (current - 1);
    } else {
      throw new NoSuchElementException("Element does not exist.");
    }
  }
}
