package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
       int i;
        for (i=1; i<=10; i++){
            int n = numberTableToPrint * i;
            System.out.println(numberTableToPrint + " * " + i + " = " + n);
        }
    }
    
    public static void main (String [] args){
        
     new MultiplicationTable().printTable(9); 
    }
}
