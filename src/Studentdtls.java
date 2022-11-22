import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Studentdtls {
    int adm_no;
    String name;
    String clg;
    public Studentdtls(int adm_no, String name, String clg) {
        this.adm_no = adm_no;
        this.name = name;
        this.clg = clg;
    }
    void disp(){
        System.out.println("admission"+adm_no);
        System.out.println(name);
        System.out.println(clg);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Studentdtls> s=new ArrayList<Studentdtls>();
        while (true){
            System.out.println("1-add\n 2-display\n 3-search \n 4-delete \n 5-Exit");

            int n=sc.nextInt();
            switch (n){
                case 1:
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("admision number");
                    int ad=sc1.nextInt();
                    System.out.println("name");
                    String nme=sc1.next();
                    System.out.println("college name");
                    String clg=sc1.next();
                    s.add(new Studentdtls(ad,nme,clg));
                    break;
                case 2:
                    for (Studentdtls stu:s){
                        stu.disp();

                    }break;
                case 3:
                    System.out.println("admission number");
                    Scanner sc11=new Scanner(System.in);
                    int a_no=sc11.nextInt();
                    for (Studentdtls stu:s){
                        if(stu.adm_no==a_no){
                            System.out.println("found");
                            break;
                        }
                    }break;
                case 4:
                    System.out.println("admission number");
                    Scanner sc9=new Scanner(System.in);
                    int adno=sc9.nextInt();
                    for (Studentdtls stu:s){
                        if(stu.adm_no==adno){
                            s.remove(stu);
                            break;
                        }
                    }break;
                case 5:
                    System.exit(0);

            }
        }
    }

}


