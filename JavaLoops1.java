//https://www.hackerrank.com/challenges/java-loops-i/problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops1 {
    
    public void solution() throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }

        bufferedReader.close();
    }

}
