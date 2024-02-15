/*create a custom calculator with following operations:
1. + -> Addition
2. - -> Subtraction
3. * -> Multiplication
4. / -> Division
which throws the following exceptions:
1. Invalid input Exception ex: 8 & 9
2. Cannot divide by 0 Exception
3. Max Input Exception if any of the inputs is greater than 100000
4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/
class InvalidInputException extends Exception {
    public String toString() {
        return "can't add 8 and 9";
    }
    public String getMessage() {
        return "I am getMessage()";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Input can't be greater than 100000";
    }
    public String getMessage() {
        return "I am getMessage()";
    }
}
class DivideByZeroException extends Exception{
    public String toString(){
        return "Can't divide by 0";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MaxMultiplierException extends Exception{
    public String toString() {
        return "Input can't be greater than 7000 while multiplying";
    }
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException{
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a+b;
    }
    double divide(double a, double b) throws DivideByZeroException, MaxInputException {
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new DivideByZeroException();
        }
        return a/b;
    }

    double multiply(double a, double b) throws MaxMultiplierException, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000) {
            throw new MaxMultiplierException();
        }
        return a*b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
}

public class Exercise6{
    public static void main(String[] args) throws InvalidInputException, MaxInputException, DivideByZeroException, MaxMultiplierException{
        CustomCalculator c  = new CustomCalculator();
        c.add(8,9);
        c.divide(2,0);
        c.divide(200000000, 40);
        c.multiply(2,9888);
    }
}