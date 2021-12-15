import java.util.Scanner;
public class UAS{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		String produk;
		int kode, jumlahbrg;
		double diskon1, diskon2, diskon3, harga, stlhDiskon;
		double total = 0, kembalian, pin;
		
		System.out.println("---------- Nota Belanja ----------");
		System.out.print("Masukkan Nama Barang\t: ");
		produk = input.nextLine();
		System.out.print("Masukkan Jumlah Barang\t: ");
		jumlahbrg = input.nextInt();
		System.out.print("Masukkan Harga Barang\t: ");
		harga = input.nextInt();
		total = harga * jumlahbrg;
		diskon1 = total*20/100;
		diskon2 = total*40/100;
		diskon3 = total*50/100;
		
		if(total >= 20000){
		    stlhDiskon = total - diskon1;
		    System.out.println("Total Harga\t: " + total);
			System.out.println("Total Harga Setelah Diskon\t: " + stlhDiskon);
		}
		else if(total >= 50000){
		    stlhDiskon = total - diskon2;
			System.out.println("Total Harga\t: " + total);
			System.out.println("Total Harga Setelah Diskon\t: " + stlhDiskon);
		}
		else if(total >= 100000){
		    stlhDiskon = total - diskon3;
		    System.out.println("Total Harga\t: " + total);
		    System.out.println("Total Harga Setelah Diskon\t: " + stlhDiskon);
		}
		else{
		    System.out.println("Total Harga\t: " + total);
		}
		
	  
		int mtdBayar = 0,milih = 0, cash, debit, ewallet;
    String ovo, gopay, dana;
		double pembayaran;
		
		System.out.println("Pilih Metode pembayaran: ");
    System.out.println("1.Cash");
    System.out.println("2.Debit");
    System.out.println("3.E-Wallet");
		mtdBayar = input.nextInt();
		input.nextLine();
  
		if(mtdBayar == 1){
		   System.out.print("Masukkan Jumlah Uang\t: ");
		   pembayaran = input.nextDouble();
       kembalian = pembayaran - total;
		   System.out.print("Kembalian\t: " + kembalian); 
		}
		else if(mtdBayar == 2){
		   System.out.print("Masukkan PIN Kartu\t: ");
		   pin = input.nextDouble();
       System.out.print("Masukkan Jumlah Uang\t: ");
       pembayaran = input.nextDouble();

		}
		else if(mtdBayar == 3){
        System.out.println("Metode Pembayaran E-wallet");
		    System.out.println("1.Gopay");
		    System.out.println("2.Dana");
		    System.out.println("3.OVO");
        milih = input.nextInt();
		  
		    switch(milih){
		       case 1:
		       System.out.print("Masukkan Nomer Gopay\t: ");
		       gopay = input.nextLine();
           input.nextLine();
		       System.out.print("Masukkan Pembayaraan\t: ");
		       pembayaran = input.nextDouble();
		       break;
		       
		       case 2:
		       System.out.print("Masukkan Nomer Dana\t: ");
		       dana = input.nextLine();
           input.nextLine();
		       System.out.print("Masukkan Pembayaraan\t: ");
		       pembayaran = input.nextDouble();
		       break;
		       
		       case 3:
		       System.out.print("Masukkan Nomer OVO\t: ");
		       ovo = input.nextLine();
           input.nextLine();
		       System.out.print("Masukkan Pembayaraan\t: ");
		       pembayaran = input.nextDouble();
		       break;
		       
		    }
		}
		
	}
}

