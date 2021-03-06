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
		int A, C, alt, tra, ult, rta;
		
		for(String line, aux[]; !(line=br.readLine()).equals("0") && !(line).equals("0 0");)
		{
			aux=line.split("\\s+");
			A=Integer.parseInt(aux[0]);
			C=Integer.parseInt(aux[1]);
	
			rta=0; ult=0;
			aux=br.readLine().split("\\s+");

			for(int i=0; i<C; i++)
			{
				alt=Integer.parseInt(aux[i]);
				tra=A-alt;
				
				if(tra>ult) rta+=tra-ult;
				ult=tra;
			}
			System.out.println(rta);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
