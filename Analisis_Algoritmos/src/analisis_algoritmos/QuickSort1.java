/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis_algoritmos;

/**
 *
 * @author ASUS MASTER
 */
public class QuickSort1 {
     public static void main(String a[]){
      int i;
      int array[] = {12,9,4,99,120,1,3,10,13};

      System.out.println("Quick Sort\n");
      System.out.println("Valores antes de QuickSort:\n");
      for(i = 0; i < array.length; i++)
          System.out.print( array[i]+"  ");
      System.out.println();
      quick_srt(array,0,array.length-1);
      System.out.print("\n\n\nValores despues de QuickSort:\n\n");
 
      for(i = 0; i <array.length; i++)
          System.out.print(array[i]+"  ");
      System.out.println();
    }
  public static void quick_srt(int array[],int low, int n){
      int l = low;
      int h = n;
      if (l >= n) {
          return;
      }
      int mid = array[(l + h) / 2];
      while (l < h) {
          while (l<h && array[l] < mid) {
              l++;
          }
          while (l<h && array[h] > mid) {
              h--;
          }
          if (l < h) {
              int T = array[l];
              array[l] = array[h];
              array[h] = T;
          }
      }
      if (h < l) {
          int T = h;
          h = l;
          l = T;
      }
      quick_srt(array, low, l);
      quick_srt(array, l == low ? l+1 : l, n);
   }
}
