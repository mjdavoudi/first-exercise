package com.mapsahr.exercise.calculators;

public class ExtendedCalculator {
    private ExtendedCalculator() {
    }

    public static Integer min(Integer[] integers) {
        Integer result = null;
        for (Integer integer : integers) {
            if (result == null || integer < result) {
                result = integer;
            }
        }

        return result;
    }

    public static Integer[] primes(Integer[] integers) {
        Integer[] result = new Integer[integers.length];

        for (int i = 0; i < integers.length; i++) {
            if (isPrime(integers[i])) {
                result[i] = integers[i];
            }
        }
        return result;
    }

    public static Double avg(Integer[] integers) {
        if (integers.length == 0) {
            return null;
        }
        Integer sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return (double) sum / integers.length;
    }

    public static int count(Integer[] integers, int number) {
        int result = 0;
        for (int integer : integers) {
            if (integer == number) {
                result += 1;
            }
        }

        return result;
    }

    public static Integer[] reverse(Integer[] integers) {
        Integer[] result = new Integer[integers.length];
        int index = integers.length - 1;
        for (Integer integer : integers) {
            result[index] = integer;
            index--;
        }
        return result;
    }

    public static Integer[] subArray(Integer[] integers, int start, int end) {
        if (start < 0 || end < 0) {
            System.err.println("start or end numbers must be greater then 0.");
            return null;
        }

        if (start > integers.length || end > integers.length) {
            System.err.println("start or end numbers must be lower than count of numbers.");
            return null;
        }

        if (start >= end) {
            System.err.println("the start number must be lower than end number.");
            return null;
        }

        Integer[] result = new Integer[end - start + 1];
        int index = 0;
        for (int i = start; i <= end; i++) {
            result[index] = integers[i];
            index ++;
        }
        return result;
    }

    private static boolean isPrime(Integer number) {
        if (number == 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
