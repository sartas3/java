
package matrizsimetrica;
import java.util.Random;
import java.util.Scanner;
public class MatrizSimetrica {

    public static void main(String[] args) {
        //Holaaa
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame filas");
        int f=sc.nextInt();
        System.out.println("Dame columnas");
        int c=sc.nextInt();
        int[][] matriz=new int[f][c];
        if(cuadrada(matriz)){
            rellenarmatriz2(matriz); 
            simetrica(matriz);
        }else{
            System.out.println("No es cuadrada");
        }
     }
    
    public static boolean cuadrada(int[][] m){
        boolean cuadrada=true;
        if (m.length != m[0].length){
            cuadrada=false;
        }
        return cuadrada;
       }
    public static void rellenar(int[][] m){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                 System.out.println("dame un elemento");
                  m[i][j]=sc.nextInt();
            }
        }
    }
    public static boolean traspuesta(int[][] m){
        boolean traspuesta=true;
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                if (m[i][j]!=m[j][i]){
                    traspuesta=false;
                }
            }
        }
        return traspuesta;
        
    }
    public static void simetrica(int[][] m){
        if(cuadrada(m) && traspuesta(m)){
            System.out.println("Es Simétrica");
        }else{
            System.out.println("No es simétrica");
        }
       
    }
    public static void rellenarmatriz2(int[][] m){
        Random r=new Random();
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){
                m[i][j]=r.nextInt(9);
            }
        }
    }
    

}
