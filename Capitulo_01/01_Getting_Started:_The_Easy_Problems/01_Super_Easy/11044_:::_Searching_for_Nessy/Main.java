import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//-----------------------------------------------------------
		int casos=Integer.parseInt(br.readLine()), n, m, rta;
		for(String aux[]; casos--!=0;)
		{
			aux=br.readLine().split(" ");
			n=Integer.parseInt(aux[0]);
			m=Integer.parseInt(aux[1]);
			rta=(n/3)*(m/3);
			System.out.println(rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
