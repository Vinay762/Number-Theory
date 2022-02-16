import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int t = Integer.parseInt(br.readLine());
    StringBuilder sb = new StringBuilder();

    int[] arr = {1,1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
    while(t-->0){
      String[] st = br.readLine().split(" ");
      int a = Integer.parseInt(st[0]);
      int b = Integer.parseInt(st[1]);
      int c = Integer.parseInt(st[2]);
      long x = arr[c];
      long y = arr[c];

      while(x < arr[a]){
        x *= 2;
      }

      while(y < arr[b]){
        y *= 3;
      }

      System.out.println(x+ " "+y);

    }
    //System.out.println(sb);
  }
}