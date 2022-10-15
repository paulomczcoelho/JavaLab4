import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String anwser = "";
        do{
            System.out.println("Please type the first number");
            int n1 = scan.nextInt();
            int n2;
            
            System.out.println("Choose an operation:");
            System.out.println(" > Type + for addition");
            System.out.println(" > Type - for subtraction");
            System.out.println(" > Type * for multiplication");
            System.out.println(" > Type / foa division");
            
            String operation = (String)scan.next(); 
                
            switch(operation){
                
                case "+":
                    System.out.println("Please type the secont number");
                    n2 = scan.nextInt();
                    System.out.println(n1 +" + " +n2+ " = "+(n1 + n2));
                    System.out.println("do you want to continue or quit?");
                    anwser = (String)scan.next();
                    break;
                case "-":
                    System.out.println("Please type the secont number");
                    n2 = scan.nextInt();
                    System.out.println(n1 +" - " +n2+ " = "+(n1 - n2));
                    System.out.println("do you want to continue or quit?");
                    anwser = (String)scan.next();
                    break;
                case "*":
                    System.out.println("Please type the secont number");
                    n2 = scan.nextInt();
                    System.out.println(n1 +" * " +n2+ " = "+(n1 * n2));
                    System.out.println("do you want to continue or quit?");
                    anwser = (String)scan.next();
                    break;
                case "/":
                    System.out.println("Please type the secont number");
                    n2 = scan.nextInt();
                    if (n1 == 0 || n2 == 0 ){
                        System.out.println("0 cannot divide by zero");
                        System.out.println("do you want to continue or quit?");
                        anwser = (String)scan.next();
                        
                    }else{ 
                        System.out.println(n1 +" / " +n2+ " = "+(n1 / n2));
                        System.out.println("do you want to continue or quit?");
                        anwser = (String)scan.next();
                    }    
                    break;
                    default:
                   
                }
                
            }
            while (anwser.equals("continue" ) || anwser.equals("C" ));
        
        System.out.println("Bye");
        scan.close();
    }
}