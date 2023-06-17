abstract class Bundle {
    protected int diamond;
    protected int point;
    protected int harga;

    public Bundle(int diamond, int point,  int harga) {
        this.diamond = diamond;
        this.point = point;
        this.harga = harga;
    }

    public int getDiamond() {
        return diamond;
    }

    public int getHarga() {
        return harga;
    }

    public int point() {
        return point;
    }

    public abstract void cetak();


    
}
