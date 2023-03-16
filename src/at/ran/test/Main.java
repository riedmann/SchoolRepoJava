package at.ran.test;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(4,7));


        double result = 4.7;
        int resultAsInt = (int) result;



        if (result -resultAsInt!=0){
            System.out.println(result);
        }else{
            System.out.println(resultAsInt);
        }
    }
}
