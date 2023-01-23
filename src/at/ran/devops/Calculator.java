package at.ran.devops;

public class Calculator {
    public int add(int a, int b){
        return a +b;
    }


    public int multiply(int a , int b){
        return a*b;
    }

    public int complex(int a, int b){
        return add(a,b) - multiply(a,b);
    }


}
