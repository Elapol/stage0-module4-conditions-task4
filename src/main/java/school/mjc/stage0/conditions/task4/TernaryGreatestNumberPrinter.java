package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public static void main(String[] args) {
        printGreatest(5, 6);
    }
    public static void printGreatest(int first, int second) {
        int result = 0;
            result = first>=second ? first:second;
            System.out.println(result);

        }


    }


