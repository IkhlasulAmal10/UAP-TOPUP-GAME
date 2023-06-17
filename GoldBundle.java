public class GoldBundle extends Bundle {
    
    public GoldBundle() {
       super(5700, 4500, 619000);
    }

    @Override
    public void cetak() {
        System.out.println("Paket Gold Bundle - " +diamond+ " Diamond + " +point+ " Voucher Point   | Rp. " +harga+ "  =");
    }
}