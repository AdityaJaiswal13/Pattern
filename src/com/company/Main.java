package com.company;

public class Main {

    public static void main(String[] args) {
            pattern13(5);

        }
        static void pattern8(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print("*");
                }System.out.println();
            }

        }
        static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print(j);
            }System.out.println();
        }
        }
        static void pattern10(int n) {
        for(int i=0;i<=n;i++){
            for (int k=0;k<=n-i;k++){
                System.out.print(" ");

            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");

            }

        }
        static void pattern11(int n){
            for(int i=5;i>=0;--i) {
                for (int k = 0; k < n-i; k++) {
                    System.out.print(" ");

                }for (int j = 0; j < 2 * i - 1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        static void pattern12(int n){
            for(int i=0;i<=n;i++){
                for (int k=0;k<n-i;k++){
                    System.out.print(" ");

                }
                for(int j=0;j<2*i-1;j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int i=5;i>=0;--i) {
                for (int k = 0; k < n-i; k++) {
                    System.out.print(" ");

                }for (int j = 0; j < 2 * i - 1; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }


        }
        static void pattern13(int n){
            for(int i=1;i<=n;i++) {
                for (int j =1;j<=i; j++){
                    System.out.print("*");}
                for (int k =1; k <= n-i; k++) {
                    System.out.print(" ");
                }
                System.out.println("");
            }
            for(int i=n;i>0;i--){
                for (int j=0;j<i-1;j++){
                    System.out.print("*");
                }
                System.out.println("");

            }




}}




