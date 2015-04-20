package sequence;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class sequence {
	private static String nacc_input_file = "resources/nacc_input.csv";	
	private static String adni_input_file="resources/adni_input.csv";
	private static String laadc_input_file="resources/LAADC_input.csv";
	private static String indd_input_file="resources/INDD_input.csv";
	

	private static void readFile() throws FileNotFoundException, UnsupportedEncodingException{
		
		ReadCVS obj = new ReadCVS();
		ArrayList<String> arr = new ArrayList<String>();
		arr=obj.run(nacc_input_file);
		prefix(arr);
		
		System.out.println("\n\n\n\n");
		suffix(arr);
		/*(for(int i = 0; i < arr.size(); i++) 
		{
			System.out.print(arr.get(i)+"\n");
		}  */
		
	}
	
	public static void print(ArrayList<String> array,int i) throws FileNotFoundException, UnsupportedEncodingException
	{
		/*for(int i = 0; i < array.size(); i++) 
		{
			System.out.print(array.get(i)+"\n");
		
					}  */
		String filename="";
		if (i==1)
		{
			 filename="/Users/Arihant/Documents/sequence/sequence/resources/prefix_file.txt";
		}
		else
		{
			 filename="/Users/Arihant/Documents/sequence/sequence/resources/suffix_file.txt";
		}
		PrintWriter writer = new PrintWriter(filename, "UTF-8");
		
		Set<String> unique = new HashSet<String>(array);
		for (String key : unique) {
		    System.out.println(key + ": " + Collections.frequency(array, key));
		    writer.println(key + ": " + Collections.frequency(array, key));
		}
		writer.close();
			}
	
	public static void prefix(ArrayList<String> array) throws FileNotFoundException, UnsupportedEncodingException {
		ArrayList<String> arrayli = new ArrayList<String>();
		
		for(int n = 0; n < array.size(); n++) 
		{

		String s=array.get(n).toLowerCase();
			
		int i=2;
		int j=1;
		int l=0;
		int len=s.length();

		if (len<4)
			l=len;
		else
			l=5;
		
		while(j<l)

		{ 
			String upToNCharacters = s.substring(0, Math.min(s.length(), i));
			 
			
			//arraylist.get(0).setID("yourid");
			
			arrayli.add(upToNCharacters);

		    i++;
			j++;
		}
		}
		print(arrayli,1);
		
		  
		}
	
	
	public static void suffix(ArrayList<String> array) throws FileNotFoundException, UnsupportedEncodingException {
		
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		for(int n = 0; n < array.size(); n++) 
		{

		String s1=array.get(n).toLowerCase();
		String s = new StringBuffer(s1).reverse().toString();
		int i=2;
		int j=1;
		int l=0;
		int len=s.length();

		if (len<4)
			l=len;
		else
			l=5;
		
		while(j<l)

		{ 
			String upToNCharacters = s.substring(0, Math.min(s.length(), i));
			 
			
			//arraylist.get(0).setID("yourid");
			
			arraylist.add(new StringBuffer(upToNCharacters).reverse().toString());

		    i++;
			j++;
		}
		}
		print(arraylist,2);
		

		}

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
		readFile();
	}

}
