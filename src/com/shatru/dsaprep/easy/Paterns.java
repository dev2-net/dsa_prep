package com.shatru.dsaprep.easy;
public class Paterns {

    public static void main(String[] args) {
        new Paterns().printPatern7(3);
    }

    private void printPatern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void printPatern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printPatern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private void printPatern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    private void printPatern5(int n) {
        for (int i = n; i >0 ; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private void printPatern6(int n) {
        for (int i = n; i >0 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    private void printPatern7(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <(n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=(i+i); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <(n-i-1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void printPatern8(int rows, int col) {

        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*rows-(2*i+1)); j++) {
                System.out.print("*");
            }
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}