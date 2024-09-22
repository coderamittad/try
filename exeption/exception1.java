package exeption;

import java.util.Scanner;

public class exception1 extends Exception{
    exception1(){
        super("age nit tak be bhendichod");
    }


}
class AGEenter{
    public static void main(String[] args) throws exception1 {
        exception1 a=new exception1();
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        if(num<18){
            throw new exception1();
        }
    }
}
