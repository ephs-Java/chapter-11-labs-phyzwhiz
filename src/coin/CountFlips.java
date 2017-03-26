package coin;

public class CountFlips {
	// -----------------------------------------------------------------
	// Flips a coin multiple times and counts the number of heads
	// and tails that result.
	//		Output:
	//			The number flips: 1000
	//			The number of heads: 493
	//			The number of tails: 507
	// -----------------------------------------------------------------
	public static void main(String[] args) {
		Coin coin = new Coin();
		int howManyFlips = 1000;
		int headCount = 0;
		int tailCount = 0;
		for (int i = 0; i < howManyFlips; i++) {
			coin.flip();
			if (coin.isHeads())
				headCount++;
			else 
				tailCount++;
		}
		System.out.println("flips : " + howManyFlips
				+ "\nheads : " + headCount
				+ "\ntails : " + tailCount);
	}
}
