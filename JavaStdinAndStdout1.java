//https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

import java.util.Scanner;

public class JavaStdinAndStdout1 {

    public void solution() {
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
    
}