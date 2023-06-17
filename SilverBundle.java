public class SilverBundle extends Bundle{
    
    public SilverBundle() {
        super(1050, 1000, 129000);
    }

    @Override
    public void cetak() {
        System.out.println("Paket Silver Bundle - " +diamond+ " Diamond + " +point+ " Voucher Point | Rp. " +harga+ "  =");
    }
}
