package CreditCalc;

import java.util.Scanner;
import static java.lang.Math.*;

public class CreditCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        String enter;
        double num,pay,mons,prosent;

        System.out.println("Що ви хочете обчислити? \n" +
                "введіть \"n\" для кількості щомісячних платежів,  \n" +
                "введіть \"a\" для суми щомісячного ануїтетного платежу,  \n" +
                "введіть \"p\" для основної позики: \n");
        enter = scanner1.nextLine();

        if (enter.equals("n")){
            System.out.println("Введіть основну суму кредиту: ");
            num = scanner.nextDouble();
            System.out.println("Введіть що місячний платіж: ");
            pay = scanner.nextDouble();
            System.out.println("Введіть відсотки за кредит: ");
            prosent =scanner.nextDouble();
            double i;
            i = (0.1)/(12*1);

            double l = log(pay / (pay - (i * num)))/log(1+i);
            round(l);
            double months =l;
            double years = l/12;
            double remainingMonths = months % 12;
            System.out.println("Рік: "+ round(years) + " місяць: "+ round(remainingMonths));

        }
        if (enter.equals("a")){
            System.out.println("Введіть основну суму кредиту: ");
            num = scanner.nextDouble();
            System.out.println("Введіть кількість періодів: ");
            mons = scanner.nextDouble();
            System.out.println("Введіть відсотки за кредит: ");
            prosent =scanner.nextDouble();

            double x =num*(0.01+(0.01/(pow(1+0.01,mons)-1)));

            System.out.println("Ваш платіж за місяць: "+round(x));

        }
        if (enter.equals("p")){
            System.out.println("Введіть ануїтет платіжу: ");
            num = scanner.nextDouble();
            System.out.println("Введіть кількість періодів: ");
            mons = scanner.nextDouble();
            System.out.println("Введіть відсотки за кредит: ");
            prosent =scanner.nextDouble();

            double d = num/((0.056*pow(1+0.056,mons))/pow(1+0.056,mons)-1);
            System.out.println(d);
        }
        if(enter.equals("d")){
            System.out.println("Annuity");
            double period,sum,proz,res;
            System.out.println("Dperiods: ");
            period = scanner.nextDouble();
            System.out.println("Dprincipal: ");
            sum = scanner.nextDouble();
            System.out.println("Dinterest: ");
            proz = scanner.nextDouble();
            res = sum*(0.1/(1+0.1)-period-1);
            System.out.println(res);


        }

    }
}
