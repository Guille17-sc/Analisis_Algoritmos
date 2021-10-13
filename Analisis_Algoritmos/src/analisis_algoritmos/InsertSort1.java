/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis_algoritmos;
import java.util.*;
/**
 *
 * @author Guillermo Saldaña Camacho 
 */
public class InsertSort1 {
    public static void main(String[] args) {  
        
    int[] NumA = {10,6,15,4,1,45};  
    System.out.println("Principal:" + Arrays.toString(NumA));
   
    for(int k=1; k<NumA.length-1; k++)   {  
        int temp = NumA[k];  
        int j= k-1;  
        while(j>=0 && temp <= NumA[j])   {  
            NumA[j+1] = NumA[j];   
            j = j-1;  
        }  
        NumA[j+1] = temp;  
    }  
  
    System.out.println("Resultado:" + Arrays.toString(NumA));
}  
}
