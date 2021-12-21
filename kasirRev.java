import java.util.Scanner;
import java.util.Date;

public class kasirRev {
    public static String metodeBayar(int pil) {
        String pilihanBayar = " ";
        if(pil == 1){
            pilihanBayar = "Cash";
        } else if(pil == 2){
            pilihanBayar = "Debit";
        } else if(pil == 3){
            pilihanBayar = "e-Wallet";
        }
        return pilihanBayar;
    }
    public static int jumlahBrg;
    public static String namaBrg[];
    public static int barang[][];
    public static double hargaItem[];
    public static int stok[] = {100/*AQUA*/, 50/*SPRITE*/, 50/*KOPIKAP*/, 30/*LAYS*/, 30/*RINGBEE*/,
                                40/*OREO*/, 40/*BETTER*/, 100/*INDOMIE*/, 50/*MILO*/, 50/*BISKUAT*/};
    public static void fiturStok(String namaBarang, int jumlahBarang){
        switch (namaBarang.toLowerCase()) {
            case "aqua":
                stok[0] -= jumlahBarang;
                break;
            case "sprite":
                stok[1] -= jumlahBarang;
                break;
            case "kopikap":
                stok[2] -= jumlahBarang;
                break;
            case "lays":
                stok[3] -= jumlahBarang;
                break;
            case "ringbee":
                stok[4] -= jumlahBarang;
                break;
            case "oreo":
                stok[5] -= jumlahBarang;
                break;
            case "better":
                stok[6] -= jumlahBarang;
                break;
            case "indomie":
                stok[7] -= jumlahBarang;
                break;
            case "milo":
                stok[8] -= jumlahBarang;
                break;
            case "biskuat":
                stok[9] -= jumlahBarang;
                break;
            default:
                break;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Date tanggal = new Date();
        System.out.print("Masukkan nama kasir: "); 
        String namaKasir = sc.nextLine();

        String nomor = "0";
        int pilihan, pilihBayar = 0, rek = 0, ewallet;
        double totalBarang = 0, kembalian = 0, diskon = 0, stlhDiskon = 0, ppn = 0, totalFinal = 0, nominal = 0;
        do {
            System.out.println();
            System.out.println("Pilih menu transaksi:");
            System.out.println("1. Stok Produk");
            System.out.println("2. Input Data Penjualan");
            System.out.println("3. Pembayaran");
            System.out.println("4. Cetak Nota Transaksi");
            System.out.println("5. Sisa Stok Produk");
            System.out.print("Pilihan menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch(pilihan){
                case 1:
                    System.out.println();
                    System.out.println("INFORMASI STOK PRODUK");
                    System.out.println("AQUA        : " + stok[0]);
                    System.out.println("SPRITE      : " + stok[1]);
                    System.out.println("KOPIKAP     : " + stok[2]);
                    System.out.println("LAYS        : " + stok[3]);
                    System.out.println("RINGBEE     : " + stok[4]);
                    System.out.println("OREO        : " + stok[5]);
                    System.out.println("BETTER      : " + stok[6]);
                    System.out.println("INDOMIE     : " + stok[7]);
                    System.out.println("MILO        : " + stok[8]);
                    System.out.println("BISKUAT     : " + stok[9]);
                    break;
                case 2:
                    System.out.println();
                    System.out.print("Masukkan jumlah produk: ");
                    jumlahBrg = sc.nextInt();
                    sc.nextLine();

                    namaBrg = new String[jumlahBrg];
                    barang = new int[jumlahBrg][2];
                    hargaItem = new double[jumlahBrg];

                    for(int i = 0; i < jumlahBrg; i++){
                        System.out.println();
                        System.out.println("Barang ke-" + (i+1));
                        System.out.print("Masukkan nama barang: ");
                        namaBrg[i] = sc.nextLine();
                        System.out.print("Masukkan harga barang: ");
                        barang[i][0] = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan jumlah barang: ");
                        barang[i][1] = sc.nextInt();
                        sc.nextLine();

                        fiturStok(namaBrg[i], barang[i][1]);
                        hargaItem[i] = (double)barang[i][0] * barang[i][1];
                        totalBarang += hargaItem[i];
                    }

                    if(totalBarang >= 20000){
                        diskon = totalBarang * 0.2;
                    } if(totalBarang >= 50000){
                        diskon = totalBarang * 0.4;
                    } if(totalBarang >= 100000){
                        diskon = totalBarang * 0.5;
                    }
                    stlhDiskon = totalBarang - diskon;
                    ppn = totalBarang * 0.1;
                    totalFinal = stlhDiskon + ppn;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Pilih metode pembayaran:");
                    System.out.println("1. Cash");
                    System.out.println("2. Debit");
                    System.out.println("3. e-Wallet");
                    System.out.print("Pilihan metode: ");
                    pilihBayar = sc.nextInt();

                    switch(pilihBayar){
                        case 1:
                            System.out.print("Masukkan nominal: ");
                            nominal = sc.nextDouble();
                            kembalian = nominal - totalFinal;
                            break;
                        case 2:
                            System.out.print("Masukkan No. Rek: ");
                            rek = sc.nextInt();
                            System.out.print("Masukkan nominal: ");
                            nominal = sc.nextDouble();
                            break;
                        case 3:
                            System.out.println("Pilih metode pembayaran e-Wallet:");
                            System.out.println("1. Gopay");
                            System.out.println("2. DANA");
                            System.out.println("3. OVO");
                            System.out.print("Pilihan metode: ");
                            ewallet = sc.nextInt();

                            switch(ewallet){
                                case 1:
                                    System.out.print("Masukkan nomor Gopay: ");
                                    nomor = sc.nextLine();
                                    sc.nextLine();
                                    System.out.print("Masukkan nominal: ");
                                    nominal = sc.nextDouble();
                                    break;
                                case 2:
                                    System.out.print("Masukkan nomor DANA: ");
                                    nomor = sc.nextLine();
                                    sc.nextLine();
                                    System.out.print("Masukkan nominal: ");
                                    nominal = sc.nextDouble();
                                    break;
                                case 3:
                                    System.out.print("Masukkan nomor OVO: ");
                                    nomor = sc.nextLine();
                                    sc.nextLine();
                                    System.out.print("Masukkan nominal: ");
                                    nominal = sc.nextDouble();
                                    break;
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("ABADI SEJAHTERA MART");
                    System.out.println("Waktu Transaksi: " + tanggal);
                    System.out.println("Nama Kasir: " + namaKasir);
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("No. \tNama Barang \tHarga Satuan \tJumlah \t\tHarga Total");
                    System.out.println("--------------------------------------------------------------------");
                    for(int x = 0; x < jumlahBrg; x++){
                        System.out.println((x+1) + "\t" + namaBrg[x] + "\t\t" + barang[x][0] + "\t\t" + barang[x][1] + "\t\t" + hargaItem[x]);
                    }
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("                                    HARGA JUAL      : Rp " + totalBarang);
                    System.out.println("                                    DISKON          : Rp " + diskon);
                    System.out.println("                                    PPN             : Rp " + ppn);
                    System.out.println("                                    Cara Bayar      : " + metodeBayar(pilihBayar));
                    System.out.println("                                    TOTAL           : Rp " + totalFinal);
                    System.out.println("                                   ---------------------------------");
                    System.out.println("                                    TUNAI           : Rp " + nominal);
                    if(pilihBayar == 1){
                        System.out.println("                                    KEMBALIAN       : Rp " + kembalian);
                    } else if (pilihBayar == 2){
                        System.out.println();
                    } else if (pilihBayar == 3){
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("INFORMASI STOK PRODUK");
                    System.out.println("AQUA        : " + stok[0]);
                    System.out.println("SPRITE      : " + stok[1]);
                    System.out.println("KOPIKAP     : " + stok[2]);
                    System.out.println("LAYS        : " + stok[3]);
                    System.out.println("RINGBEE     : " + stok[4]);
                    System.out.println("OREO        : " + stok[5]);
                    System.out.println("BETTER      : " + stok[6]);
                    System.out.println("INDOMIE     : " + stok[7]);
                    System.out.println("MILO        : " + stok[8]);
                    System.out.println("BISKUAT     : " + stok[9]);
            }
        } while (pilihan !=5);
    }
}
