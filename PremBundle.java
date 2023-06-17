public class PremBundle extends Bundle {
    
    public PremBundle() {
       super(15000, 9500, 1599000);
    }

    @Override
    public void cetak() {
        System.out.println("Paket Prem Bundle - " +diamond+ " Diamond + " +point+ " Voucher Point  | Rp. " +harga+ " =");
    }
}