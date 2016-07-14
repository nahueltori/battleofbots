import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Game {

	static int[][] state;
	static int player;
	private final static int LARGO = 10;

    public static void main(String[] args) {
    	state = new int[LARGO][LARGO];
   		readInput(LARGO);
   		
        printState();
    }

    /* Dado un determinado tamaño de matriz (large), se leerá el input de stdin, retornando
    state y player completos. */
    private static void readInput(int large){
    	int line = 0;
    	int col = 0;
			Scanner fi = new Scanner(System.in);
			for(line=0; line<large; line++){
				for(col=0; col<large; col++){
					state[line][col] = fi.nextInt();
				}
			}
			player = fi.nextInt();
    }

    private static void printState(){
    	for(int i=0; i<LARGO; i++){
    		for(int j=0; j<LARGO; j++){
    			System.out.print(state[i][j]);
    		}
    		System.out.println();
    	}
    }

}