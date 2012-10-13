import org.junit.*;

public class PrimeFactorsTest {


  @Test(expected = IllegalArgumentException.class) public void testThrowsIfNotNaturalNumber() throws Exception {
    int notNatural = 0;
    PrimeFactors.primeFactors(notNatural);
  }



  @Test public void primeFactorOf2Is2() {
    Assert.assertArrayEquals("primfaktor von 2 sollte {2} sein",new int[]{2},PrimeFactors.primeFactors(2));
  }


  @Test
  public void primeFactorOf3Is3(){
    Assert.assertArrayEquals("primfaktor von 3 sollte {3} sein",new int[]{3},PrimeFactors.primeFactors(3));
  }

  @Test
  public void primeFactorOf4Is2() {
    Assert.assertArrayEquals("primfaktor von 4 sollte {2,2}", new int[]{2,2},PrimeFactors.primeFactors(4));
  }

}
