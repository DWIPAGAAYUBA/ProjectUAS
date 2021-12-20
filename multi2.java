import java.util.Scanner;
public class multi2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBrg = in.nextInt();
        in.nextLine();
        
        String namaBrg[] = new String[jumlahBrg];
        int barang[][] = new int[jumlahBrg][jumlahBrg];
        double totalBrg = 0;

        for(int i = 0; i < jumlahBrg; i++){
            System.out.print("Masukkan nama barang ke-" + (i+1) + ": ");
            namaBrg[i] = in.nextLine();
        }

        for(int j = 0; j < barang.length; j++){
            for(int k = 0; k < barang[0].length; k++){
                if(k == 0){
                    System.out.print("Masukkan harga barang ke-" + (j+1) + ": ");
                    barang[j][k] = in.nextInt();
                    in.nextLine();   
                } else if(k == 1){
                    System.out.print("Masukkan jumlah barang ke-" + (j+1) + ": ");
                    barang[j][k] = in.nextInt();
                    in.nextLine();
                }
            }
            System.out.println();
            totalBrg += barang[j][0] * barang[j][1];
        }
        System.out.println("Total barang: " + totalBrg);
    }
}
