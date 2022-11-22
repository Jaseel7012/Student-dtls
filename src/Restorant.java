import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Restorant {
    int t=10;

    public String te;
    private String pno;
    private String email;

    public Restorant(String te,int t) {
        this.te = te;
        this.t=t;
    }

    public String getPno() {
        return pno;
    }
    void view_menu(){
        System.out.println(te);
        System.out.println(t);
    }
    static void display_bill(){

    }

    public static void main(String[] args) {




       // Restorant c1=new Restorant(sc1.next(),sc1.nextInt());
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> itemlist=new HashMap<>();
        ArrayList<Restorant> foodli=new ArrayList<>();
        for(int i=0;i<5;i++){
            System.out.println("Add items...");

            foodli.add(new Restorant(sc.next(),sc.nextInt()));
        }
        for (Restorant i:foodli){
            i.view_menu();
        }



        double total=0;

        while (true){

            System.out.println("....menu...\t  Amount\n 1.Tea \t\t 10\n 2.Coffee \t15 \n 3.Snacks \t 10 \n 4.Idili \t 8.00" +
                    "\n 5.Dosha \t 6.00");


            System.out.println("Enter the total number of Your order Items");
            int n_items=sc.nextInt();
            for (int i=0;i<n_items;i++){
                System.out.println("Enter "+i+1+"st order name ");
                String nmeitem=sc.next();
                System.out.println("Enter the number of "+i+1+"st items");
                int nitem=sc.nextInt();

            }
            System.out.println("Press 1- Generate Bill\n 2-View Transaction \n 3-Exit");

            int n= sc.nextInt();
            switch (n){
                case 1:

            }
        }




    }

}
