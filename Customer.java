import java.util.ArrayList;

public class Customer implements PembelianBundle {
    
    private int saldo;
    private ArrayList<Bundle> InfoBundle;

    public Customer() {
        saldo = 0;
        InfoBundle = new ArrayList<>();
    }

    public void TopUpSaldo(int topUp) {
        saldo += topUp;
        System.out.println("Top Up is successful, your balance will increase :)");
    }

    public  void showSaldo() {
    System.out.println("Your Total Balance : " +saldo);

    }


    @Override
    public boolean PembelianBundle(Bundle bundle) {
        if(bundle.getHarga() > saldo) {
            System.out.println();
            System.out.println("        -----------------------------------------------------------       ");
            System.out.println("                    Sorry, your balance is not enough!                    ");
            return false;
        }else{
            saldo -= bundle.getHarga();
            InfoBundle.add(bundle);
            System.out.println();
            System.out.println("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~       ");
            System.out.println("                    < Bundle purchase was successful >                    ");
            return true;
        }

    }

}
