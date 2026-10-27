/*Write a java program that prints even numbers between 1 and 50. */
public class exo8 {
    public static void main (String[] args){
        for(int i = 0; i <= 50; i++){
            do { 
                System.out.println(i+ " Is Even");
                i++;
            } while (i%2 == 0);
        }
    }
}