public class BlackBundle extends Bundle {
    
    public BlackBundle () {
        super(12800, 7000, 1299000);
    }

    @Override
    public void cetak() {
        System.out.println("Paket Black Bundle - " +diamond+ " Diamond + " +point+ " Voucher Point | Rp. " +harga+ " =");
    }
}
