package innerclasses;

public class CoffeeShop {
	private String place;
	private int capacity;
	
	class CafeCoffeeDay {
		private String coffeeName;
		private int price;
		
		public CafeCoffeeDay() {
			
		}
		public CafeCoffeeDay(String coffeeName, int price) {
			this.coffeeName = coffeeName;
			this.price = price;
		}
		public String getCoffeeName() {
			return coffeeName;
		}
		public void setCoffeeName(String coffeeName) {
			this.coffeeName = coffeeName;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public void printCCD() {
			System.out.println("Name of coffee= " + coffeeName);
			System.out.println("Price of coffee= " + price);
		}
	}

	public CoffeeShop() {
		
	}

	public CoffeeShop(String place, int capacity) {
		
		this.place = place;
		this.capacity = capacity;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void printCD() {
		System.out.println("Area= " + place);
		System.out.println("Total no. of people= " + capacity);
	}
	
}
