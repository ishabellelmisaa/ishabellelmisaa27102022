import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author isabel
 */
public class LatihanInputNilai {
    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double nilai1 = 0,nilai2 = 0,nilai3 = 0,rata,jumlah;

        try {
            System.out.print("Masukkan Nilai Ujian 1 : ");
            nilai1 = Double.parseDouble(input.readLine());
            System.out.print("Masukkan Nilai Ujian 2 : ");
            nilai2 = Double.parseDouble(input.readLine());
            System.out.print("Masukkan Nilai Ujian 3 : ");
            nilai3 = Double.parseDouble(input.readLine());

        } catch (IOException ex) {
            Logger.getLogger(LatihanInputNilai.class.getName()).log(Level.SEVERE, null, ex);
        }
        jumlah = (nilai1 + nilai2 + nilai3);
        System.out.println("Jumlah Nilai = " +jumlah);
        rata = jumlah / 3;
        System.out.println("Rata-Rata Nilai = " +rata);

        if(rata>=60){
            System.out.println(":)");
        }
        else{
            System.out.println(":(");
        }



    }
}
