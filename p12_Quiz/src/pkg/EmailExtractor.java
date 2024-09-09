package pkg;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class EmailExtractor {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("입력할 이메일 수 : ");
            int eCnt = Integer.parseInt(br.readLine()); // Read and parse the integer input
            System.out.println();

            String[] eIds = new String[eCnt];
    
            for (int i = 0; i < eCnt; i++) {
                System.out.print((i + 1) + "번 입력 : ");
                String email = br.readLine(); // Read the email input as a string
                String[] eId = email.split("@");
                eIds[i] = eId[0];
            }
            
            Arrays.sort(eIds);
            System.out.println("\n----------------------------");
            System.out.println(Arrays.toString(eIds));
            System.out.println("\n\nEnd");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}