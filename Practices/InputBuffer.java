import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class InputBuffer {
    int i;
    public static void main(String[] args) throws IOException {
        InputBuffer ip = new InputBuffer();
        System.out.print("Enter a Number : ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ip.i = Integer.parseInt(br.readLine());
        System.out.println("Number is : "+ip.i);
    }
}