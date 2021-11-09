package edu.vsu.ru;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        RTestResult testResult = CTests.invalidTest();

        if (testResult != null) {
            testResult.printInvalidResult();
        } else {
            int n = readInt("n");
            int[] array = readIntArray();
            int index = CTask_7.findMaximallyRepeatSubsequence(array, n);
            printIndex(index);
        }
    }

    static int[] readIntArray() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");

        System.out.println("Enter your sequence: ");
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }

        Integer[] array = list.toArray(new Integer[0]);

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    static int readInt(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        System.out.print(name + " = ");

        while (!scanner.hasNextInt()) {
            System.out.println("Parameter entered incorrectly. Re-enter.");
            System.out.print(name + " = ");
            scanner.next();
        }

        int value = scanner.nextInt();

        if (value < 1) {
            System.out.println("Invalid input. Re-enter the " + name);
            value = readInt(name);
        }

        return value;
    }

    static void printIndex(int index) {
        System.out.println("Index of the first maximally repeated subsequence: " + index);
    }
}