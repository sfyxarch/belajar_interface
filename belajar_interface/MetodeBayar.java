package belajar_interface;

public interface MetodeBayar {
	public double BayarCash(double cash, double belanja);
	public double BayarQRIS(int idNabasah, double saldo, double totalBelanja);
	public double BayarEwallet(int idUser, String namaProviderWalet, 
			double saldo, double totalBelanja);
	public double BayarCreditCard(int idNasabah, String namaBank, 
			String exprCardDate, int cardNumber, int vccCode, double saldo);
	public double BayarDebitCard(int idNasabah, String namaBank, 
			String exprCardDate, int cardNumber, int vccCode, double saldo);
}
