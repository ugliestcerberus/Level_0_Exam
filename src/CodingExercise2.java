

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[]args){
String Age= JOptionPane.showInputDialog("How old are you?");
int Year= Integer.parseInt(Age);
int Days= 2016-Year;
JOptionPane.showMessageDialog(null,Days);
if(Year>=30){
	System.out.println("You are too old too play this game");
}
else if(Year<=30){
	System.out.println("Come on and play this game!");
}
}
}



