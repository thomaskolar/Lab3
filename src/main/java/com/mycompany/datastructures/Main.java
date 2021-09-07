
package com.mycompany.datastructures;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(100);
        int m = sc.nextInt();
        while (m != 0)
        {
            stack.push(m);
            m = sc.nextInt();
        }
        while(!stack.isEmpty())
        {
            int p = stack.pop();
            System.out.printf("%d ", p);
        }
        System.out.println();
    }
}
