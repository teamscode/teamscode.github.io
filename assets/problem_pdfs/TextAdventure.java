/**
 * Although this program seems very long, the majority of this code is reused throughout the program.
 * Once you learn classes and methods, you will be able cut down on code reuse.
 * However, you can already create an awesome text adventure with just the things you have learned.
 * All you need is Scanner, while loops, if statements (also else if/else),
 * primitive variables, print statements and maybe the Math class.
 *
 * Scanner is used for user input.
 * While loops are used to check for valid responses (continues asking for valid response until it is received).
 * If statements are used to determine what the next course of action is based on user input.
 * Primitive variables help keep track of values like health, weapon choice, and the direction the player chooses.
 * Print statements are the center of the game, as they provide the story.
 * And finally, the Math class has Math.random(), which can be used to create random results and make interesting fights.
 *
 * If you are intimidated by the amount of work put into this TextAdventure, know that
 * your text adventure can be much smaller than this one.
 * Please use this TextAdventure as a guide to create your own text adventures.
 * Thanks and good luck!
 */

import java.util.Scanner;

public class TextAdventure {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to play TextAdventure? (Y/N)");

        boolean play = false; //boolean for if they want to play
        String response = scan.nextLine(); //player response

        //while loop to verify a valid response is entered
        while (!response.equals("Y") && !response.equals("N")) {
            System.out.println("Please enter a valid response, Y or N.");
            response = scan.nextLine();
        }

        //change play to yes if they respond Y
        if (response.equals("Y")) {
            play = true;
        }

        //start of game

        while (play) {

            System.out.println("What is your character name? (Between 2-12 letters long).");
            response = scan.nextLine();
            //verify name is within length restrictions
            while (response.length() > 12 || response.length() < 2) {
                System.out.println("Please select a name between 2 and 12 letters long.");
                response = scan.nextLine();
            }
            String name = response; //player name
            int health = 100; //player health

            //choose first item
            System.out.println("Greetings " + name + "!  You are about to embark on a great quest!\nYou currently have 100 health!" +
                    "  You must first choose the item you wish to bring along. (sword/slingshot/shield)");
            response = scan.nextLine();
            while (!response.equals("sword") && !response.equals("slingshot") && !response.equals("shield")) {
                System.out.println("Please choose one of the items available, 'sword', 'slingshot', or 'shield'");
                response = scan.nextLine();
            }
            String item = response; //player item

            //start of quest
            System.out.println("You chose a " + item + "!  Wise choice!\nYou start your journey in a small town named Whiteridge near a large mountain due north," +
                    " a forest to the west, and unknown territory to the east.\nWhere do you want to go?" +
                    "(north/west/east)");
            response = scan.nextLine();
            while (!response.equals("north") && !response.equals("west") && !response.equals("east")) {
                System.out.println("Please choose one of the directions available, 'north', 'west', or 'east'");
                response = scan.nextLine();
            }
            String direction = response; //mountain, forest, or unknown


            //north first section
            if (direction.equals("north")) {
                System.out.println("You see a fiery dragon in the distance.  You will need more supplies if" +
                        " you want to head this direction.\nIt is unadvised that you continue.  What do you" +
                        " choose to do?\nIf you return to the town you will not be able to go to the mountain until" +
                        " you have collected the necessary supplies.  (continue/return to town)");
                response = scan.nextLine();
                while (!response.equals("continue") && !response.equals("return to town")) {
                    System.out.println("Please choose one of the options available, 'continue' or 'return to town'.");
                    response = scan.nextLine();
                }

                //fight dragon early
                if (response.equals("continue")) {
                    System.out.println("You have chosen to fight the mighty dragon Zordor with a measly " + item +
                            ".  The residents of Whiteridge wish you luck on your fight.");
                    System.out.println("Zordor:  Hello " + name + ".  You are ill-prepared for this fight.  Do you " +
                            "have any last words before your imminent demise?");
                    System.out.print(name + ":  ");
                    response = scan.nextLine(); //has no effect on actual game
                    System.out.println("Zordor:  Very well " + name + ".  We shall now fight!");

                    int dragonHealth = 500;
                    int scenario = (int) (Math.random() * 2); //chooses the appropiate scenario
                    //fight begins, ends once dragon or player has 0 health
                    while (dragonHealth > 0 && health > 0) {
                        //scenario 0
                        if (scenario == 0) {

                            System.out.println("Zordor shoots a fireball at you.  What do you do? (dodge/reflect/run away)");
                            response = scan.nextLine();
                            while (!response.equals("dodge") && !response.equals("reflect") && !response.equals("run away")) {
                                System.out.println("Please choose one of the options available, 'dodge', 'reflect', or 'run away'.");
                                response = scan.nextLine();
                            }

                            //dodge
                            if (response.equals("dodge")) {
                                if (Math.random() > 0.5) {
                                    System.out.println("You have successfully dodged!  Get ready for the next attack!");
                                } else {
                                    health -= 25;
                                    System.out.println("You stumbled and the fireball hit you!" +
                                            "\nYou lost 25 health, leaving you with " + health + " health remaining.");
                                }
                                //reflect
                            } else if (response.equals("reflect")) {
                                //shield
                                if (item.equals("shield")) {
                                    if (Math.random() > 0.5) {
                                        dragonHealth -= 75;
                                        System.out.println("Your shield successfully reflected the fireball back at Zordor." +
                                                "\nZordor now has " + dragonHealth + " health.");
                                    } else {
                                        health -= 25;
                                        System.out.println("Your shield was unsuccessful in reflecting the fireball." +
                                                "\nYou lost 25 health, and now have " + health + " health remaining.");
                                    }
                                    //sword
                                } else if (item.equals("sword")) {
                                    if (Math.random() > 0.75) {
                                        dragonHealth -= 75;
                                        System.out.println("Your sword successfully reflected the fireball back at Zordor." +
                                                "\nZordor now has " + dragonHealth + " health.");
                                    } else {
                                        health -= 25;
                                        System.out.println("Your sword was unsuccessful in reflecting the fireball." +
                                                "\nYou lost 25 health, and now have " + health + " health remaining.");
                                    }
                                    //slingshot
                                } else {
                                    health -= 25;
                                    System.out.println("Your slingshot cannot reflect the fireball." +
                                            "\nYou lost 25 health, and now have " + health + " health remaining.");
                                }
                                //run away
                            } else {
                                if (Math.random() > 0.75) {
                                    System.out.println("You have successfully run away, but Zordor chases after you!  Get ready for the next attack!");
                                } else {
                                    health -= 25;
                                    System.out.println("You stumbled and the fireball hit you while trying to run away!" +
                                            "  You lost 25 health, leaving you with " + health + " left remaining.");
                                }
                            }
                            //scenario 1
                        } else if (scenario == 1) {
                            //slingshot
                            if (item.equals("slingshot")) {
                                System.out.println("Zordor starts to charge you, and you see a weakness in its armor." +
                                        "  What do you do?\n(use slingshot/dodge)");
                                response = scan.nextLine();
                                while (!response.equals("dodge") && !response.equals("use slingshot")) {
                                    System.out.println("Please choose one of the options available, 'dodge' or 'use slingshot'.");
                                    response = scan.nextLine();
                                }
                                //use slingshot
                                if (response.equals("use slingshot")) {
                                    if (Math.random() > 0.5) {
                                        dragonHealth -= 75;
                                        System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                    } else {
                                        health -= 25;
                                        System.out.println("You miss, and Zordor attacks you for 25 damage, leaving your health at " + health + ".");
                                    }
                                    //dodge
                                } else {
                                    if (Math.random() > 0.5) {
                                        System.out.println("You have successfully dodged!  Get ready for the next attack!");
                                    } else {
                                        health -= 25;
                                        System.out.println("You stumbled and Zordor attacked you!" +
                                                "\nYou lost 25 health, leaving you with " + health + " health remaining.");
                                    }
                                }
                                //sword
                            } else if (item.equals("sword")) {
                                System.out.println("Zordor starts to charge you, and you brandish your sword." +
                                        "\nWhat do you want to do? (attack/parry)");
                                response = scan.nextLine();
                                while (!response.equals("attack") && !response.equals("parry")) {
                                    System.out.println("Please choose one of the options available, 'attack' or 'parry'.");
                                    response = scan.nextLine();
                                }
                                //attack
                                if (response.equals("attack")) {
                                    if (Math.random() > 0.5) {
                                        dragonHealth -= 75;
                                        System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                    } else {
                                        health -= 25;
                                        System.out.println("You miss, and Zordor attacks you for 25 damage, leaving your health at " + health + ".");
                                    }
                                    //parry
                                } else {
                                    if (Math.random() > 0.25) {
                                        System.out.println("You have successfully parry Zordor's attack!  Get ready for the next attack!");
                                    } else {
                                        health -= 25;
                                        System.out.println("You miss, and Zordor attacks you for 25 damage, leaving your health at " + health + ".");
                                    }
                                }
                                //shield
                            } else {
                                System.out.println("Zordor starts to charge you, and you have a shield in your defense." +
                                        "\nDo you throw your shield to inflict damage or use your shield to defend? (throw/defend)");
                                response = scan.nextLine();
                                while (!response.equals("throw") && !response.equals("defend")) {
                                    System.out.println("Please choose one of the options available, 'throw' or 'defend'.");
                                    response = scan.nextLine();
                                }
                                //throw
                                if (response.equals("throw")) {
                                    if (Math.random() > 0.5) {
                                        dragonHealth -= 75;
                                        System.out.println("You have successfully hit Zordor!\nZordor now has " + dragonHealth + " health remaining, and you manage to pick up the shield again.");
                                    } else {
                                        health -= 25;
                                        System.out.println("You miss, and Zordor attacks you for 25 damage, leaving your health at " + health + ".");
                                    }
                                    //defend
                                } else {
                                    if (Math.random() > 0.25) {
                                        System.out.println("You have successfully defend Zordor's attack!  Get ready for the next attack!");
                                    } else {
                                        health -= 25;
                                        System.out.println("Your shield does not defend Zordor's charge, and Zordor attacks you for 25 damage, leaving your health at " + health + ".");
                                    }
                                }
                            }
                            //scenario 2 (free attack)
                        } else {
                            System.out.println("Zordor attempts to charge but fails.  Do you choose to attack? (Y/N)");
                            response = scan.nextLine();
                            while (!response.equals("Y") && !response.equals("N")) {
                                System.out.println("Please choose one of the options available, 'Y' or 'N'.");
                                response = scan.nextLine();
                            }
                            if (response.equals("Y")) {
                                dragonHealth -= 50;
                                System.out.println("You successfully attack, leaving Zordor at " + dragonHealth + " health.");
                            } else {
                                System.out.println("You missed your opportunity, and now Zordor is once again ready to attack.");
                            }
                        }

                        scenario = (int) (Math.random() * 3); //chooses a new scenario every time
                    }

                    //end game credits
                    if (dragonHealth <= 0) {
                        System.out.println("Congratulations!\n" +
                                "You have successfully defied the odds and defeated the dragon Zordor, saving the town of Whiteridge." +
                                "\nYou are a true hero.");
                    } else {
                        System.out.println("Zordor took over the town of Whiteridge.  Game Over.");
                    }

                    //return to town, now path is west-east-north
                } else {

                    //going west first

                    System.out.println("You return to the village, only to learn that the passage east has been blocked off.  So you head west.");

                    System.out.println("You enter the large forest cautiously as you hear strange animals calling in the distance." +
                            "\nSuddenly, you freeze.  Something is watching you.  What do you do? (run/attack/say hello)");
                    response = scan.nextLine();
                    while (!response.equals("run") && !response.equals("attack") && !response.equals("say hello")) {
                        System.out.println("Please enter a valid response, 'run', 'attack', or 'say hello'.");
                        response = scan.nextLine();
                    }
                    //attack
                    if (response.equals("attack")) {
                        health -= 50;
                        System.out.println("It turns out you accidentally attacked a small, innocent creature." +
                                "\nThe protective tribe of creatures are so angry that they chase you out, inflicting 50 damage." +
                                "\nYou now have " + health + " health.");
                        //say hello
                    } else if (response.equals("say hello")) {
                        health *= 2;
                        System.out.println("You are greeted by a small, innocent creature." +
                                "\nThe tribe the creature is with is so happy to see a townsperson they double your health." +
                                "\nYou now have " + health + " health.");
                        //run
                    } else {
                        System.out.println("You run away, never knowing what was in the forest.");
                    }

                    //go east now

                    System.out.println("You are now back in the town of Whiteridge," +
                            " and the passage north to the mountains is temporarily blocked off." +
                            "\nTherefore, you are forced to go east, to the unknown territory.\nOnce there, " +
                            "you see a large treasure chest sitting out in the middle of a field.\n" +
                            "What do you do? (open the chest/look around)");
                    response = scan.nextLine();
                    while (!response.equals("open the chest") && !response.equals("look around")) {
                        System.out.println("Please enter a valid response, 'open the chest', or 'look around'.");
                        response = scan.nextLine();
                    }
                    //open chest
                    if (response.equals("open the chest")) {
                        System.out.println("You approach the chest with caution - it seems innocent but there could be something evil." +
                                "\nYou cautiously lift up the chest to reveal ... nothing.  Disappointed, you start to walk back." +
                                "\nHowever, you turn around to see a large, menacing man standing there.  What do you do? (say hello/run)");
                        response = scan.nextLine();
                        while (!response.equals("say hello") && !response.equals("run")) {
                            System.out.println("Please enter a valid response, 'say hello', or 'run'.");
                            response = scan.nextLine();
                        }
                        //say hello
                        if (response.equals("say hello")) {
                            System.out.println("You introduce yourself, and the man's evil demeanor instantly turns friendly." +
                                    "\n'" + name + "!', he exclaims.  'I heard you are going to save our town!  Let me give you" +
                                    " a special gift.\nThe man gives you a special, glowing orb.  'I took this out of the chest" +
                                    " when I saw you approaching.\nThis will give you special powers when you go up to the mountain." +
                                    "\nGood luck on your quest, " + name + ".");
                            //run
                        } else {
                            System.out.println("The man watches as you run away, and you forever wonder who the man was.");
                        }
                        //look around
                    } else {
                        System.out.println("You find an evil looking man in the forest surrounding the open area." +
                                "\nNevertheless, you introduce yourself, and the man's evil demeanor instantly turns friendly." +
                                "\n'" + name + "!', he exclaims.  'I heard you are going to save our town!  Let me give you" +
                                "a special gift.\nThe man gives you a special, glowing orb.  'I took this out of the chest" +
                                "when I saw you approaching.\nThis will give you special powers when you go up to the mountain." +
                                "\nGood luck on your quest, " + name + ".");
                    }

                    //go north, dragon fight with full stats (since you have gone east and west)

                    System.out.println("You return to the town, and seeing that you now have to proceed north, you head for the mountains." +
                            "\nYou see a dragon in the distance, who you have heard is named Zordor.  You continue ahead to the mountains.\n");

                    System.out.println("You have chosen to fight the mighty dragon Zordor with a strong " + item +
                            ".  The residents of Whiteridge wish you luck on your fight.");
                    System.out.println("Zordor:  Hello " + name + ".  You are ill-prepared for this fight.  Do you " +
                            "have any last words before your imminent demise?");
                    System.out.print(name + ":  ");
                    response = scan.nextLine(); //has no effect on actual game
                    System.out.println("Zordor:  Very well " + name + ".  We shall now fight!");

                    int dragonHealth = 500;
                    int scenario = (int) (Math.random() * 2); //chooses the appropiate scenario
                    //fight begins, ends once dragon or player has 0 health
                    while (dragonHealth > 0 && health > 0) {
                        //scenario 0
                        if (scenario == 0) {
                            System.out.println("Zordor shoots a fireball at you.  What do you do? (dodge/reflect/run away)");
                            response = scan.nextLine();
                            while (!response.equals("dodge") && !response.equals("reflect") && !response.equals("run away")) {
                                System.out.println("Please choose one of the options available, 'dodge', 'reflect', or 'run away'.");
                                response = scan.nextLine();
                            }
                            //dodge
                            if (response.equals("dodge")) {
                                if (Math.random() > 0.25) {
                                    System.out.println("You have successfully dodged!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("You stumbled and the fireball hit you!" +
                                            "\nYou lost 15 health, leaving you with " + health + " health remaining.");
                                }
                                //reflect
                            } else if (response.equals("reflect")) {
                                //shield
                                if (item.equals("shield")) {
                                    if (Math.random() > 0.25) {
                                        dragonHealth -= 100;
                                        System.out.println("Your shield successfully reflected the fireball back at Zordor." +
                                                "\nZordor now has " + dragonHealth + " health.");
                                    } else {
                                        health -= 15;
                                        System.out.println("Your shield was unsuccessful in reflecting the fireball." +
                                                "\nYou lost 15 health, and now have " + health + " health remaining.");
                                    }
                                    //sword
                                } else if (item.equals("sword")) {
                                    if (Math.random() > 0.3) {
                                        dragonHealth -= 150;
                                        System.out.println("Your sword successfully reflected the fireball back at Zordor." +
                                                "\nZordor now has " + dragonHealth + " health.");
                                    } else {
                                        health -= 15;
                                        System.out.println("Your sword was unsuccessful in reflecting the fireball." +
                                                "\nYou lost 15 health, and now have " + health + " health remaining.");
                                    }
                                    //slingshot
                                } else {
                                    health -= 15;
                                    System.out.println("Your slingshot cannot reflect the fireball." +
                                            "\nYou lost 15 health, and now have " + health + " health remaining.");
                                }
                                //run away
                            } else {
                                if (Math.random() > 0.15) {
                                    System.out.println("You have successfully run away, but Zordor chases after you!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("You stumbled and the fireball hit you while trying to run away!" +
                                            "  You lost 15 health, leaving you with " + health + " left remaining.");
                                }
                            }
                            //scenario 1
                        } else if (scenario == 1) {
                            //slingshot
                            if (item.equals("slingshot")) {
                                System.out.println("Zordor starts to charge you, and you see a weakness in its armor." +
                                        "  What do you do?\n(use slingshot/dodge)");
                                response = scan.nextLine();
                                while (!response.equals("dodge") && !response.equals("use slingshot")) {
                                    System.out.println("Please choose one of the options available, 'dodge' or 'use slingshot'.");
                                    response = scan.nextLine();
                                }
                                //use slingshot
                                if (response.equals("use slingshot")) {
                                    if (Math.random() > 0.25) {
                                        dragonHealth -= 175;
                                        System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                    } else {
                                        health -= 15;
                                        System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                    }
                                    //dodge
                                } else {
                                    if (Math.random() > 0.25) {
                                        System.out.println("You have successfully dodged!  Get ready for the next attack!");
                                    } else {
                                        health -= 15;
                                        System.out.println("You stumbled and Zordor attacked you!" +
                                                "\nYou lost 15 health, leaving you with " + health + " health remaining.");
                                    }
                                }
                                //sword
                            } else if (item.equals("sword")) {
                                System.out.println("Zordor starts to charge you, and you brandish your sword." +
                                        "\nWhat do you want to do? (attack/parry)");
                                response = scan.nextLine();
                                while (!response.equals("attack") && !response.equals("parry")) {
                                    System.out.println("Please choose one of the options available, 'attack' or 'parry'.");
                                    response = scan.nextLine();
                                }
                                //attack
                                if (response.equals("attack")) {
                                    if (Math.random() > 0.25) {
                                        dragonHealth -= 125;
                                        System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                    } else {
                                        health -= 15;
                                        System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                    }
                                    //parry
                                } else {
                                    if (Math.random() > 0.10) {
                                        System.out.println("You have successfully parry Zordor's attack!  Get ready for the next attack!");
                                    } else {
                                        health -= 15;
                                        System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                    }
                                }
                                //shield
                            } else {
                                System.out.println("Zordor starts to charge you, and you have a shield in your defense." +
                                        "\nDo you throw your shield to inflict damage or use your shield to defend? (throw/defend)");
                                response = scan.nextLine();
                                while (!response.equals("throw") && !response.equals("defend")) {
                                    System.out.println("Please choose one of the options available, 'throw' or 'defend'.");
                                    response = scan.nextLine();
                                }
                                //throw
                                if (response.equals("throw")) {
                                    if (Math.random() > 0.3) {
                                        dragonHealth -= 125;
                                        System.out.println("You have successfully hit Zordor!\nZordor now has " + dragonHealth +
                                                " health remaining, and you manage to pick up the shield again.");
                                    } else {
                                        health -= 15;
                                        System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                    }
                                    //defend
                                } else {
                                    if (Math.random() > 0.15) {
                                        System.out.println("You have successfully defend Zordor's attack!  Get ready for the next attack!");
                                    } else {
                                        health -= 15;
                                        System.out.println("Your shield does not defend Zordor's charge, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                    }
                                }

                            }
                            //scenario 2 (free attack)
                        } else {
                            System.out.println("Zordor attempts to charge but fails.  Do you choose to attack? (Y/N)");
                            response = scan.nextLine();
                            while (!response.equals("Y") && !response.equals("N")) {
                                System.out.println("Please choose one of the options available, 'Y' or 'N'.");
                                response = scan.nextLine();
                            }
                            if (response.equals("Y")) {
                                dragonHealth -= 75;
                                System.out.println("You successfully attack, leaving Zordor at " + dragonHealth + " health.");
                            } else {
                                System.out.println("You missed your opportunity, and now Zordor is once again ready to attack");
                            }
                        }

                        scenario = (int) (Math.random() * 3); //chooses a new scenario every time
                    }

                    //end game credits
                    if (dragonHealth <= 0) {
                        System.out.println("Congratulations!\n" +
                                "You have successfully defied the odds and defeated the dragon Zordor, saving the town of Whiteridge." +
                                "\nYou are a true hero.");
                    } else {
                        System.out.println("Zordor took over the town of Whiteridge.  Game Over.");
                    }
                }
                //go west first, then east, then north
            } else if (direction.equals("west")) {

                System.out.println("You enter the large forest cautiously as you hear strange animals calling in the distance." +
                        "\nSuddenly, you freeze.  Something is watching you.  What do you do? (run/attack/say hello)");
                response = scan.nextLine();
                while (!response.equals("run") && !response.equals("attack") && !response.equals("say hello")) {
                    System.out.println("Please enter a valid response, 'run', 'attack', or 'say hello'.");
                    response = scan.nextLine();
                }
                //attack
                if (response.equals("attack")) {
                    health -= 50;
                    System.out.println("It turns out you accidentally attacked a small, innocent creature." +
                            "\nThe protective tribe of creatures are so angry that they chase you out, inflicting 50 damage." +
                            "\nYou now have " + health + " health.");
                    //say hello
                } else if (response.equals("say hello")) {
                    health *= 2;
                    System.out.println("You are greeted by a small, innocent creature." +
                            "\nThe tribe the creature is with is so happy to see a townsperson they double your health." +
                            "\nYou now have " + health + " health.");
                    //run
                } else {
                    System.out.println("You run away, never knowing what was in the forest.");
                }

                //now going east

                System.out.println("You are now back in the town of Whiteridge," +
                        " and the passage north to the mountains is temporarily blocked off." +
                        "\nTherefore, you are forced to go east, to the unknown territory.\nOnce there, " +
                        "you see a large treasure chest sitting out in the middle of a field.\n" +
                        "What do you do? (open the chest/look around)");
                response = scan.nextLine();
                while (!response.equals("open the chest") && !response.equals("look around")) {
                    System.out.println("Please enter a valid response, 'open the chest', or 'look around'.");
                    response = scan.nextLine();
                }
                //open the chest
                if (response.equals("open the chest")) {
                    System.out.println("You approach the chest with caution - it seems innocent but there could be something evil." +
                            "\nYou cautiously lift up the chest to reveal ... nothing.  Disappointed, you start to walk back." +
                            "\nHowever, you turn around to see a large, menacing man standing there.  What do you do? (say hello/run)");
                    response = scan.nextLine();
                    while (!response.equals("say hello") && !response.equals("run")) {
                        System.out.println("Please enter a valid response, 'say hello', or 'run'.");
                        response = scan.nextLine();
                    }
                    //say hello
                    if (response.equals("say hello")) {
                        System.out.println("You introduce yourself, and the man's evil demeanor instantly turns friendly." +
                                "\n'" + name + "!', he exclaims.  'I heard you are going to save our town!  Let me give you" +
                                " a special gift.\nThe man gives you a special, glowing orb.  'I took this out of the chest" +
                                " when I saw you approaching.\nThis will give you special powers when you go up to the mountain." +
                                "\nGood luck on your quest, " + name + ".");
                        //run
                    } else {
                        System.out.println("The man watches as you run away, and you forever wonder who the man was.");
                    }
                    //look around
                } else {
                    System.out.println("You find an evil looking man in the forest surrounding the open area." +
                            "\nNevertheless, you introduce yourself, and the man's evil demeanor instantly turns friendly." +
                            "\n'" + name + "!', he exclaims.  'I heard you are going to save our town!  Let me give you" +
                            "a special gift.\nThe man gives you a special, glowing orb.  'I took this out of the chest" +
                            "when I saw you approaching.\nThis will give you special powers when you go up to the mountain." +
                            "\nGood luck on your quest, " + name + ".");
                }

                //go north, dragon fight with full stats (since you have gone east and west)

                System.out.println("You return to the town, and seeing that you now have to proceed north, you head for the mountains." +
                        "\nYou see a dragon in the distance, who you have heard is named Zordor.  You continue ahead to the mountains.\n");

                System.out.println("You have chosen to fight the mighty dragon Zordor with a strong " + item +
                        ".  The residents of Whiteridge wish you luck on your fight.");
                System.out.println("Zordor:  Hello " + name + ".  You are ill-prepared for this fight.  Do you " +
                        "have any last words before your imminent demise?");
                System.out.print(name + ":  ");
                response = scan.nextLine(); //has no effect on actual game
                System.out.println("Zordor:  Very well " + name + ".  We shall now fight!");

                int dragonHealth = 500;
                int scenario = (int) (Math.random() * 2); //chooses the appropiate scenario
                //fight begins, ends once dragon or player has 0 health
                while (dragonHealth > 0 && health > 0) {
                    //scenario 0
                    if (scenario == 0) {
                        System.out.println("Zordor shoots a fireball at you.  What do you do? (dodge/reflect/run away)");
                        response = scan.nextLine();
                        while (!response.equals("dodge") && !response.equals("reflect") && !response.equals("run away")) {
                            System.out.println("Please choose one of the options available, 'dodge', 'reflect', or 'run away'.");
                            response = scan.nextLine();
                        }
                        //dodge
                        if (response.equals("dodge")) {
                            if (Math.random() > 0.25) {
                                System.out.println("You have successfully dodged!  Get ready for the next attack!");
                            } else {
                                health -= 15;
                                System.out.println("You stumbled and the fireball hit you!" +
                                        "\nYou lost 15 health, leaving you with " + health + " health remaining.");
                            }
                            //reflect
                        } else if (response.equals("reflect")) {
                            //shield
                            if (item.equals("shield")) {
                                if (Math.random() > 0.25) {
                                    dragonHealth -= 100;
                                    System.out.println("Your shield successfully reflected the fireball back at Zordor." +
                                            "\nZordor now has " + dragonHealth + " health.");
                                } else {
                                    health -= 15;
                                    System.out.println("Your shield was unsuccessful in reflecting the fireball." +
                                            "\nYou lost 15 health, and now have " + health + " health remaining.");
                                }
                                //sword
                            } else if (item.equals("sword")) {
                                if (Math.random() > 0.3) {
                                    dragonHealth -= 150;
                                    System.out.println("Your sword successfully reflected the fireball back at Zordor." +
                                            "\nZordor now has " + dragonHealth + " health.");
                                } else {
                                    health -= 15;
                                    System.out.println("Your sword was unsuccessful in reflecting the fireball." +
                                            "\nYou lost 15 health, and now have " + health + " health remaining.");
                                }
                                //slingshot
                            } else {
                                health -= 15;
                                System.out.println("Your slingshot cannot reflect the fireball." +
                                        "\nYou lost 15 health, and now have " + health + " health remaining.");
                            }
                            //run away
                        } else {
                            if (Math.random() > 0.15) {
                                System.out.println("You have successfully run away, but Zordor chases after you!  Get ready for the next attack!");
                            } else {
                                health -= 15;
                                System.out.println("You stumbled and the fireball hit you while trying to run away!" +
                                        "  You lost 15 health, leaving you with " + health + " left remaining.");
                            }
                        }
                        //scenario 1
                    } else if (scenario == 1) {
                        //slingshot
                        if (item.equals("slingshot")) {
                            System.out.println("Zordor starts to charge you, and you see a weakness in its armor." +
                                    "  What do you do?\n(use slingshot/dodge)");
                            response = scan.nextLine();
                            while (!response.equals("dodge") && !response.equals("use slingshot")) {
                                System.out.println("Please choose one of the options available, 'dodge' or 'use slingshot'.");
                                response = scan.nextLine();
                            }
                            //use slingshot
                            if (response.equals("use slingshot")) {
                                if (Math.random() > 0.25) {
                                    dragonHealth -= 175;
                                    System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                                //dodge
                            } else {
                                if (Math.random() > 0.25) {
                                    System.out.println("You have successfully dodged!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("You stumbled and Zordor attacked you!" +
                                            "\nYou lost 15 health, leaving you with " + health + " health remaining.");
                                }
                            }
                            //sword
                        } else if (item.equals("sword")) {
                            System.out.println("Zordor starts to charge you, and you brandish your sword." +
                                    "\nWhat do you want to do? (attack/parry)");
                            response = scan.nextLine();
                            while (!response.equals("attack") && !response.equals("parry")) {
                                System.out.println("Please choose one of the options available, 'attack' or 'parry'.");
                                response = scan.nextLine();
                            }
                            //attack
                            if (response.equals("attack")) {
                                if (Math.random() > 0.25) {
                                    dragonHealth -= 125;
                                    System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                                //parry
                            } else {
                                if (Math.random() > 0.10) {
                                    System.out.println("You have successfully parry Zordor's attack!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                            }
                            //shield
                        } else {
                            System.out.println("Zordor starts to charge you, and you have a shield in your defense." +
                                    "\nDo you throw your shield to inflict damage or use your shield to defend? (throw/defend)");
                            response = scan.nextLine();
                            while (!response.equals("throw") && !response.equals("defend")) {
                                System.out.println("Please choose one of the options available, 'throw' or 'defend'.");
                                response = scan.nextLine();
                            }
                            //throw
                            if (response.equals("throw")) {
                                if (Math.random() > 0.3) {
                                    dragonHealth -= 125;
                                    System.out.println("You have successfully hit Zordor!\nZordor now has " + dragonHealth +
                                            " health remaining, and you manage to pick up the shield again.");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                                //defend
                            } else {
                                if (Math.random() > 0.15) {
                                    System.out.println("You have successfully defend Zordor's attack!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("Your shield does not defend Zordor's charge, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                            }

                        }
                        //scenario 2 (free attack)
                    } else {
                        System.out.println("Zordor attempts to charge but fails.  Do you choose to attack? (Y/N)");
                        response = scan.nextLine();
                        while (!response.equals("Y") && !response.equals("N")) {
                            System.out.println("Please choose one of the options available, 'Y' or 'N'.");
                            response = scan.nextLine();
                        }
                        if (response.equals("Y")) {
                            dragonHealth -= 75;
                            System.out.println("You successfully attack, leaving Zordor at " + dragonHealth + " health.");
                        } else {
                            System.out.println("You missed your opportunity, and now Zordor is once again ready to attack");
                        }
                    }

                    scenario = (int) (Math.random() * 3); //chooses a new scenario every time
                }

                //end game credits
                if (dragonHealth <= 0) {
                    System.out.println("Congratulations!\n" +
                            "You have successfully defied the odds and defeated the dragon Zordor, saving the town of Whiteridge." +
                            "\nYou are a true hero.");
                } else {
                    System.out.println("Zordor took over the town of Whiteridge.  Game Over.");
                }
                //last option; east first, then west, then north
            } else {

                //going east

                System.out.println("You travel east, to the unknown territory.\nOnce there, " +
                        "you see a large treasure chest sitting out in the middle of a field.\n" +
                        "What do you do? (open the chest/look around)");
                response = scan.nextLine();
                while (!response.equals("open the chest") && !response.equals("look around")) {
                    System.out.println("Please enter a valid response, 'open the chest', or 'look around'.");
                    response = scan.nextLine();
                }
                //open the chest
                if (response.equals("open the chest")) {
                    System.out.println("You approach the chest with caution - it seems innocent but there could be something evil." +
                            "\nYou cautiously lift up the chest to reveal ... nothing.  Disappointed, you start to walk back." +
                            "\nHowever, you turn around to see a large, menacing man standing there.  What do you do? (say hello/run)");
                    response = scan.nextLine();
                    while (!response.equals("say hello") && !response.equals("run")) {
                        System.out.println("Please enter a valid response, 'say hello', or 'run'.");
                        response = scan.nextLine();
                    }
                    //say hello
                    if (response.equals("say hello")) {
                        System.out.println("You introduce yourself, and the man's evil demeanor instantly turns friendly." +
                                "\n'" + name + "!', he exclaims.  'I heard you are going to save our town!  Let me give you" +
                                " a special gift.\nThe man gives you a special, glowing orb.  'I took this out of the chest" +
                                " when I saw you approaching.\nThis will give you special powers when you go up to the mountain." +
                                "\nGood luck on your quest, " + name + ".");
                        //run
                    } else {
                        System.out.println("The man watches as you run away, and you forever wonder who the man was.");
                    }
                    //look around
                } else {
                    System.out.println("You find an evil looking man in the forest surrounding the open area." +
                            "\nNevertheless, you introduce yourself, and the man's evil demeanor instantly turns friendly." +
                            "\n'" + name + "!', he exclaims.  'I heard you are going to save our town!  Let me give you" +
                            "a special gift.\nThe man gives you a special, glowing orb.  'I took this out of the chest" +
                            "when I saw you approaching.\nThis will give you special powers when you go up to the mountain." +
                            "\nGood luck on your quest, " + name + ".");
                }

                //now going west

                System.out.println("You are now back in the town of Whiteridge," +
                        " and the passage north to the mountains is temporarily blocked off." +
                        "\nTherefore, you are forced to go west.\n");

                System.out.println("You enter the large forest cautiously as you hear strange animals calling in the distance." +
                        "\nSuddenly, you freeze.  Something is watching you.  What do you do? (run/attack/say hello)");
                response = scan.nextLine();
                while (!response.equals("run") && !response.equals("attack") && !response.equals("say hello")) {
                    System.out.println("Please enter a valid response, 'run', 'attack', or 'say hello'.");
                    response = scan.nextLine();
                }
                //attack
                if (response.equals("attack")) {
                    health -= 50;
                    System.out.println("It turns out you accidentally attacked a small, innocent creature." +
                            "\nThe protective tribe of creatures are so angry that they chase you out, inflicting 50 damage." +
                            "\nYou now have " + health + " health.");
                    //say hello
                } else if (response.equals("say hello")) {
                    health *= 2;
                    System.out.println("You are greeted by a small, innocent creature." +
                            "\nThe tribe the creature is with is so happy to see a townsperson they double your health." +
                            "\nYou now have " + health + " health.");
                    //run
                } else {
                    System.out.println("You run away, never knowing what was in the forest.");
                }

                //go north, dragon fight with full stats (since you have gone east and west)

                System.out.println("You return to the town, and seeing that you now have to proceed north, you head for the mountains." +
                        "\nYou see a dragon in the distance, who you have heard is named Zordor.  You continue ahead to the mountains.\n");

                System.out.println("You have chosen to fight the mighty dragon Zordor with a strong " + item +
                        ".  The residents of Whiteridge wish you luck on your fight.");
                System.out.println("Zordor:  Hello " + name + ".  You are ill-prepared for this fight.  Do you " +
                        "have any last words before your imminent demise?");
                System.out.print(name + ":  ");
                response = scan.nextLine(); //has no effect on actual game
                System.out.println("Zordor:  Very well " + name + ".  We shall now fight!");

                int dragonHealth = 500;
                int scenario = (int) (Math.random() * 2); //chooses the appropiate scenario
                //fight begins, ends once dragon or player has 0 health
                while (dragonHealth > 0 && health > 0) {
                    //scenario 0
                    if (scenario == 0) {
                        System.out.println("Zordor shoots a fireball at you.  What do you do? (dodge/reflect/run away)");
                        response = scan.nextLine();
                        while (!response.equals("dodge") && !response.equals("reflect") && !response.equals("run away")) {
                            System.out.println("Please choose one of the options available, 'dodge', 'reflect', or 'run away'.");
                            response = scan.nextLine();
                        }
                        //dodge
                        if (response.equals("dodge")) {
                            if (Math.random() > 0.25) {
                                System.out.println("You have successfully dodged!  Get ready for the next attack!");
                            } else {
                                health -= 15;
                                System.out.println("You stumbled and the fireball hit you!" +
                                        "\nYou lost 15 health, leaving you with " + health + " health remaining.");
                            }
                            //reflect
                        } else if (response.equals("reflect")) {
                            //shield
                            if (item.equals("shield")) {
                                if (Math.random() > 0.25) {
                                    dragonHealth -= 100;
                                    System.out.println("Your shield successfully reflected the fireball back at Zordor." +
                                            "\nZordor now has " + dragonHealth + " health.");
                                } else {
                                    health -= 15;
                                    System.out.println("Your shield was unsuccessful in reflecting the fireball." +
                                            "\nYou lost 15 health, and now have " + health + " health remaining.");
                                }
                                //sword
                            } else if (item.equals("sword")) {
                                if (Math.random() > 0.3) {
                                    dragonHealth -= 150;
                                    System.out.println("Your sword successfully reflected the fireball back at Zordor." +
                                            "\nZordor now has " + dragonHealth + " health.");
                                } else {
                                    health -= 15;
                                    System.out.println("Your sword was unsuccessful in reflecting the fireball." +
                                            "\nYou lost 15 health, and now have " + health + " health remaining.");
                                }
                                //slingshot
                            } else {
                                health -= 15;
                                System.out.println("Your slingshot cannot reflect the fireball." +
                                        "\nYou lost 15 health, and now have " + health + " health remaining.");
                            }
                            //run away
                        } else {
                            if (Math.random() > 0.15) {
                                System.out.println("You have successfully run away, but Zordor chases after you!  Get ready for the next attack!");
                            } else {
                                health -= 15;
                                System.out.println("You stumbled and the fireball hit you while trying to run away!" +
                                        "  You lost 15 health, leaving you with " + health + " left remaining.");
                            }
                        }
                        //scenario 1
                    } else if (scenario == 1) {
                        //slingshot
                        if (item.equals("slingshot")) {
                            System.out.println("Zordor starts to charge you, and you see a weakness in its armor." +
                                    "  What do you do?\n(use slingshot/dodge)");
                            response = scan.nextLine();
                            while (!response.equals("dodge") && !response.equals("use slingshot")) {
                                System.out.println("Please choose one of the options available, 'dodge' or 'use slingshot'.");
                                response = scan.nextLine();
                            }
                            //use slingshot
                            if (response.equals("use slingshot")) {
                                if (Math.random() > 0.25) {
                                    dragonHealth -= 175;
                                    System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                                //dodge
                            } else {
                                if (Math.random() > 0.25) {
                                    System.out.println("You have successfully dodged!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("You stumbled and Zordor attacked you!" +
                                            "\nYou lost 15 health, leaving you with " + health + " health remaining.");
                                }
                            }
                            //sword
                        } else if (item.equals("sword")) {
                            System.out.println("Zordor starts to charge you, and you brandish your sword." +
                                    "\nWhat do you want to do? (attack/parry)");
                            response = scan.nextLine();
                            while (!response.equals("attack") && !response.equals("parry")) {
                                System.out.println("Please choose one of the options available, 'attack' or 'parry'.");
                                response = scan.nextLine();
                            }
                            //attack
                            if (response.equals("attack")) {
                                if (Math.random() > 0.25) {
                                    dragonHealth -= 125;
                                    System.out.println("You have successfully hit Zordor!  Zordor now has " + dragonHealth + " health remaining.");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                                //parry
                            } else {
                                if (Math.random() > 0.10) {
                                    System.out.println("You have successfully parry Zordor's attack!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                            }
                            //shield
                        } else {
                            System.out.println("Zordor starts to charge you, and you have a shield in your defense." +
                                    "\nDo you throw your shield to inflict damage or use your shield to defend? (throw/defend)");
                            response = scan.nextLine();
                            while (!response.equals("throw") && !response.equals("defend")) {
                                System.out.println("Please choose one of the options available, 'throw' or 'defend'.");
                                response = scan.nextLine();
                            }
                            //throw
                            if (response.equals("throw")) {
                                if (Math.random() > 0.3) {
                                    dragonHealth -= 125;
                                    System.out.println("You have successfully hit Zordor!\nZordor now has " + dragonHealth +
                                            " health remaining, and you manage to pick up the shield again.");
                                } else {
                                    health -= 15;
                                    System.out.println("You miss, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                                //defend
                            } else {
                                if (Math.random() > 0.15) {
                                    System.out.println("You have successfully defend Zordor's attack!  Get ready for the next attack!");
                                } else {
                                    health -= 15;
                                    System.out.println("Your shield does not defend Zordor's charge, and Zordor attacks you for 15 damage, leaving your health at " + health + ".");
                                }
                            }

                        }
                        //scenario 2 (free attack)
                    } else {
                        System.out.println("Zordor attempts to charge but fails.  Do you choose to attack? (Y/N)");
                        response = scan.nextLine();
                        while (!response.equals("Y") && !response.equals("N")) {
                            System.out.println("Please choose one of the options available, 'Y' or 'N'.");
                            response = scan.nextLine();
                        }
                        if (response.equals("Y")) {
                            dragonHealth -= 75;
                            System.out.println("You successfully attack, leaving Zordor at " + dragonHealth + " health.");
                        } else {
                            System.out.println("You missed your opportunity, and now Zordor is once again ready to attack");
                        }
                    }

                    scenario = (int) (Math.random() * 3); //chooses a new scenario every time
                }

                //end game credits
                if (dragonHealth <= 0) {
                    System.out.println("Congratulations!\n" +
                            "You have successfully defied the odds and defeated the dragon Zordor, saving the town of Whiteridge." +
                            "\nYou are a true hero.");
                } else {
                    System.out.println("Zordor took over the town of Whiteridge.  Game Over.");
                }

                //end game credits
                if (dragonHealth <= 0) {
                    System.out.println("Congratulations!\n" +
                            "You have successfully defied the odds and defeated the dragon Zordor, saving the town of Whiteridge." +
                            "\nYou are a true hero.");
                } else {
                    System.out.println("Zordor took over the town of Whiteridge.  Game Over.");
                }


            }

            //play again sequence
            System.out.println("Thanks for playing!  Do you want to play again? (Y/N)");
            response = scan.nextLine();
            while (!response.equals("Y") && !response.equals("N")) {
                System.out.println("Please enter a valid response, Y or N.");
                response = scan.nextLine();
            }
            if (response.equals("Y")) {
                play = true;
            } else {
                play = false;
            }

        }

    }
}