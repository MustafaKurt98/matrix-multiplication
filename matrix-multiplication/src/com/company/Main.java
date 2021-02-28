package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] m1 = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] m2 = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] m3;
        m3=matrixMultiplication(m1,m2, m2[0].length);
        for (int i=0;i< m3.length;i++){
            for (int j=0;j<m3[0].length;j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println("\n");
        }


    }
    public static int[][] matrixMultiplication(int[][] x, int[][] y, int yLength){
        int sum;
        int[][] z=new int[x.length][yLength];
        for (int i=0;i<x.length;i++){
            for (int j=0;j<yLength;j++){
                sum=0;
                for(int k=0;k<y.length;k++){
                    sum+=(x[i][k]*y[k][j]);
                }
                z[i][j]=sum;
            }
        }

        return z;
    }

}
