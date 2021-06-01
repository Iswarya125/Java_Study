package CSV_Reading;

import java.io.*;


public class TestCSVReader{
	public void extractData(String csvFilePath) {
		
		try {
			File fObj = new File(csvFilePath);
			FileReader frObj = new FileReader(fObj);
			BufferedReader brObj = new BufferedReader(frObj);
			String[] temp_array;
			String line;
		
			while((line = brObj.readLine()) != null)
			{
				temp_array = line.split(",");
				for(String temp_element : temp_array) {
					System.out.print(temp_element + " ");
				}
			 System.out.println();
			}
		  brObj.close();
		} catch(IOException io) {
			io.printStackTrace();
		}
		
	}
	
	public static void main(String[] args)
	{
		TestCSVReader testObj = new TestCSVReader();
		testObj.extractData("C:\\Users\\iswar\\Downloads\\wordSearch.csv");
	}
}