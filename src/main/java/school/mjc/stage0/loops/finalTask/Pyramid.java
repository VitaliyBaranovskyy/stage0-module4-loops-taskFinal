package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int i;
        int j;
        int k;
        for (i = 1; i <=cathetusLength; i++){
            for (j = cathetusLength -i; j>0; j--){
               System.out.print(" ");
                                
                }
                 for (k=i; k>0; k--){
                      System.out.print(k);
                     
                 }
                for (int m =2; m<=i; m++){
                  System.out.print(m);   
                     System.out.print("");
                }
             System.out.println();
            
           
            
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
