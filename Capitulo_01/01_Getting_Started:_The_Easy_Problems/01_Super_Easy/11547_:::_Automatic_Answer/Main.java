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
		int casos=Integer.parseInt(br.readLine());

		while(casos--!=0)
		{
			int num=Integer.parseInt(br.readLine());
			num=((((num*63)+7492)*5)-498);

			char[] digitos = (num+"").toCharArray();

			System.out.println(digitos[digitos.length-2]);
		}
		//-----------------------------------------------------------
		br.close();
	}
}
