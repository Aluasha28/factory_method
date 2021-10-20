package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	ChocolateFactory chocolateFactory = new BountyFactory();
//	Chocolate chocolate = chocolateFactory.createChocolate();
//	chocolate.buy();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Select:\n 1. Bounty\n 2. Snickers\n 3. Kitkat");
            System.out.println("Your choice:");
            int number = scanner.nextInt();
            if (number==1){
                ChocolateFactory chocolateFactory = new BountyFactory();
                Chocolate chocolate = chocolateFactory.createChocolate();
                chocolate.buy();
                break;
            }else if(number==2){
                ChocolateFactory chocolateFactory = new SnickersFactory();
                Chocolate chocolate = chocolateFactory.createChocolate();
                chocolate.buy();
                break;
            }else if(number==3){
                ChocolateFactory chocolateFactory = new KitkatFactory();
                Chocolate chocolate = chocolateFactory.createChocolate();
                chocolate.buy();
                break;
            }else {
                break;
            }
        }
    }
}

interface Chocolate{
    void buy();
}

class Bounty implements  Chocolate{
    @Override
    public void buy() {
        System.out.println("You bought bounty");
    }
}
class Snickers implements Chocolate{
    @Override
    public void buy() {
        System.out.println("You bought snickers");
    }
}
class Kitkat implements Chocolate{
    @Override
    public void buy() {
        System.out.println("You bought kitkat");
    }
}

interface ChocolateFactory{
    Chocolate createChocolate();
}
class BountyFactory implements  ChocolateFactory{
    @Override
    public Chocolate createChocolate() {
        return new Bounty();
    }
}
class SnickersFactory implements ChocolateFactory{
    @Override
    public Chocolate createChocolate() {
        return new Snickers();
    }
}
class KitkatFactory implements ChocolateFactory{
    @Override
    public Chocolate createChocolate() {
        return new Kitkat();
    }
}