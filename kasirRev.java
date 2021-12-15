import java.util.Scanner;
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama kasir: "); 
        String namaKasir = sc.nextLine();

        String namaBarang = "produk", gopay, dana, ovo;
        int pilihan, jumlahBeli = 0, pilihBayar = 0, pin = 0, ewallet;
        double hargaBarang = 0, totalBarang = 0, kembalian = 0, diskon = 0, stlhDiskon = 0, ppn = 0, totalFinal = 0, nominal = 0;
        do {
            System.out.println();
            System.out.println("Pilih menu transaksi:");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Pembayaran");
            System.out.println("3. Cetak Nota Transaksi");
            System.out.print("Pilihan menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch(pilihan){
                case 1:
                    System.out.println();
                    System.out.print("Masukkan nama barang: ");
                    namaBarang = sc.nextLine();
                    System.out.print("Masukkan harga barang: ");
                    hargaBarang = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Masukkan jumlah barang: ");
                    jumlahBeli = sc.nextInt();
                    sc.nextLine();
                    totalBarang = hargaBarang * jumlahBeli;

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
                case 2:
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
                            System.out.print("Masukkan PIN kartu: ");
                            pin = sc.nextInt();
                            System.out.print("Masukkan nominal: ");
                            nominal = sc.nextDouble();
                            kembalian = nominal - totalFinal;
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
                                    gopay = sc.nextLine();
                                    sc.nextLine();
                                    System.out.print("Masukkan nominal: ");
                                    nominal = sc.nextDouble();
                                    break;
                                case 2:
                                    System.out.print("Masukkan nomor DANA: ");
                                    dana = sc.nextLine();
                                    sc.nextLine();
                                    System.out.print("Masukkan nominal: ");
                                    nominal = sc.nextDouble();
                                    break;
                                case 3:
                                    System.out.print("Masukkan nomor OVO: ");
                                    ovo = sc.nextLine();
                                    sc.nextLine();
                                    System.out.print("Masukkan nominal: ");
                                    nominal = sc.nextDouble();
                                    break;
                            }
                            break;
                        default:
                            System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("DATA PENJUALAN BARANG");
                    System.out.println("PT ABADI SEJAHTERA");
                    System.out.println("Nama Kasir: " + namaKasir);
                    System.out.println("====================================================================");
                    System.out.println("No. \tNama Barang \tHarga Satuan \tJumlah \t\tHarga Total");
                    System.out.println("====================================================================");
                    System.out.println("1. \t" + namaBarang + "\t\t" + hargaBarang + "\t\t" + jumlahBeli + "\t\t" + totalBarang);
                    System.out.println("====================================================================");
                    System.out.println("====================================================================");
                    System.out.println("HARGA JUAL \t\t\t: Rp" + totalBarang);
                    System.out.println("DISKON \t\t\t\t: Rp" + diskon);
                    System.out.println("PPN \t\t\t\t: Rp" + ppn);
                    System.out.println("Cara Bayar (Cash/Debit/e-Wallet): " + metodeBayar(pilihBayar));
                    System.out.println("TOTAL \t\t\t\t: Rp" + totalFinal);
                    System.out.println("====================================================================");
                    System.out.println("NOMINAL UANG ANDA \t\t: " + nominal);
                    if(pilihBayar == 1){
                        System.out.println("KEMBALIAN \t\t\t: " + kembalian);
                    } else if (pilihBayar == 2){
                        System.out.println();
                    } else if (pilihBayar == 3){
                        System.out.println();
                    }
            }
        } while (pilihan !=3);
    }
}
