public class CarLoan {
    //Instance fields declaration.
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;

    public void validation(){
        if (loanLength <= 0 || interestRate <= 0){
            System.out.println("Error! You must take out a valid car loan");
        }
    }
    public static void main(String[] args){


    }

}
