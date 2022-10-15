import java.util.Scanner;

public class UseCalculator extends Operaters {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Operaters operaters = new Operaters();
        String anwser = "";
        do{
            System.out.println("Please type the first number");
            operaters.n1 = scan.nextInt();
         
            System.out.println("Choose an operation:");
            System.out.println(" > Type + for addition");
            System.out.println(" > Type - for subtraction");
            System.out.println(" > Type * for multiplication");
            System.out.println(" > Type / foa division");
            
            String operation = (String)scan.next(); 
                
            switch(operation){
                
                case "+":
                    System.out.println("Please type the secont number");
                    operaters.n2 = scan.nextInt();
                    System.out.println(operaters.sum());
                    System.out.println("do you want to continue or quit?");
                    anwser = (String)scan.next();
                    break;
                case "-":
                    System.out.println("Please type the secont number");
                    operaters.n2 = scan.nextInt();
                    System.out.println(operaters.subt());             
                    System.out.println("do you want to continue or quit?");
                    anwser = (String)scan.next();
                    break;
                case "*":
                    System.out.println("Please type the secont number");
                    operaters.n2 = scan.nextInt();
                    System.out.println(operaters.multi());
                    System.out.println("do you want to continue or quit?");
                    anwser = (String)scan.next();
                    break;
                case "/":
                    System.out.println("Please type the secont number");
                    operaters.n2 = scan.nextInt();
                    if (operaters.n1 == 0 || operaters.n2 == 0 ){
                        System.out.println("0 cannot divide by zero");
                        System.out.println("do you want to continue or quit?");
                        anwser = (String)scan.next();
                        
                    }else{ 
                        operaters.n2 = scan.nextInt();
                        System.out.println(operaters.divis());
                        System.out.println("do you want to continue or quit?");
                        anwser = (String)scan.next();
                        break;
                    }    
                 default:System.out.println("Invalid option!");
                 System.out.println("do you want to continue or quit?");
                 anwser = (String)scan.next();
                }
            }
            while (anwser.equals("continue" ) || anwser.equals("C" ));
        
        System.out.println("Bye");
        scan.close();
    }
}