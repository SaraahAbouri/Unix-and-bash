import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSVreader {
    
    // public static final String[] Dams = null;
    public static String M;


	public static Dam [] CSVreader() {

        String csvFile = "data2.csv";
        Dam[] Arrayinfo = new Dam[211];
        String line = "";
        String cvsSplitby = ",";
        int i = -1;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        while ((line = br.readLine()) != null) {
            String[] Dams = line.split(cvsSplitby);

             if (i > -1) {
                 Arrayinfo[i] = new Dam(Dams[2].trim(), Dams[10].trim(), Dams[25].trim());
                //  System.out.println(i);
                
            }
            i++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return Arrayinfo;
    }
    
    
}    
