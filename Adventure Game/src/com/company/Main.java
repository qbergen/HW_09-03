package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        introSequence();
    }

    public static void introSequence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listen, we don't have much time. HURRY UP, get in the back seat.");
        System.out.println("What's your name ?");
        String userName = scanner.nextLine();
        System.out.println("My name is Java, I am or was a data scientist for the CDC.You were going to get killed out there " + userName + "! \n" + "\n" + "Do you even know whats going on !?");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")) {
            System.out.println("Do you really ?, So you should know better than anybody that the hacker group C4U used" + "\n" + "their coding intelligence to perform reverse methods on our power grids. I'm on my way to Franklin because according to the radio it's the only refugee camp " + "\n" + "within a few hundred miles. There will be all the necesscary equipment for me to regain control of humanity. " + "\n" + "Long story short you have to guide me there, LET's GO!");
            beginningSequence();
        } else {
            if (userInput.equalsIgnoreCase("no")) {
                System.out.println("\n" + "Well I'm going to tell you ");
                System.out.println(" In the last 24 hours the government and the military have been overthrown by the hacker group C4U's. " + "\n" + "They came in offering a solution to some database problems. What we didn't notice was the reverse methods " + "\n" + "they performed on our power grids. You should know better than anybody that if you control the power, you have the power. " + "\n" + "The refugee camp in Franklin has all the essentials we need to regain control over humanity but you need to guide me. Let's GO !");
                beginningSequence();
            } else {
                System.out.println("I don't have time for nonsense either your going to survive this war or get out this car, do you want to live YES OR NO ?");
                String userResponse = scanner.nextLine();
                if (userResponse.equalsIgnoreCase("YES")) {
                    System.out.println("Good");
                    beginningSequence();
                } else if (userResponse.equalsIgnoreCase("NO")) {
                    System.out.println("Get Out then.");
                    System.out.println("GAME OVER");
//                leaveSequence();
                } else {
                    System.out.println("I have a mission to complete and you will not be joining me, GOODBYE " + userName + "!");
//                leaveSequence();
                }

            }
        }
    }

    public static void beginningSequence() {
        boolean answerOne = true;
        while (answerOne) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n" + "Were coming up to a stop sign. Quick, pick a direction. LEFT RIGHT or STRAIGHT");
            String userInput = scanner.nextLine();
            switch (userInput.toUpperCase()) {
                case "LEFT":
                    answerOne = false;
                    System.out.println("NOOOO, left turns make the bolts on the car tires loose, you need to go out there and fix it !");
                    middleSequence();
                    break;
                case "RIGHT":
                    System.out.println("Something is wrong with the car !");
                    middleSequence();
                    break;
                case "STRAIGHT":
                    boolean answerThree = false;
                       {
                        answerOne = false;
                        System.out.println("Sweet, it looks like you brought us right to the gates of the camp," + "\n" + "the code to get in  just has to be a word that starts with the letter C. " + "\n" + " Hurry Up so we can save humanity");
                        String codeAnswer = scanner.nextLine();
                        for (int i = 0; i <= 1; i++)
                            if (codeAnswer.charAt(0) == 'c') {
                                System.out.println("Yes, we can save all of humanity thanks !");
                                System.out.println("GAME OVER");
                            } else if (codeAnswer.charAt(0) == 'C') {
                                System.out.println("Yes, we can save all of humanity thanks");
                                System.out.println("GAME OVER");
                            } else {
//                                answerThree = false;
                                System.out.println("COME ON MAN!!!, I need a code that starts with C ");
                            }
                    }
                    System.out.println("You LOCKED US OUT ! GAME OVER");
                    break;
            }
        }
    }


    public static void middleSequence() {
        boolean answerTwo = true;
        while (answerTwo) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("We gotta fix this somehow, look under your seat, there is a roadside kit ");
            System.out.println("\n");
            System.out.println("Choose which tool you want to use");
            System.out.println("\n");
            System.out.println("1.Shovel");
            System.out.println("\n");
            System.out.println("2.Bandages");
            System.out.println("\n");
            System.out.println("3.Wrench");
            System.out.println("\n");
            System.out.println("4.Plastic Rubber Ducky");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("Go dig your grave because, you clearly don't want to survive, KEEP TRYING");
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n Are you serious ? Think guy, Think !, KEEP TRYING");

                    break;
                case 3:
                    answerTwo = false;
                    System.out.println("\n");
                    System.out.println("I KNEW I CHOOSE THE RIGHT STRANGER FOR THE JOB");
                    endingSequence();
                    break;
                case 4:
                    answerTwo = false;
                    System.out.println("Be realistic, we need to get out of here, forget it ! I'll go out and fix it......");
                    endingSequence();
                    break;

                default:
                    answerTwo = false;
                    System.out.println("Look ! In the horizon is the National Guard, we're saved and have no need to help anyone");
                    System.out.println("GAME OVER");
                    break;


            }
        }
    }

    public static void endingSequence() {
        Scanner scanner = new Scanner(System.in);
        String codeAnswer;
        System.out.println("The car is fixed, I can see the armory in the distance, we need the code though. " + "\n" + "The only requirement is that it starts with the letter C think of one !"+"\n"+"You have 3 chances to be a hero, make a wise decision"+"\n"+"Enter: ");
        codeAnswer = scanner.nextLine();
                if (codeAnswer.charAt(0) == 'c') {
                    System.out.println("Yes, we can save all of humanity thanks !");
                    System.out.println("GAME OVER");

                } else if (codeAnswer.charAt(0) == 'C') {
                    System.out.println("Yes, we can save all of humanity thanks");
                    System.out.println("GAME OVER");
                } else {
                    System.out.println("Come on, I need a code that starts with C !");
                    outLoop();

                }

        }

        public static void outLoop(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("You've got one more time before the alarm system cuts off ! TRY AGAIN");
            String codeAnswer1 = scanner.nextLine();
            if (codeAnswer1.charAt(0) == 'c') {
                System.out.println("Yes, we can save all of humanity thanks !");
                System.out.println("GAME OVER");

            } else if (codeAnswer1.charAt(0) == 'C') {
                System.out.println("Yes, we can save all of humanity thanks");
                System.out.println("GAME OVER");
            } else {
                System.out.println("GREAT !, NOW WE WILL NEVER SAVE HUMANITY");

            }

        }
    }








