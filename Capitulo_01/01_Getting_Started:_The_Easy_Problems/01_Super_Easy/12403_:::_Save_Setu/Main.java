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
		int casos=Integer.parseInt(br.readLine()), total=0;
		String[] comando;

		while(casos--!=0)
		{
			comando=br.readLine().split(" ");
			if(comando[0].equals("donate")) total+=Integer.parseInt(comando[1]);
			else System.out.println(total);
		}		
		//-----------------------------------------------------------
		br.close();
	}
}
