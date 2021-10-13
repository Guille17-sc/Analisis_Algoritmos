/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis_algoritmos;

/**
 *
 * @author Guillermo Saldaña Camacho
 * 3CM2 
 */
public class BurbOptimizad{
    
 public static void main(String[] args) {
                int Num[]={45,17,23,67,21};
                System.out.println("Principal ");
                imprimir(Num);
                System.out.println("\n");
                Num=Optimizacion(Num);
                imprimir(Num);
        }

        public static int[] Optimizacion(int Num[]){
                final int N=Num.length;
                for(int i=N-1;i>0;i--){
                        for(int j=0;j<i;j++){
                                if(Num[j]>Num[j+1]){
                                        int temp=Num[j];
                                        Num[j]=Num[j+1];
                                        Num[j+1]=temp;
                                }
                        }
                        System.out.print("iteracion: "+(N-i)+": ");imprimir(Num);System.out.println();
                }
                return Num;
        }
        
        public static void imprimir(int vec[]){
                for(int i=0;i<vec.length;i++){
                        System.out.print(vec[i]+" ");
                }
        }

}
