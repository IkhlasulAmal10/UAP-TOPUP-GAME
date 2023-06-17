import java.util.ArrayList;
import java.util.Scanner;

public class Tampilan {

    public static void layout() {
        Scanner scn = new Scanner(System.in);
        Customer Customer = new Customer();
        boolean ulang = true;
        String input;

        System.out.println("==========================================================================");
        System.out.println("=               S H O P  G A S O L I N D O S O L U T I O N               =");
        System.out.println("==========================================================================");
        System.out.println("  **********************************************************************  ");
        System.out.println("   the most trusted and safe diamond top up solution store in the world   ");
        System.out.println("  **********************************************************************  ");

        ArrayList<Bundle> bundles = new ArrayList<>();
        bundles.add(new SilverBundle());
        bundles.add(new GoldBundle());
        bundles.add(new BlackBundle());
        bundles.add(new PremBundle());


        boolean running = true;

        while (running) {
            System.out.println("==========================================================================");
            System.out.println("=                            H O M E  P A G E                            =");
            System.out.println("==========================================================================");
            System.out.println("==========================================================================");
            System.out.println("= 1. BUY BUNDLE                                                          =");
            System.out.println("= 2. TOP UP SALDO                                                        =");
            System.out.println("= ---------------------------------------------------------------------- =");
            System.out.println("= 3. Exit                                                                =");
            System.out.println("= ---------------------------------------------------------------------- =");
            System.out.println("==========================================================================");
            Customer.showSaldo();
            System.out.println("==========================================================================");
            System.out.println("Enter Your Choice!");
            System.out.print("| 1 | 2 | 3 | : ");
 
            
            int menu = scn.nextInt();   
            switch (menu) {
            case 1:
            System.out.println("==========================================================================");
            System.out.println("=                      L I S T  M E N U  B U N D L E                     =");
            System.out.println("==========================================================================");
                int urut = 1;
                for (Bundle bundle : bundles) {
                    System.out.print(urut + ". ");
                    bundle.cetak();
                    urut++;
                }
                System.out.println("= ---------------------------------------------------------------------- =");
                Customer.showSaldo();
                System.out.println("==========================================================================");
                System.out.println("Choose the bundle you want to buy!");
                System.out.print("| 1 | 2 | 3 | 4 | : ");

                int pilihan = scn.nextInt();
                if (pilihan < 1 || pilihan > 4) {
                    System.out.println("Please enter correctly!");
                    break;
                }

                Bundle selectedBundle = bundles.get(pilihan - 1);
                if (Customer.PembelianBundle(selectedBundle)) {
                    System.out.println("                Successfully purchased the Bundle Package <3              ");
                    System.out.println("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~       ");
                    System.out.println();


                } else {
                    System.out.println("         Purchase was not successful, top up your balance first :)        ");
                    System.out.println("        -----------------------------------------------------------       ");
                    System.out.println();
                }
                break;

            case 2:
                System.out.print("What balance do you want to top up ? ");
                int topUp = scn.nextInt();
                Customer.TopUpSaldo(topUp);
                break;

            case 3:
                ulang = true;
                while (ulang) {
                    System.out.print("Do you want to exit the application (Yes/No) ? ");
                    input = scn.next();
                    if (input.equalsIgnoreCase("Yes")) {
                        running = false;
                        ulang = false;
                    } else if (input.equalsIgnoreCase("No")) {
                        ulang = false;
                    } else {
                        System.out.println("Please enter correctly!");
                    }
                }
                break;

            default:
            System.out.println("        -----------------------------------------------------------       ");
            System.out.println("                          PLEASE ENTER CORRECTLY!                         ");
            System.out.println("        -----------------------------------------------------------       ");
                break;
            }
        }
    }
}