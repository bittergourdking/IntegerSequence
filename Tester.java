public class Tester {
  public static void main(String[] args) {
    IntegerSequence r = new Range(5, 25);
    while (r.hasNext()) {
      System.out.print(r.next());
      if (r.hasNext()) {
        System.out.print( ", " );
      }
    }
    System.out.println();

    int[]nums = {17, 13, 3, 1};
    IntegerSequence as = new ArraySequence(nums);
    System.out.println(as.length());
    System.out.println();
    System.out.println("ArraySequence(array):");
    while (as.hasNext()) {
      System.out.print(as.next() + ", ");
    }
    System.out.println();

    IntegerSequence newr = new Range(10,20);
    IntegerSequence newas = new ArraySequence(newr);
    System.out.println("ArraySequence(seq):");
    while(newas.hasNext()){
      System.out.print(newas.next()+", ");
    }
    System.out.println();
  }
}
