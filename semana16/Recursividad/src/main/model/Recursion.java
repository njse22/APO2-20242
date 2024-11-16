package main.model;

public class Recursion {


    public int factorial(int n){
        int result;

        // caso base
        if(n == 0){
            result = 1;
        }
        // caso recursivo
        else {
            result = n * factorial(n-1);
        }

        return result;
    }

}
