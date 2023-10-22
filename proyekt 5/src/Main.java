import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            System.out.println("factoriali tapilacaq ededi yazin");
            Scanner scanner=new Scanner(System.in);
          int  x=scanner.nextInt();
          if (x<0){
              System.out.println("error");
          }else {
             long factorial=1;
             for (int i=1;i<=x;i++){
                 factorial*=i;
             }
             System.out.println(x+"in factoriali budur  "+factorial);
          }
          scanner.close();


    }
}
