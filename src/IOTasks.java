import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOTasks {
    public static void main(String[] args) throws Exception {
        String [] a = new String[5];
        for (int i = 0; i < 5; i++){
            a[i] = Integer.toString (i) + " ";
        }
        Second(a,"end.txt");
    }
    public static void First() throws Exception{
    BufferedReader reader = new BufferedReader(new FileReader("exam/a.txt"));
        String line;
        List<String> lines = new ArrayList<String>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        String [] linesAsArray = lines.toArray(new String[lines.size()]);
        int s = 0;
        
        for (int i = 0; i < linesAsArray.length; i++) {
            String numberString = linesAsArray[i];
            System.out.println(linesAsArray[i]);
            for (String l : numberString.split(" ")) {
                s = s + Integer.parseInt(l);
            }
        }
        System.out.println(s);
    }
    public static void Second(String[] A, String file) throws Exception{
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            for (int i = 0; i < A.length; i++) {
                bufferWriter.write(A[i] + "\n");
            }
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

