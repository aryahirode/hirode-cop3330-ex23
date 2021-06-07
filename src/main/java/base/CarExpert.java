/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class CarExpert {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        CarExpert myApp = new CarExpert();
        myApp.output();
    }

    private String silPrompt() {
        System.out.print("Is the car silent when you turn the key? ");
        return in.nextLine();
    }

    private String batPrompt() {
        System.out.print("Are the battery terminals corroded? ");
        return in.nextLine();
    }

    private String slickPrompt() {
        System.out.print("Does the car make a slicking noise? ");
        return in.nextLine();
    }

    private String crankPrompt() {
        System.out.print("Does the car crank up but fail to start? ");
        return in.nextLine();
    }

    private String diePrompt() {
        System.out.print("Does the engine start and then die? ");
        return in.nextLine();
    }

    private String fuelPrompt() {
        System.out.print("Does your car have fuel injection? ");
        return in.nextLine();
    }

    private void output() {
        String sil = silPrompt();
        if (sil.equals("y")) {
            String bat = batPrompt();
            if (bat.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            }
            else {
                System.out.println("Replace cables and try again.");
            }
        }
        else {
            String slick = slickPrompt();
            if (slick.equals("y")) {
                System.out.println("Replace the battery.");
            }
            else {
                String crank = crankPrompt();
                if (crank.equals("y")) {
                    System.out.println("Check spark plug connections.");
                }
                else {
                    String die = diePrompt();
                    if (die.equals("y")) {
                        String fuel = fuelPrompt();
                        if (fuel.equals("y")) {
                            System.out.println("Get in for service.");
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}
