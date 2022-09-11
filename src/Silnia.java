public class Silnia {

    public double resultSilnia(double n){
        if(n == 0){
            return 1;
        } else {
            return n * resultSilnia(n-1);
        }
    }
}
