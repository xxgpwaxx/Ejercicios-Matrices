/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//MATRIZ DE 10X1O INGRESADO POR TECLADO MULTIPLIQUE LA DIAGONAL PRIMARIA Y SECUNDARIA
package ejerciciomatriz1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EjercicioMatriz2 {
    //gASPAR pAUCAR wILBER aNDRIHU
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];//Matriz
        int multiDiagonalPrincipal = 1;
        int multiDiagonalSecundaria = 1;  
        for(int i=0;i <matriz.length;i++){
            for(int j=0; j<matriz.length;j++){
                System.out.println("Ingrese el valor de la posicion : ["+i+"]["+j+"] = ");
                matriz[i][j] = sc.nextInt();
                if(i == j){
                    multiDiagonalPrincipal *= matriz[i][j];
                }                
                if(i+j == (matriz.length - 1)){
                    multiDiagonalSecundaria *= matriz[i][j];
                }
            }
        }  
        //Imprimir la matriz
        for(int i=0; i < matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }     
        System.out.println("La multiplicacion de la diagonal primaria es : "+multiDiagonalPrincipal);
        System.out.println("La multiplicacion de la diagonal secundaria es : "+multiDiagonalSecundaria);
    }
}
