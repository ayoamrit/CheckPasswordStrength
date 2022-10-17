//This program can let you know how strong your password is!

/*
How this program get password strength.
25% (if Uppercase letters are >= 5)
25% (if lowercase letters are >= 5)
25% + 25% (if digits are specials are >= 5)
Total = 100%

if letters, digits or special are less than 5,
(the number of letters)*5 would be the percentage.
*/

//GitHub: ayoamrit


public class Main {

    //main function
    public static void main(String[] args){
        new GetPass(); //calling constructor
    }
}
