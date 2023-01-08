import java.util.Scanner;
public class LatihanCetakNamaWhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int i=0,batas;
        String nama="Resti Aulia Sari";

        System.out.print("Masukkan Batas : ");
        batas = in.nextInt();

        do{
            System.out.println(nama);
            i++;
        } while(i<batas);
    }
}
