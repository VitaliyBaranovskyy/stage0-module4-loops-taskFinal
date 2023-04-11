package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int i;
        int j;
        for (i=1; i <=cathetusLength; i++){
         for (j=i; j>0; j--){
          System.out.print("*");
             System.out.print(" ");
             
         }
           System.out.println(); 
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
