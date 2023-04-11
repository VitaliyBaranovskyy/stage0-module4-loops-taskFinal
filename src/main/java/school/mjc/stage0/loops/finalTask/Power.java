package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        
        int i;
        int b = 1;
        for (i=1; i <= power; i++){
            b= b * numberToPrint;
            
        }
        System.out.println(b);
            

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
