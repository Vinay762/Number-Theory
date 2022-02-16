import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inp = br.readLine().split(" ");
		int l = Integer.parseInt(inp[0]);
		int r = Integer.parseInt(inp[1]);
		System.out.println("YES");
		for(int i = 0; i<r-l+1; i+=2){
			System.out.println((l+i)+" "+(l+i+1));
		}	
	}
}
