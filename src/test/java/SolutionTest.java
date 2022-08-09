import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void reverseExample1() {
    assertEquals(321, sol.reverse(123));
  }
  @Test
  void reverseExample2() {
    assertEquals(-321, sol.reverse(-123));
  }
  @Test
  void reverseExample3() {
    assertEquals(21, sol.reverse(120));
  }
}