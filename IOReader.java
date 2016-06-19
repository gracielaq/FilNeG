import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOReader {
    
public static void main(String[] args){
    IOReader io=new IOReader();
    io.read();
}
    String csvFile="/Users/gracielaquiambao/Downloads/DataSheet.csv";
    BufferedReader br= null;
    String line="";
    String split=",";
    public static String [] tweets=new String[99999];    
    public void read(){
        try{
            br =new BufferedReader(new FileReader(csvFile));
            System.out.println("DATE & TIME:" + "\t\tTWEET: " + "\t\t\t\t\t\t\t\t\t\t\tUSER:");
            while((line =br.readLine())!=null){
              //comma as separator
              tweets=line.split(split);
              System.out.println( tweets[0] + "\t" + tweets[1] + "\t\t"+tweets[11]);
            }
        }
        catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
        finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
                }
        }
    }
}
