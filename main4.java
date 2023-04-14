import java.util.Scanner;

public class main4 {
        static int us(int taban,int usdeger)
        {
            if (usdeger==0)
                return 1;
            else if(taban==1)
                return 1;

                return taban*us(taban, usdeger-1);
        }
        public static void main(String[]args){

            while(true) {
                Scanner inp = new Scanner(System.in);
                System.out.print("taban degeri giriniz : ");
                int taban = inp.nextInt();
                System.out.print("us degeri giriniz : ");
                int usdeger = inp.nextInt();
                if(true){
                    System.out.println("Sonuc : " + us(taban,usdeger));
                }
            }

    }
}