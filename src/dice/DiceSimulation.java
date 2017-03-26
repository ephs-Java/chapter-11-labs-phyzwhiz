package dice;

//This class simulates rolling a pair of dice 10,000 times and
//counts the number of times doubles of are rolled for each
//different pair of doubles.
public class DiceSimulation {
	public static void main(String[] args) {
		final int NUMBER = 10000; // the number of times to roll the dice
		
		// create 2 Dice objects, die1 and die2
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
		int count = 0; // number of times the dice were rolled
		int snakeEyes = 0; // number of times snake eyes is rolled
		int twos = 0; // number of times double two is rolled
		int threes = 0; // number of times double three is rolled
		int fours = 0; // number of times double four is rolled
		int fives = 0; // number of times double five is rolled
		int sixes = 0; // number of times double six is rolled

		// create 2 dice, roll them 10000 times, and keep track of the doubles.
		// what method(s) do you need to write in the Dice class to make this work?
		for (int i = 0; i < 10000; i ++) {
			die1.roll();
			die2.roll();
			if (die1.isDouble(die2)) {
				if (die1.pips() == 1) {
					snakeEyes++;
				}
				else if (die1.pips() == 2) {
					twos++;
				}
				else if (die1.pips() == 3) {
					threes++;
				}
				else if (die1.pips() == 4) {
					fours++;
				}
				else if (die1.pips() == 5) {
					fives++;
				}
				else if (die1.pips() == 6) {
					sixes++;
				}
			}
			count++;
		}
		
		// preformatted output to be used after the 10000 rolls above.
		System.out.println("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
		System.out.println("You rolled double twos " + twos + " out of " + count + " rolls.");
		System.out.println("You rolled double threes " + threes + " out of " + count + " rolls.");
		System.out.println("You rolled double fours " + fours + " out of " + count + " rolls.");
		System.out.println("You rolled double fives " + fives + " out of " + count + " rolls.");
		System.out.println("You rolled double sixes " + sixes + " out of " + count + " rolls.");
	}
}
