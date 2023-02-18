public class App
{
    int[] anArray;

    public App(int n){
        anArray = new int[n];
    }

    public void array(){
        int i = 0;

        while(i<anArray.length){
            anArray[i] = (int)(Math.random()*145161);
            i++;
        }
    }

    public void maxValue(){
        long anfang = System.currentTimeMillis();
        int j = 0;
        int currentMax = 0;
        while(j < anArray.length){
            int currentNum = anArray[j];
            if(currentNum > currentMax){
                currentMax = currentNum;
            }
            j++;
        }

        long ende = System.currentTimeMillis();
        long time = ende - anfang;
        System.out.println(time + ";" + anArray.length + ";" + currentMax);
    }

    public void sort(int n){
        long anfang = System.currentTimeMillis();

        int[] anArray = new int[n];

        int i = 0;

        while(i<n){
            anArray[i] = (int)(Math.random()*145161);
            i++;
        }

        int j = 0;
        int currentMax = 0;
        while(j < n){
            int currentNum = anArray[j];
            if(currentNum > currentMax){
                currentMax = currentNum;
            }
            j++;
        }

        long ende = System.currentTimeMillis();
        long time = ende - anfang;
        System.out.println(time + ";" + n + ";" + currentMax);
    }
}
