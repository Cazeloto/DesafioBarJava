package entities;

public class Bill {

	public char gender;
	public int barbequeu;
	public int beer;
	public int sofDrink;

	public double Ticket(char x) {
		if (x == 'F') {
			return 8;
		} else {
			return 10;
		}
	}

	public double Feeding(double refri, double cerva, double espeto) {
		return (refri * 3) + (cerva * 5) + (espeto * 7);

	}

	public double Cover(double conta) {
		if (conta < 40.00) {
			return 4.00;
		} else {
			return 0.00;
		}
	}

	public double Total(double food, double couvert, double ticket) {
		return food + couvert + ticket;

	}

	@Override
	public String toString() {
		return "Bill [sex=" + gender + ", barbequeu=" + barbequeu + ", beer=" + beer + ", sofDrink=" + sofDrink + "]";
	}

}
