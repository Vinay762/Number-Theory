import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int k = scn.nextInt();

    long[] arr = new long[n];
    for (int z = 0; z < n; z++) {
      arr[z] = scn.nextInt();
    }
    
    arr = sort(arr);
    int m1 = 1000000006;
    int m  = 1000000007;
    
    long[][] ncr = ncrcoll(n,k,m1);
    long[]count = new long[n];
    
    long total = ncr[n-1][k-1];
    
    for(int i = 1; i<= n/2; i++){
        long maxcount = 0;
        long mincount = 0;
        
        if(i >= k-1){
            maxcount = ncr[i][k-1];
        }
        
        if(n-1-i >= k-1){
            mincount = ncr[n-1-i][k-1];
        }
        
        long valid = (total-mincount+m1)%m1;
        valid = (valid - maxcount + m1)%m1;
        
        count[i] = valid;
        count[n-1-i] = valid;
    }
    
    long ans = 1;
    for(int i = 1; i<n-1; i++){
        long pow = xpown(arr[i],count[i]);
        ans = (ans*pow)%m;
    }
    System.out.println(ans);
  }
  
  public static long[] sort(long[] arr){
      ArrayList<Long> list = new ArrayList<>();
      
      for(int i = 0; i<arr.length; i++){
          list.add(arr[i]);
      }
      
      Collections.sort(list);
      
      for(int i = 0; i<arr.length; i++){
          arr[i] = list.get(i);
      }
      return arr;
  }
  
  static long[][] ncrcoll(int n, int k, int p){
      long[][] arr = new long[n+1][k+1];
      for(int i = 0; i<arr.length; i++){
          arr[i][0] = 1;
      }
      
      for(int i = 1; i<arr.length; i++){
          for(int j = 1; j <= i && j<arr[0].length; j++){
              arr[i][j] = (arr[i-1][j] + arr[i-1][j-1])%p;
          }
      }
      return arr;
  }
  
  public static long xpown(long x, long n){
      long res = 1;
      while(n > 0){
          if(n%2 == 1){
              res = (res*x)%1000000007;
              n--;
          }else{
              x = (x*x)%1000000007;
              n = n/2;
          }
      }
      return res;
  }

}
