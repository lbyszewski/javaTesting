public class Fibb {

    public double resultFibb(double n){
        if(n < 3){
            return 1;
        }
        else {
            return  resultFibb(n-2) + resultFibb(n-1);
        }
    }
}
