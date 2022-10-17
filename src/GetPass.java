import java.util.Scanner;

public class GetPass {
    Scanner getInput = new Scanner(System.in);  //scanner to get user input
    String password;

    //creating constructor
    GetPass(){
        startUp();
    }

    void startUp(){

        System.out.println();
        System.out.println("*The Strength Of Your Password Depends Upon The Number Of" +
                " Characters You Are Using (Uppercase, Lowercase, Digits, and Special)");

        System.out.print("""
                        This Program Will Let You Know How Strong Your Password Is!
                        Enter Your Password:\040""");
        //getting user input
        password = getInput.nextLine();


        //calling function CharCheck
        CharCheck(password);

    }

    void CharCheck(String pass){

        int isUpperCase = 0, isLowerCase = 0, isDigit = 0, isSpecial = 0;
        String SpecialChars = "[]{};':,.<>`~@!\\#$%^&*()=+-_/?|]";


        //using for loop to check the type of every character.
        for(int x = 0; x <pass.length(); ++x){
            char c = pass.charAt(x);

            if(Character.isUpperCase(c)){
                ++isUpperCase;  //incrementing isUpperCase if the char is uppercase
            }
            else if(Character.isLowerCase(c)){
                ++isLowerCase;  //incrementing isLowerCase is the char is lowercase
            }
            else if(Character.isDigit(c)){
                ++isDigit;  //incrementing isDigit if the char is a digit
            }
            else if(Character.toString(c).matches(SpecialChars)){
                ++isSpecial;  //incrementing isSpecial is the char is a special letter.
            }
            else if(c == ' '){  //checking if there's any space in the password
                System.out.println("Spaces are not accepted in password.");

                //terminating program
                System.exit(0);
            }
            else {System.out.println("Unexpected Character"); break;}
        }

        //Storing number of different kind of chars in an array
        int[] letters = {isUpperCase, isLowerCase, isDigit, isSpecial};

        //calling function
        PassStrength call = new PassStrength();
        call.Strength(letters);  //passing an array to the function.

    }

}
