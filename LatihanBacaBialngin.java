import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LatihanBacaBilangan {
    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int bil;


        try {
            System.out.print("Masukkan Angka : ");
            bil = Integer.parseInt(input.readLine());
            if(bil>=1 && bil<=10){
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Invalid Number");
        }
        } catch (IOException ex) {
            Logger.getLogger(LatihanBacaBilangan.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
