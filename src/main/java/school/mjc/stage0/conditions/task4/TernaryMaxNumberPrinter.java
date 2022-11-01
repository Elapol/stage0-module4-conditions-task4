package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public static void main(String[] args) {
        printGreatest(20, 22, 30);
    }

    public static void printGreatest(int first, int second, int third) {
        int result = 0;
               result= first > second ? (first>third ?first:third) : (second>third? second:third);

        System.out.println(result);
    }
}