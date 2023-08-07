// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        // Array
//        Scanner read = new Scanner(System.in);
//        int Score = 0;
//        System.out.println("this our System, you have to answer the questions and get higher score");
//        System.out.println("----------------------------------------------------------------------");
//
//        System.out.println("Your Good Name :");
//        String Name = read.next();
//
//        //-------------------------------------------
//
//        System.out.println("Enter the number of question :");
//        int num1 = read.nextInt();
//
//        String[] Question = {
//                        "1.did you do the workout today:" ,
//                        "2.How much did you lose this week ?:" ,
//                        "3.your new weight :",
//                        "4.did you aet healthy meals last week:" ,
//                        "5.2 + 2 ?"
//        };
//
//        String[] Answer = {
//                "Yes" ,
//                "1.5" ,
//                "66" ,
//                "Yes" ,
//                "4"
//        };
//
//      for(int i = 0; i <  Question.length ; i++ )
//      {
////                //----------------------------------------------
//                System.out.println(Question[i]);
//                String Y = read.next();
//                if(Y.equals(Answer[i]))
//                {
//                  System.out.println("Good,You get 1 mark ");
//                  Score ++;
//                }
//                else{
//                    System.out.println("You will get more weight");
//                }
//
//      }
//        System.out.println("Total Score "+ Score);
//
//      }


        String[] world = {"Hello","in","our","new","World"};
        String Star = "*";
        String row = " ";
        String space = " ";
        String firstRow = " ";
        int maxlength = world[0].length();
        for(int i = 0; i < world[0].length(); i++)
        {
            if(world[i].length() > maxlength)
            {
                maxlength = world[i].length();
            }
        }

        firstRow = Star.repeat(maxlength +2);
        System.out.println(firstRow);
        for(int i = 0; i < world.length  ; i++ )
        {
            row = "*" + world[i];
            row = row + space.repeat(maxlength - world[i].length());
            row = row + "*";
            System.out.println(row);
        }
        System.out.println(firstRow);
    }


    //----26 - July - 2023----//
}


