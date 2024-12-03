package belajar_interface;

public class PembayaranBelanja implements MetodeBayarPakeAplikasi{
	
	//double uangCash;
	double kembalian;
	double sisa;
	double jumlahTotalBelanja = 50000;
	
	@Override
	public double BayarCash(double cash, double belanja) {
		kembalian = cash-belanja;
		return kembalian;
	}

	@Override
	public double BayarQRIS(int idUser, double saldo, double belanjaTot) {
		sisa = saldo - belanjaTot;
        return sisa;

	}

	@Override
	public double BayarEwallet(int idUser, String namaProviderWalet, 
	double saldo, double totalBelanja) {
		sisa = saldo - totalBelanja;
		return sisa;
	}

	@Override
	public double BayarCreditCard(int idNasabah, String namaBank, 
	String exprCardDate, int cardNumber, int vccCode, double saldo) {
		sisa = saldo - jumlahTotalBelanja;  
		return sisa;
	}

	@Override
	public double BayarDebitCard(int idNasabah, String namaBank, 
	String exprCardDate, int cardNumber, int vccCode, double saldo) {
		sisa = saldo - jumlahTotalBelanja;  
		return sisa;
	}

	@Override
	public double bayarGoPay(int idUser, double saldo, double belanjaTotal) {
		sisa = saldo - belanjaTotal;
		return sisa;
	}

	@Override
	public double bayarShopeePay(int idUser, double saldo, double belanjaTotal) {
		sisa = saldo - belanjaTotal;
		return sisa;
	}

}
