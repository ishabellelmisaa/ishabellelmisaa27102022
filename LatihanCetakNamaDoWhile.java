import java.util.Scanner;
public class LatihanCetakNamaDoWhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int i=0,batas;
        String nama="Viola Yosevi";

        System.out.print("Masukkan Batas : ");
        batas = in.nextInt();

        do{
            System.out.println(nama);
            i++;
        } while(i<batas);
    }
}
