package edu.vsu.ru;

public class CTests {
    static final RTestCase[] TEST_CASES = {
            new RTestCase(new int[] {5, 1, 1, 1, 1, 1, 1, 1, 1, 4, 5, 6, 4, 5, 6, 4, 5, 6}, 3, 9),
            new RTestCase(new int[] {-3, 7, 3, 4, 8, 4, 8, 4, 7, 3, 4, 8, 0, 6, -1, 4, 7, 3, 3}, 3, 1),
            new RTestCase(new int[] {8, 9, 8, 9, 8, 9, 1, 2, 3, 4, 1, 2, 3, 4, 5, 5, 5, 5, 5}, 4, 6),
            new RTestCase(new int[] {5, 6, 7, 6, 7, 6, 7, 7, 6, 7, 7, 6, 7, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, 3,   2),
            new RTestCase(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, 4, 0),
            new RTestCase(new int[] {6, 7, 2, 7, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 4, 4),
            new RTestCase(new int[] {5, 5, 5, 2, 7, 2, 7, 2, 7, 2, 7, 2, 7, 2, 7, 2}, 4, 3),
            new RTestCase(new int[] {5, 4, 3, 4, 4, 3, 4, 3, 3, 4, 4, 5, 5, 5, 6}, 1, 1),
            new RTestCase(new int[] {5, 4, 5, 4, 5, 5, 567, -2, 5, 6, 5, 6, 5, 6, 5, 6, 5, 6}, 2, 8),
            new RTestCase(new int[] {-8, 0, 0, 8, 5, 3, 5, 6, 2, 5, 6, 2, 6, 7, 7, 8, -10, -34}, 3, 9)
    };

    public static RTestResult invalidTest() {
        System.out.println("Check tests.....");
        for (RTestCase testCase : TEST_CASES) {

            int index = CTask_7.findMaximallyRepeatSubsequence(testCase.array(), testCase.subseqSize());

            if (index != testCase.index()) {
                return new RTestResult(testCase, index);
            }
        }
        return null;
    }
}
