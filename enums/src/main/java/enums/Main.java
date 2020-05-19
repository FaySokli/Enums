package enums;

import java.util.Scanner;

/**
 *
 * @author froo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MathOperators operation=new MathOperators();
        Friday day=new Friday();
        int o1=1,o2=1;
        
        //Exercise 1
        System.out.print("What day is it today? ");
        while(sc.hasNextLine()){
            String answer=sc.nextLine().toUpperCase();
            day.howManyDays(Friday.DaysOfWeek.valueOf(answer));
        }
        
        //Exercise 2
        System.out.print("Operand 1: ");
        while(sc.hasNextLine()){
            o1=Integer.parseInt(sc.nextLine());
        }
        System.out.print("Operand 2: ");
        while(sc.hasNextLine()){
            o2=Integer.parseInt(sc.nextLine());
        }
        operation.calculate(MathOperators.MathOperator.PLUS, o1, o2);
        operation.calculate(MathOperators.MathOperator.MINUS, o1, o2);
        operation.calculate(MathOperators.MathOperator.MULTIPLY, o1, o2);
        operation.calculate(MathOperators.MathOperator.DIVIDE, o1, o2);
    }
    
}
