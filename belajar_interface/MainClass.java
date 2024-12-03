package belajar_interface;

public class MainClass extends PembayaranBelanja{
	public static void main(String[] args) {
		PembayaranBelanja pb = new PembayaranBelanja();
		pb.BayarCash(50000, 10000);
		System.out.println(pb.kembalian);

		PembayaranBelanja pb2 = new PembayaranBelanja();
		pb2.BayarQRIS(1, 100000, 20000);
		System.out.println(pb2.sisa);

		PembayaranBelanja pb3 = new PembayaranBelanja();
		pb3.BayarEwallet(2, "Dana", 100000, 50000);
		System.out.println(pb3.kembalian);

		PembayaranBelanja pb4 = new PembayaranBelanja();
		pb4.BayarCreditCard(3, "BRI", "2 Desember 2025", 12345, 1234, 100000);
		System.out.println(pb4.sisa);

		PembayaranBelanja pb5 = new PembayaranBelanja();
		pb5.BayarDebitCard(4, "BNI", "3 Desember 2025", 678910, 6789, 100000);
		System.out.println(pb5.sisa);

		PembayaranBelanja pb6 = new PembayaranBelanja();
		pb6.bayarGoPay(5, 100000, 10000);
		System.out.println(pb6.sisa);

		PembayaranBelanja pb7 = new PembayaranBelanja();
		pb7.bayarShopeePay(6, 100000, 30000);
		System.out.println(pb7.kembalian);

	}
}
