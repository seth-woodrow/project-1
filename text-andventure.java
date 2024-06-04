import java.util.scanner


class VoldemortsRevenge
{
    public static baid main(String[] args)
    {
        //intialize the game
        int score=0;
        String command = "";
        int room = 1;
        boolean hasAmulet = false;
        
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            //print room info
            if(room == 1){
                System.out.println("You are in Dubledore's Office");
                System.out.println("Dubledore looks worried. There is a mirrore in the corner");
            }

            else if(room==2)
            {
                System.out.println("You are on a path");
                System.out.println("To the north is the forbidden Forest. the the esat, Voldemort's Castle, and to the south a river.");
            }
            else if (room==3)
            {
                System.out.println("You are at the entreance to Voldemort's Castle.");
                System.out.println("There is a path to the west.");
            }
            
            // Print inventory
            System.out.print("You have: ");
            if(hasAmulet)
            {
                System.out.print("amulet ");
            }
            System.out.println();
            System.out.println("Score: "+score);

             // get player command
            System.out.println("> ");
            command = sc.nextLine();

            //deal with player input
            if(room==1)
            {
                if(command.equals("ask dumbledore"))
                {
                    System.out.println("Hermione and Ron have been kidnapped by Lord Voldemort.");
                    System.out.println("You need to rescue them. Here is a masgic amulet it will glow when you get close.");
                    System.out.println("When you Find them, say'returnus");
                    scsore += 10;
                    hasAmulet = true;
                }

                else if(command.equals("exa mirror")||command.equals("exa magic mirror"))
                {
                    System.out.println("The mirror is large and has ancient wirting. It says 'To useth this myrror, sayeth thou tralfaz'");
                }

                else if(command.equals("say tralfaz"))
                {
                    System.out.println("You float up through the mirror...");
                    room = 2l
                    score +=10
                }

                else
                {
                    System.out.println("Sorry, I don't know how to do that.");
                }
            }
            else if(room==2)
            {
                if(command.equals("e"))
                {
                    room=3;
                }
            }
        }
    }
}