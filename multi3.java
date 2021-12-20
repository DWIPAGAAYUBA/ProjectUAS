import java.util.Scanner;
public class multi3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBrg = in.nextInt();
        in.nextLine();
        
        String namaBrg[] = new String[jumlahBrg];
        int barang[][] = new int[jumlahBrg][jumlahBrg];
        double totalBrg = 0;

        for(int i = 0; i < jumlahBrg; i++){
            System.out.println();
            System.out.println("Barang ke-" + (i+1));
            System.out.print("Masukkan nama barang: ");
            namaBrg[i] = in.nextLine();
            System.out.print("Masukkan harga barang: ");
            barang[i][0] = in.nextInt();
            in.nextLine();
            System.out.print("Masukkan jumlah barang: ");
            barang[i][1] = in.nextInt();
            in.nextLine();
            totalBrg += barang[i][0] * barang[i][1];
        }
        System.out.println("TOTAL HARGA: " + totalBrg);
    }
}
