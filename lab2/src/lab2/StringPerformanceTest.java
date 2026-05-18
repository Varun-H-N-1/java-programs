/*
Write a Java program to perform a performance test on StringBuffer and StringBuilder
by appending the string "AIET" 10000 times and compare which one is faster.
*/
package lab2;
public class StringPerformanceTest {
    public static void main(String[] args) {

        // Performance test for StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long startTimeBuffer = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuffer.append("AIET");
        }

        long endTimeBuffer = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTimeBuffer - startTimeBuffer) + " ms");

        // Performance test for StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startTimeBuilder = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            sbuilder.append("AIET");
        }

        long endTimeBuilder = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTimeBuilder - startTimeBuilder) + " ms");

        // Conclusion
        if ((endTimeBuilder - startTimeBuilder) < (endTimeBuffer - startTimeBuffer)) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}