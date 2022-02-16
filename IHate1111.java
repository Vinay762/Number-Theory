import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int t = Integer.parseInt(br.readLine());
	   while(t-->0){
		   int n = Integer.parseInt(br.readLine());
		   int b = n%11;
		   int temp = n - 111*b;
		   if(temp >= 0 && temp%11 == 0){
			   System.out.println("YES");
		   }else{
			   System.out.println("NO");
		   }
	   }
	}
}
