import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        long[][] ncr = ncrfunc(3000,3000,1000000007);
        while(t-->0){
            String st[] = br.readLine().split(" ");
            int n = Integer.parseInt(st[0]);
            int r = Integer.parseInt(st[1]);

            sb.append(ncr[n][r]+"\n");
        }
		System.out.println(sb);
	}

    public static long[][] ncrfunc(int n, int r, int m){
        long[][] ncr = new long[n+1][r+1];

        for(int i = 1; i<ncr.length; i++){
            ncr[i][0] = 1;
        }

        for(int i = 1; i<ncr.length; i++){
            for(int j = 1; j <= i && j<ncr[0].length; j++){
                if(i == 1 && j == 1){
                    ncr[i][j] = 1;
                }else{
                    ncr[i][j] = (ncr[i-1][j] + ncr[i-1][j-1])%m;
                }
            }
        }
        return ncr;
    }

}
