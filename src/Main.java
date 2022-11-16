import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2 , ebob=1 , ekok=1;

        Scanner input= new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        number1=input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        number2=input.nextInt();

        //Ebob

        int i=1;
        while (i<=number1 ){
            if(number1 % i ==0 && number2 % i==0 ){
                ebob=i;
            }
            i++;
        }

        System.out.println("EBOB : "+ebob);

        //Ekok


         i=1;
        while (i<=number1*number2 ){
            if(i % number1 ==0 &&  i %number2 ==0 ){
                ekok=i;
                break;
            }
            i++;
        }
        System.out.println("EKOK : "+ekok);


    }
}