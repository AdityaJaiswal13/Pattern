package com.company;

public class Main {

    public static void main(String[] args) {
            pattern10(5);

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
        for(int i=0;i<n;i++){
            for (int k=0;k<n-i;k++){
                System.out.print(" ");

            }
            for(int j=0;j<2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");

            }

        }
        }