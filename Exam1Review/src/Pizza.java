import java.util.ArrayList;

public class Pizza {

	public static void main(String[] args) {
		private int size;
		private ArrayList<String> toppings;


		public Pizza(int s) {
			this.size=s;
			toppings = new ArrayList<String>();
			toppings.add("Cheese");
		}

		public int getSlices() {
			if (this.size>=12) {
				return 6;
			}

			return 4;
		}

		public void addToppings(String t) {
			toppings.add(t);
		}

		public int getAmountToppings() {
			return this.toppings.size();
		}


	}

}
