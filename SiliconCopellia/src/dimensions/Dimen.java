package dimensions;


import java.util.Scanner;

public abstract class Dimen {
    public abstract String compare();

    public float readInput() throws Exception {
        try{
            Scanner scan = new Scanner(System.in);
            float num = scan.nextFloat();
            return num;
        }catch (Exception e){
            throw new Exception();
        }

    }
}
