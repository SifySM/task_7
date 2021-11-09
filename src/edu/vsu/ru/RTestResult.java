package edu.vsu.ru;

public record RTestResult(RTestCase InvalidTestCase, int invalidIndex) {

    void printInvalidResult() {
        System.out.println("Error test!");
        System.out.println("Sequence: ");
        for (int elem : InvalidTestCase().array()) {
            System.out.print(elem + ", ");
        }

        System.out.println();
        System.out.println("Subsequence length: " + InvalidTestCase().subseqSize());
        System.out.println("Subsequence index (true): " + InvalidTestCase().index());
        System.out.println("Error program solution: index = " + invalidIndex);
    }
}
