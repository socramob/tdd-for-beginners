public class PrimeFactors {
  static public int[] primeFactors(int natural) {
    if (natural <= 0){
      throw new IllegalArgumentException("Argument is not a natural number");
    }
    if (natural < 4) {
      return new int[]{natural};
    }
    int rest = natural % 2;
    int factor = natural / 2;
    return new int[]{2,factor};

  }
}
