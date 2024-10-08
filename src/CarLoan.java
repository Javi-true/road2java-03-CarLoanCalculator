public class CarLoan {
    //Instance fields declaration.
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    //constructor method.
    public CarLoan(){

    }

    public void validation(){

        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan");
        } else if(carLoan < downPayment){
            System.out.println("The car can be pais in full");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
        }
    }
    public static void main(String[] args){


    }

}
