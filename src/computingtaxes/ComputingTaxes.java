/*

 */
package computingtaxes;
import java.util.Scanner;
/**
 *
 * @author tallan
 */
public class ComputingTaxes 
{

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) 
    {
        
        double tax; 

        Scanner input = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("0-single filer); ");
        System.out.println("");
        System.out.println("1-married jointly or qualifying widow(er), ");
        System.out.println("");
        System.out.println( "2-married separately");
        System.out.println("");
        System.out.println( "3-head of household)");
        System.out.println("");
        System.out.println(" Enter the filing status: ");
        
        int status = input.nextInt();
        System.out.print("Enter the taxable income: "); 
        double income = input.nextDouble();
        System.out.println(status + ":  : " + income);

        if(status == 0) 
        {
            if (income <= 8350)
            {
                tax = income * 0.10;
                System.out.println("taxes is 10%: " + tax + "$");
            } 
            else if(income <= 33950)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
                System.out.println("taxes is 15%: " + tax + "$");
            }
            else if(income <= 82250)
            {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                System.out.println("taxes is 25%: " + tax + "$");
            }
            else if (income <= 171550)
            {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                System.out.println("taxes is 28%: " + tax + "$");
            }
            else if (income <= 372950) 
            {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
                System.out.println("taxes is 33%: " + tax + "$");
            }
            else 
            {
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
                System.out.println("taxes is 35%: " + tax + "$");
            }
        } 
        else if(status == 1)
        {
            if(income <= 16700)
            {
                tax = income * 0.10;
                System.out.println("taxes is 10%: " + tax + "$");
            }
            else if(income <= 67900)
            {
                tax = 16700 * 0.10 + (income - 16700) * 0.15;
                System.out.println("taxes is 15%: " + tax + "$");
            }
            else if(income <= 137050)
            {
                tax = 16700 * 0.10 + (income - 16700) * 0.15  + (income - 67900) * 0.25;
                System.out.println("taxes is 25%: " + tax + "$");
            }
            else if(income <= 208850)
            {
                tax = 16700 * 0.10 + (income - 16700) * 0.15  + (income - 67900) * 0.25 + (income - 137050) * 0.28;
                System.out.println("taxes is 28%: " + tax + "$");
            }
            else if(income <= 372950)
            {
                tax = 16700 * 0.10 + (income - 16700) * 0.15  + (income - 67900) * 0.25 + (income - 137050) * 0.28 + 
                (income - 208850) * 0.33;
                System.out.println("taxes is 33%: " + tax + "$");
            }
            else if(income > 372950)
            {
                tax = 16700 * 0.10 + (income - 16700) * 0.15  + (income - 67900) * 0.25 + (income - 137050) * 0.28 + 
                (income - 208850) * 0.33 + (income - 372950) * 0.35;
                System.out.println("taxes is 35%: " + tax + "$");
            }
        }

        if(status == 2)
        {
            if(income <= 8350)
            {
                tax = income * 0.10;
                System.out.println("taxes is 10%: " + tax + "$");
            }
            else if(income <= 33950)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
                System.out.println("taxes is 15%: " + tax + "$");
            }
            else if(income <= 68525)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15  + (income - 33950) * 0.25;
                System.out.println("taxes is 25%: " + tax + "$");
            }
            else if(income <= 104425)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15  + (income - 33950) * 0.25 + (income - 68525) * 0.28;
                System.out.println("taxes is 28%: " + tax + "$");
            }
            else if(income <= 186475)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15  + (income - 33950) * 0.25 + (income - 68525) * 0.28 + (income - 104425) * 0.33;
                System.out.println("taxes is 33%: " + tax + "$");
            }
            else if(income > 186476)
            {
                tax = 8350 * 0.10 + (income - 8350) * 0.15  + (income - 33950) * 0.25 + (income - 68525) * 0.28 + (income - 104425) * 0.33+ (income - 186475) * 0.35;
                System.out.println("taxes is 35%: " + tax + "$");
            }
        }
        if(status == 3)
        {
            if(income <= 11950)
            {
                tax = income * 0.10;
                System.out.println("taxes is 10%: " + tax + "$");
            }
            else if(income <= 45500)
            {
                tax = 11950 * 0.10 + (income - 11950) * 0.15;
                System.out.println("taxes is 15%: " + tax + "$");
            }
            else if(income <= 117450)
            {
                tax = 11950 * 0.10 + (income - 11950) * 0.15  + (income - 45500) * 0.25;
                System.out.println("taxes is 25%: " + tax + "$");
            }
            else if(income <= 190200)
            {
                tax = 11950 * 0.10 + (income - 11950) * 0.15  + (income - 45500) * 0.25 + (income - 117450) * 0.28;
                System.out.println("taxes is 28%: " + tax + "$");
                //ajsd;lkajs;dlkfja;sldkj;laksdjf;lakjds;
            }
            else if(income <= 372950)
            {
                tax = 11950 * 0.10 + (income - 11950) * 0.15  + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33;
                System.out.println("taxes is 33%: " + tax + "$");
            }
            else if(income > 372950)
            {
                tax = 11950 * 0.10 + (income - 11950) * 0.15  + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33 + (income - 372950) * 0.35;
                System.out.println("taxes is 35%: " + tax + "$");
            }
        }
    }
    

    /*
    test cases 
    1 enter
    15000

    1 enter 
    66000

    1 enter
    135000

    1 enter
    200000

    1 enter
    300000

    1 enter 
    400000

    2 enter
    8349

    2 enter 
    30000

    2 enter
    70000

    2 enter
    105000

    2 enter
    200000

    3 enter
    10000

    3 enter
    30000

    3 enter
    46000

    3 enter
    120000

    3 enter
    200000

    3 enter
    400000

    */
}
