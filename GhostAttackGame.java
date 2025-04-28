import java.util.Scanner;
import java.util.Random;

public class GhostAttackGame {
    public static void intruduce(String name, String city, String colour, int age) {
        System.out.println("Hi, I'm " + name);
        System.out.println("I'm from " + city);
        System.out.println("My favourite color is " + colour);
        System.out.println("and I'm " + age + " years old");
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void task1v(String meh) {
        System.out.println("you failed therefore you only get knife");
        String weapon = "knife";
    }

    public static void main(String[] args)throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char characters;
        char task1;
        char location;
        int normalg;
        int girlg;
        int bossg;
        int x;
        int myHp = 1500;
        int gHp = 1400;
        int gGHp = 950;
        int gBHp = 2000;
        boolean fight = false;
        boolean fight2 = false;
        boolean fightb = false;
        int mana = 100;
        int manah = 100;
        char book;
        String next;
        String riddle;
        String riddlea;
        String riddleb;
        String riddlec;
        char foodd = 'a';
        String dog = "s";
        String weapon = "";

        System.out.println("WELCOME IN THE TOKYO AT 2050, THAT'S UNDER THE ATTACK OF GHOST");
        System.out.println("Choose your character, with u will save the city.");
        System.out.println("Nakashi(type N)");
        System.out.println("Akira(type A)");
        System.out.println("Kushina(type K)");

        while (true) {
            characters = scanner.next().charAt(0);

            switch (characters) {
                case 'N':
                    intruduce("Nakashi", "Tokyo", "purple", 17);
                    break;
                case 'A':
                    intruduce("Akira", "Kyoto", "black", 16);
                    break;
                case 'K':
                    intruduce("Kushina", "Osaka", "red", 17);
                    break;
                default:
                    System.out.print("wrong letter, try again: ");
                    continue;
            }
            break;
        }

        // UVOD
        System.out.println(" ");
        System.out.println("Dabi: ,,Oh, hi you're finally awake''.");
        sleep(3000);
        System.out.println("Dabi: ,,U somehow got in the center of Tokyo, which is under the attack of ghosts.''");
        sleep(3000);
        System.out.println("Dabi: ,,U have to get to the only train that still works and it will take u to our base.'' ");
        sleep(3000);
        System.out.println("There is no time to waste, so let's go");
        System.out.println(" ");
        sleep(3000);
        System.out.println("You should get a weapon first");
        System.out.println("If you answer one of these questions correctly, you will get:");
        sleep(3000);
        System.out.println("a - a gun");
        System.out.println("b - a sword");
        System.out.println("c - a bow");
        System.out.println("Choose the one you want or know the answer");
        System.out.println("a) 17 + 3 * 5 = ?");
        System.out.println("b) 6 * 9 + 6 + 9 = ?");
        System.out.println("c) 10 * 10 + 15 + 18 = ?");

        while (true) {
            System.out.print("letter: ");
            task1 = scanner.next().charAt(0);
            System.out.print("result: ");
            x = scanner.nextInt();
            switch (task1) {
                case 'a':
                    if (x == 32) {
                        weapon = "gun";
                        System.out.println("you obtain " + weapon);
                    } else {
                        task1v(" ");
                    }
                    break;
                case 'b':
                    if (x == 69) {
                        weapon = "sword";
                        System.out.println("you obtain " + weapon);
                    } else {
                        task1v(" ");
                    }
                    break;
                case 'c':
                    if (x == 133) {
                        weapon = "bow";
                        System.out.println("you obtain " + weapon);
                    } else {
                        task1v(" ");
                    }
                    break;
                default:
                    System.out.print("wrong letter, try again ");
                    continue;
            }
            break;
        }

        System.out.println();
        System.out.println("Dabi: \"Now you have everything you need, I have to go now so see you at the base hopefully...\"");
        sleep(3000);
        System.out.println("Dabi: \"...oh I almost forgot, here you have this handbook, you will find everything you need here and now actually goodbye\"");
        sleep(3000);
        System.out.println("type 'h' to open the handbook");
        book = scanner.next().charAt(0);

        System.out.println("HANDBOOK");
        System.out.println("types of ghosts:");
        System.out.println("Normal ghost - max. atk 500, HP 1400");
        System.out.println("Little girl - max. atk 700, HP 950");
        System.out.println("Boss - max. atk 1000, HP 2000");
        Thread.sleep(3000);
        System.out.println("fighting options:");
        System.out.println("1) normal atk max. 350/500");
        System.out.println("2) spell max. 2x normal atk, can be used only twice (you have 100 mana, 1 spell = -50 mana)");
        System.out.println("3) heal can be also used only twice (u have 100 mana heal 1 heal = -50 mana)");
        Thread.sleep(3000);
        System.out.println("Choose the next location, each one is different, so choose wisely.");
        System.out.println("a) Shibuya");
        System.out.println("b) Shinjuku");
        location = scanner.next().charAt(0);

        switch (location) {
            case 'a':
                System.out.println("You headed towards Shibuya...");
                System.out.println("You found some food, but it's dog food. Do you want to pick it up?");
                System.out.println("y=yes, n=no");
                foodd = scanner.next().charAt(0);

                if (foodd == 'y') {
                    System.out.println("After a while, you find a dog");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Don't be shy, give him the food");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("awwwww");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("He seems to like it");
                    System.out.print("Give him a name: ");
                    dog = scanner.next();
                }

                try {
                    Thread.sleep(3000); //zkrátit-nahradit
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Oh sh*t, did you just hear that?");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("You slowly turn around...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("...and see a ghost staring at you");

                ///////////////////////////////////////////////////////////////////fight1//////////////////////////////////////

                while (!fight) {
                    int myAtk = random.nextInt(350);
                    int gAtk = random.nextInt(500);
                    System.out.println("1) use " + weapon + " 2) use spell 3) heal");
                    normalg = scanner.next().charAt(0);

                    switch (normalg) {
                        case '1':
                            myHp -= gAtk;
                            gHp -= myAtk;
                            System.out.println("Your atk " + myAtk + ", your Hp " + myHp + ", ghost atk " + gAtk + ", ghost Hp " + gHp);
                            break;
                        case '2':
                            if (mana >= 50) {
                                myHp -= gAtk;
                                gHp = gHp - (2 * myAtk);
                                mana -= 50;
                            } else {
                                System.out.println("you don't have enough mana");
                            }
                            System.out.println("Your atk " + 2*myAtk + ", your Hp " + myHp + ", ghost atk " + gAtk + ", ghost Hp " + gHp);
                            break;
                        case '3':
                            if (manah >= 50) {
                                myHp += 100;
                                manah -= 50;
                            }
                            System.out.println(myHp);
                            break;
                    }

                    if (gHp <= 0 && myHp > 0 ) {
                        System.out.println("Ghost is dead, you win");
                        fight = true;
                    } else {
                        System.out.println("try again");
                    }

                    if (myHp <= 0) {
                        System.out.println("you died, you lose");
                        myHp = 1500;
                        gHp = 1000;
                        mana = 100;
                        manah = 100;
                        fight = false;
                    }
                }
                System.out.println("*...ugh,uff,uff* u got me, but at least I can finally rest in peace... Oh wait, one last thing. You said you're heading toward the boss ghost... he, he kidnapped one woman. Could you please save her after you beat his ass? It... it... is my sister. Tell her that I love her and I am okay at a safe place. Here is a map *Cough, cough* just save her please.");
                break;

                 /////////////////////////////////////////////////////////fight2////////////////////////////////////////////////////////////

            case 'b':
                System.out.println("You headed towards Shinjuku ... ");
                System.out.println("You found some food, but it's dog food. Do you want to pick it up?");
                System.out.println("y = yes, n = no");
                foodd = scanner.next().charAt(0);

                if (foodd == 'y') {
                    System.out.println("After a while you find a dog");
                    sleep(3000);
                    System.out.println("awwwww");
                    sleep(3000);
                    System.out.println("Don't be shy, give him the food");
                    sleep(3000);
                    System.out.println("He seems to like it");
                    System.out.print("Give him a name: ");
                    dog = scanner.next();
                }

                sleep(3000);
                System.out.println("Oh sh*t, did you just hear that?");
                sleep(3000);
                System.out.println("You slowly turn around...");
                sleep(3000);
                System.out.println("... and see a ghost of a little girl staring at you");

                while (!fight2) {
                    int myAtk = random.nextInt(500);
                    int gGAtk = random.nextInt(700);
                    System.out.println("1) use weapon, 2) use spell, 3) heal");
                    girlg = scanner.nextInt();

                    switch (girlg) {
                        case 1:
                            myHp -= gGAtk;
                            gGHp -= myAtk;
                            System.out.println("Your atk " + myAtk + ", your Hp " + myHp + ", ghost atk " + gGAtk + ", ghost Hp " + gGHp);
                            break;
                        case 2:
                            if (mana >= 50) {
                                myHp -= gGAtk;
                                gGHp = gGHp - (2 * myAtk);
                                mana -= 50;
                            } else {
                                System.out.println("You don't have enough mana");
                            }
                            System.out.println("Your atk " + 2*myAtk + ", your Hp " + myHp + ", ghost atk " + gGAtk + ", ghost Hp " + gGHp);
                            break;
                        case 3:
                            if (manah >= 50) {
                                myHp += 100;
                                manah -= 50;
                            }
                            System.out.println(myHp);
                            break;
                    }

                    if (gGHp <= 0 && myHp > 0) {
                        System.out.println("Ghost is dead, you win");
                        fight2 = true;
                    } else {
                        System.out.println("Try again");
                    }

                    if (myHp <= 0) {
                        System.out.println("You died, you lose");
                        myHp = 1500;
                        gGHp = 1000;
                        mana = 100;
                        manah = 100;
                        fight = false;
                    }
                }

                System.out.println("*...ugh,uff,uff* You got me, but at least I can finally rest in peace...");
                System.out.println("Oh wait, one last thing. You said you're heading towards the boss ghost...");
                System.out.println("He kidnapped a woman. Could you please save her after u beat his ass. It.. it .. is *sob,sob* my mother.Tell her that i love her and i am okay at safe place. Here is a map *Cough,cough* just save her please.");
                break;
        }
        sleep(3000);
        System.out.println("You go by the map");
        sleep(3000);
        System.out.println("After a while, you find the place marked on the map");
        sleep(3000);
        System.out.println("There is a door, but you can only open it if you solve the riddle.");
        sleep(3000);

        // RIDDLE 1
        do {
            sleep(3000);
            System.out.println("Cannot be seen, cannot be felt, cannot be heard, cannot be smelt.");
            System.out.println("It lies behind the stars and beneath the hills.");
            System.out.println("Ends life and kills laughter. What am I?");
            riddle = scanner.nextLine();
            riddle = scanner.nextLine();
            if (riddle.equals("dark")) {
                System.out.println("That's right");
            } else {
                System.out.println("Try again");
            }
        } while (!riddle.equals("dark"));

        // RIDDLE 2
        System.out.println("There is another door.");

        do {
            sleep(3000);
            System.out.println("If you break me, I'll not stop working.");
            System.out.println("If you can touch me, my work is done.");
            System.out.println("If you lose me, you must find me with a ring soon after. What am I?");
            riddlea = scanner.nextLine();
            if (riddlea.equals("heart")) {
                System.out.println("That's right");
            } else {
                System.out.println("Try again");
            }
        } while (!riddlea.equals("heart"));

        // RIDDLE 3
        System.out.println("There is another door.");
        do {
            sleep(3000);
            System.out.println("Feed me and I live. Give me a drink and I die. What am I?");
            riddleb = scanner.nextLine();
            if (riddleb.equals("fire")) {
                System.out.println("That's right");
            } else {
                System.out.println("Try again");
            }
        } while (!riddleb.equals("fire"));

        // RIDDLE 4
        System.out.println("There is another door.");

        do {
            sleep(3000);
            System.out.println("I pass before the sun, yet make no shadow. What am I?");
            riddlec = scanner.nextLine();
            if (riddlec.equals("wind")) {
                System.out.println("That's right");
            } else {
                System.out.println("Try again");
            }
        } while (!riddlec.equals("wind"));
        System.out.println("uuu you smartass");
        System.out.println("In front of you, a big room/cave opens");
        System.out.println("Now you have to defeat the boss");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();
        System.out.println("/////////////////////////////////////////////////// BOSS FIGHT ///////////////////////////////////////////////////");
        System.out.println("your hp increases to 1600 and your mana increases to 150");
        myHp = 1600;
        mana = 150;

        while (!fightb) {
            int myAtk = (int) (Math.random() * 600);
            int gBAtk = (int) (Math.random() * 1000);

            System.out.println("1) use " + weapon + " 2) use spell 3) heal");
            bossg = scanner.nextInt();

            switch (bossg) {
                case 1:
                    myHp -= gBAtk;
                    gBHp -= myAtk;
                    System.out.println("Your atk " + myAtk + ", your Hp " + myHp + ", ghost atk " + gBAtk + ", ghost Hp " + gBHp);
                    break;
                case 2:
                    if (mana >= 50) {
                        myHp -= gBAtk;
                        gBHp -= (2 * myAtk);
                        mana -= 50;
                    } else {
                        System.out.println("you don't have enough mana");
                    }
                    System.out.println("Your atk " + myAtk + ", your Hp " + myHp + ", ghost atk " + gBAtk + ", ghost Hp " + gBHp);
                    break;
                case 3:
                    myHp += 100;
                    System.out.println(myHp);
                    break;
            }

            if (gBHp <= 0 && myHp > 0) {
                System.out.println("U WIN");
                fightb = true;
            } else {
                System.out.println("try again");
            }
            if (myHp <= 0) {
                System.out.println("u lose");
                myHp = 1600;
                gBHp = 1500;
                mana = 150;
                fightb = false;
            }
        }

        System.out.println("*ught* you are stronger than I thought...");
        System.out.println("Press Enter to continue...");
        scanner.nextLine();

        System.out.println("At the back, you found the woman..");
        System.out.println("She is really pretty and introduces herself as Bellatrix");

        if (foodd == 'y') {
            sleep(3000);
            System.out.println("*woof, woof*");
            sleep(3000);
            System.out.println("heh? what is that noise");
            sleep(3000);
            System.out.println("omg look, that's " + dog + " how did he find us?");
        } else {
            System.out.println("After that, you all together headed to base");
        }

        sleep(3000);
        System.out.println("Along the way, you talked to Bellatrix and you caught each other's eyes");
        System.out.println("          THE END            ");
        sleep(3000);
        System.out.println("I hope you enjoyed this game <33");
    }



}