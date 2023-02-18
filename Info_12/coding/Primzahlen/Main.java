import java.lang.Math;

public class Main
{
    int ergebnis = 0;
    
    private boolean isPrime(long n){
        //long anfang = System.currentTimeMillis();

        boolean isPrim = true;
        double sqrt = Math.sqrt(n);

        
        
        for(int i = 2; i < sqrt; i++){
            if(n%i == 0) {
                isPrim = false;
                break;
            }
        }
        //long ende = System.currentTimeMillis();
        //System.out.println(ende - anfang);
        return isPrim;
    }

    private void Prime(){
        for(long l = 0; l>= 0;l++){
            if(isPrime(l) == true){
                System.out.println(l);
            }
        }
    }

    private Integer fibonacci(Integer n){
        if(n<=1){
            ergebnis = 1;
        } else{
            ergebnis = fibonacci(n-1) + fibonacci(n - 2);
        }
        return ergebnis;
    }

    public void time(Integer n){
        long anfang = System.currentTimeMillis();
        fibonacci(n);
        long ende = System.currentTimeMillis();
        long time = ende - anfang;
        System.out.println(n + ";" + ergebnis + ";" + time);
    }
    
    public void genInt(){
        int i = 0;
        while(true){
            time(i);
            i++;
        }
    }
}