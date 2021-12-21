import java.util.Scanner;
public class multi {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBrg = in.nextInt();
        in.nextLine();
        
        String namaBrg[] = new String[jumlahBrg];
        double hargaBrg[] = new double[jumlahBrg];
        int jmlBrg[] = new int[jumlahBrg];
        double totalBrg = 0;

        for(int i = 0; i < jumlahBrg; i++){
            System.out.print("Masukkan nama barang ke-" + (i+1) + ": ");
            namaBrg[i] = in.nextLine();
            System.out.print("Masukkan harga barang ke-" + (i+1) + ": ");
            hargaBrg[i] = in.nextDouble();
            in.nextLine();
            System.out.print("Masukkan jumlah barang ke-" + (i+1) + ": ");
            jmlBrg[i] = in.nextInt();
            in.nextLine();
            System.out.println();
            totalBrg += hargaBrg[i] * jmlBrg[i];
        }
        System.out.println("Total barang: " + totalBrg);
    }
}
