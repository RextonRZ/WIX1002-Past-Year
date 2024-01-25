/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Y2019I;

/**
 *
 * @author rz_rexton
 */
import java.util.Scanner;
import java.util.Random;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        
        int[][] matrixA = new int[N][N], matrixB = new int[N][N];
        generateMatrix(matrixA);
        generateMatrix(matrixB);
        System.out.println("Matrix A");
        displayMatrix(matrixA);
        System.out.println("Matrix B");
        displayMatrix(matrixB);
        System.out.println("Matrix A + B");
        addMatrix(matrixA,matrixB);
        System.out.println("Matrix A X B");
        mulMatrix(matrixA,matrixB);
        
    }
    
    private static void generateMatrix(int[][] matrix){
        Random g = new Random();
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                matrix[i][j]= g.nextInt(10);
            }
        }
    }
    
    private static void displayMatrix(int[][] matrix){
        for (int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    private static void addMatrix(int[][] matrix1,int[][] matrix2){
        int[][] addedMatrix = new int[matrix1.length][matrix1.length];
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1.length;j++){
                addedMatrix[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        //print the added matrix out
        for (int i=0; i<addedMatrix.length;i++){
            for(int j=0; j<addedMatrix[i].length;j++){
                System.out.print(addedMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    private static void mulMatrix(int[][] matrix1, int[][] matrix2){
        int[][] mulMatrix = new int[matrix1.length][matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix1.length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                mulMatrix[i][j] = sum;
                }
        }
        //print the multiplied matrix out
        for (int i=0; i<mulMatrix.length;i++){
            for(int j=0; j<mulMatrix[i].length;j++){
                System.out.print(mulMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
