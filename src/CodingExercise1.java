
/* Level 0 Exam: Coding  Exercise #1 */
import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	private static Object purple;
	private static Object green;

	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		String Color= JOptionPane.showInputDialog("What color would you like to draw?");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(Color.equals("purple")){
		Tortoise.setPenColor(PenColors.Purples.Purple);
		}
		else if(Color.equals("gray")){
		Tortoise.setPenColor(PenColors.Grays.Gray);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for(int i=0; i<5; i++){
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		Tortoise.move(100);
		Tortoise.turn(90);
		}
		
		
	}
}


