package sequence;
//import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
public class ReadCVS {
 
  public static void main(String[] args) {
 
	//ReadCVS obj = new ReadCVS();
    //String csvFile = "/Users/Arihant/Documents/sequence/sequence/resources/nacc_input.csv";
 
  }
 
  public ArrayList<String>  run(String fileloc) {
 
	
	BufferedReader br = null;
	String line = "";
	String cvsSplitBy = ",";
	ArrayList<String> anExpandableArray = new ArrayList<String>();
	// add String data
	
 
	try {
 
		br = new BufferedReader(new FileReader(fileloc));
		while ((line = br.readLine()) != null) {
 
		        // use comma as separator
			String [] x=line.split(cvsSplitBy);
			anExpandableArray.add(x[0]);

 
		}
		
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
  
	//System.out.println("Done");
	return anExpandableArray;
  }
 
}