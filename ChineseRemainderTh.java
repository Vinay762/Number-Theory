import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //Write code here
    Scanner sc = new Scanner(System.in);
    
    long a1 = sc.nextLong();
    long n1 = sc.nextLong();
    
    long a2 = sc.nextLong();
    long n2 = sc.nextLong();
    
    Pair p = euclids(n1,n2);//x' y' and gcd(n,n2);
    long x = p.x;
    long gcd = p.gcd;
    
    if((a1-a2)%gcd != 0){
        System.out.println("no solution");
    }else{
        long k = (a1-a2)/gcd;
        long lcm = (n1*n2)/gcd;
        long a = a1-n1*(k*x%(n2/gcd));
        if(a<0){
            a += lcm;
        }
        System.out.println(a+" "+lcm);
    }
    

  }

//========= Extended Euclidean Algorithm =========//
//------------------------------------------------//

  public static class Pair {
    long x;
    long y;
    long gcd;

    public Pair(long x, long y, long gcd) {
      this.x = x;
      this.y = y;
      this.gcd = gcd;
    }
  }

  public static Pair euclids(long a, long b) {
    if (b == 0) {
      return new Pair(1, 0, a);
    }
    Pair dash = euclids(b, a % b);

    return new Pair(dash.y, dash.x - ((a / b) * dash.y), dash.gcd);
  }
}