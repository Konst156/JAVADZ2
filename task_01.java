import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class task_01 {
    public static void main(String[] args) throws IOException {
        int[] array = {5, 3, 8, 6, 2};
        File file = new File("log.txt");
        PrintWriter pw = new PrintWriter(file);
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            pw.println(java.util.Arrays.toString(array));
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        pw.close();
    }
}