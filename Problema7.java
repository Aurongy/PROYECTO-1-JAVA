package com.mycompany.proyecto1_7690_23_3711;

import java.util.Scanner;

public class Problema7 {
    private int filas;
    private int columnas;
    private double[][] matriz;
    
    public Problema7(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
        matriz = new double[filas][columnas];
    }
    
    public Problema7(Problema7 m){
        this.filas = m.filas;
        this.columnas = m.columnas;
        matriz = new double[filas][columnas];
        
        for (int i = 0; filas < 10; i++) {
            for (int j = 0; columnas < 10; j++) {
                matriz[i][j] = 0.0; 
            } 
        }
        if(filas > 0 && columnas >0){
            matriz[0][0] = 99.9;
            
        }  
    }
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextDouble();
            }
        }
    }
    public void imprimir(){
        System.out.println("Matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                 System.out.printf("%.2f\t", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public double encontrar(){
        double max = matriz[0][0];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(matriz[i][j] > max){
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }
    public Problema7 sumar(Problema7 m){
        if (this.filas != m.filas || this.columnas != m.columnas) {
            throw new IllegalArgumentException("Dimensiones incompatibles para suma.");
        }
        Problema7 resultado = new Problema7(filas, columnas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.matriz[i][j] = this.matriz[i][j] + m.matriz[i][j];   
            }
        }
        return resultado;
    }
    public Problema7 multiplicar(Problema7 m){
        if(this.columnas != m.filas){
            throw new IllegalArgumentException("Dimensiones incompatibles para multiplicación.");
        }
        Problema7 resultado = new Problema7(this.filas, m.columnas);
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < m.columnas; j++) {
                for (int k = 0; k < this.columnas; k++) {
                    resultado.matriz[i][j] += this.matriz[i][k] * m.matriz[k][j];
                }
            }  
        }
        return resultado;
    }
}

