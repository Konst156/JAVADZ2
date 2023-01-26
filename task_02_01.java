import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class task_02_01 {
    public static void main(String[] args) throws IOException {
        parseFile("file.txt", "output.txt");
    }
    public static void parseFile(String inputFileName, String outputFileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));
        String line = br.readLine();
        
        while (line != null) {
            String[] parts = line.split(",");
            String lastName = parts[0].split(":")[1];
            String grade = parts[1].split(":")[1];
            String subject = parts[2].split(":")[1];
            String result = "Студент " + lastName.replace("\"", "") + " получил " + grade + " по предмету " + subject.replace("\"", "") + ".";
            System.out.println(result);
            bw.write(result);
            bw.newLine();
            line = br.readLine();
        }
        br.close();
        bw.close();
    }
}
