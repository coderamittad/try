package abstraction;

import java.util.Scanner;

public class amit2 implements amit1{


    @Override
    public void displaynumber() {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a 1 for display the game and enter a two for break");
        int ch=sc.nextInt();
        int a=(int)(Math.random()*100)+1;
        switch (ch){
            case 1:
                    System.out.println("welcome to game");
                    System.out.println("instruction:");
                    System.out.println("   1:enter a 1 number ");
                    System.out.println("    2: if your enterd number match a sydtem umber else your win");
                    while (true){
                    int num = sc.nextInt();
                    int chance = 10;
                        if (num > a) {
                            System.out.println("your number is so big plese enter a small number");
                        } else {
                            System.out.println("enter a big number");
                        }
                        if (num == a) {
                            System.out.println("you are win");
                            break;

                        }

                    break;
                }
            case  2:
                displaynumber();
        }

    }
}
