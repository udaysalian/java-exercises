package org.launchcode.java.demos.java4python;

/**
 * Created by LaunchCode
 */
public class ForLoopPractice {

    public static void main(String[] args) {

        // Replicate each of the Python loops in Java

        /*
        for i in range(2,101,2)
            print(i)
        */
        for (int i = 2; i < 101; i=i+2) {
            System.out.println(i);
        }

        /*
        for i in range(1,100)
            print(i)
        */

        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
        /*
        for i in range(100,0,-1)
            print(i)
        */

        for (int i = 100; i > 0 ; i--) {
            System.out.println(i);
        }

    }
}
