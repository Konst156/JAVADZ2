import java.util.Scanner;

public class task_03 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = input.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString().equals(str));
        input.close();
    }
    
}    
