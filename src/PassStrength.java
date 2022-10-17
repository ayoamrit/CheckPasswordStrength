import java.util.ArrayList;

//an interface
interface Result{
    void End();
}

public class PassStrength{
    void Strength(int[] Letters){

        int Total = 0;


        //creating an array list to store the strength of the password
        ArrayList<Integer> PasswordStrength = new ArrayList<Integer>();

        //using for loop to check how strong the password is
        for(int x =0; x<Letters.length;x++){

             if(Letters[x] >= 5){
                 //if letters are more than or equals to 5, strength if 25.
                 PasswordStrength.add(25);
             }
             else{
                 //if the letter are less than 5, strength is (number of letters)*5
                 PasswordStrength.add(Letters[x] * 5);
             }

             //adding the strength of all the different characters.
             Total = Total + PasswordStrength.get(x);
        }



        //Anonymous Inner Class
        int finalTotal = Total;

        Result Call = () ->  //lambda expression
        {
            {
                System.out.println();
                System.out.println("Strength of your password is: "+finalTotal+"%");


                System.out.println("Your password has: ");
                System.out.println("UpperCase: "+Letters[0]);
                System.out.println("LowerCase: "+Letters[1]);
                System.out.println("Digits: "+Letters[2]);
                System.out.println("Special: "+Letters[3]);


                System.out.println();
                if(finalTotal==100){
                    System.out.println("All requirements are met. Your password is perfect.");
                }
                else{

                    System.out.println("To make your password more stronger, include:");

                    //nested if else
                    if(!(Letters[0]>=5)){
                        System.out.println("*"+(5 - Letters[0])+" More Uppercase Letters.");
                    }
                    if(!(Letters[1]>=5)){
                        System.out.println("*"+(5 - Letters[1])+" More Lowercase Letters.");
                    }
                    if(!(Letters[2]>=5)){
                        System.out.println("*"+(5 - Letters[2])+" More Digits.");
                    }
                    if(!(Letters[3]>=5)){
                        System.out.println("*"+(5 - Letters[3])+" More Special Characters.");
                    }
                }

            }
        };
        Call.End();  //calling the function from interface created above.

    }

}
