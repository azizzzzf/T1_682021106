/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_682021106;

/**
 *
 * @author O M E N
 */
public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 7;
        int c = 4;
        int d = 2;
        System.out.println("a = " + a);
        System.out.println("a*b+c/d = " + (a * b + c / d));
        a += 2;
        b += 1* a;
        b--;
        c -= 3;
        d += 1;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a+b+c*d = " + (a + b + c * d));
        a++;
        System.out.println("a++ = " + a);
        --a;
        System.out.println("--a = " + a);
        --b;
        System.out.println("--b = " + b);
    }
}
