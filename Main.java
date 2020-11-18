package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner r = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Porfavor a continuacion ingrese un total de 10 numeros aleatorios: ");
        for(int x = 0;x<10;x++){
            System.out.println("Ingrese un numero ("+(x+1)+"): ");
            numeros[x]=r.nextInt();
        }
        System.out.println("Los numeros ingresados son: ");
        for(int x = 0;x<10;x++){
            System.out.println((x+1)+". "+numeros[x]);
        }
        ordenamiento(numeros);
    }
    public static void ordenamiento(int[] numeros){
        int temp;
        for(int x = 1;x < numeros.length;x++){
            for(int y=0;y < numeros.length-1;y++){
                if(numeros[y]<numeros[y+1]){
                    temp = numeros[y];
                    numeros[y]=numeros[y+1];
                    numeros[y+1]=temp;
                }
            }
        }
        System.out.println("Los numeros ingresados ordenados de forma descendiente son: ");
        for(int x = 0;x<10;x++){
            System.out.println((x+1)+". "+numeros[x]);
        }
    }
}
