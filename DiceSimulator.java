package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random num = new Random();
        int max = 6;
        int rand = num.nextInt(max);
        if (rand == 1){
            System.out.println("[-----]");
            System.out.println("[     ]");
            System.out.println("[  0  ]");
            System.out.println("[     ]");
            System.out.println("[-----]");
        }
        else if (rand == 2){
            System.out.println("[-----]");
            System.out.println("[ 0   ]");
            System.out.println("[     ]");
            System.out.println("[   0 ]");
            System.out.println("[-----]");
        }
        else if (rand == 3){
            System.out.println("[-----]");
            System.out.println("[     ]");
            System.out.println("[0 0 0]");
            System.out.println("[     ]");
            System.out.println("[-----]");
        }
        else if (rand == 4){
            System.out.println("[-----]");
            System.out.println("[0   0]");
            System.out.println("[     ]");
            System.out.println("[0   0]");
            System.out.println("[-----]");
        }
        else if (rand == 5){
            System.out.println("[-----]");
            System.out.println("[0   0]");
            System.out.println("[  0  ]");
            System.out.println("[0   0]");
            System.out.println("[-----]");
        }
        else if (rand == 6){
            System.out.println("[-----]");
            System.out.println("[0 0 0]");
            System.out.println("[     ]");
            System.out.println("[0 0 0]");
            System.out.println("[-----]");
        }
    }
}
