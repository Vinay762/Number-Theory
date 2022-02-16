import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    int[] arr = new int[100001];
    sieve(arr);
    
    while(t-->0){
        int n = scn.nextInt();
        ArrayList<Integer> ans = factor(arr,n);
        
        for(int val : ans){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    
  }
  
  public static ArrayList<Integer> factor(int[]arr, int n){
      ArrayList<Integer> ans = new ArrayList<>();
      while(n>1){
          ans.add(arr[n]);
          n = n/arr[n];
      }
      return ans;
  }
  
  public static void sieve(int[] arr){
      for(int i = 1; i<arr.length; i++){
          arr[i] = i;
      }
      
      for(int i = 2; i*i<arr.length; i++){
          if(arr[i] == i){
              for(int j = i*i; j<arr.length; j += i){
                  if(arr[j] == j){
                      arr[j] = i;
                  }
              }
          }
      }
      
  }
  
}