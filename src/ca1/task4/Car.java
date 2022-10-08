package ca1.task4;

public class Car {
	private String make;
	private String model;
	private String color;
	
	
	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}
	
	@Override
	public String toString() {
		
		
		return  this.make +" , "+ this.model +" , "+ this.color;
	}
	
	
	@Override
    public boolean equals(Object o) {
		if(o == this) {
			return true;
		}
		
		if(!(o instanceof Car)) {
			return false;
		}
		
		if (o ==null || getClass() != o.getClass()) {
			return false;
		}
		
		Car c = (Car) o;
		
		return  this.color == c.color && this.model == c.model ;
		
		
	}
	
	
	@Override
	public int hashCode() {
		int hash = 0;
		return hash;

	}
	
}
