package builder.cars;

import builder.components.Engine;
import builder.components.GPSNavigator;
import builder.components.Transmission;
import builder.components.TripComputer;

public class Car {
	private final CarType carType;
	private final int seats;
	private final Engine engine;
	private final Transmission transmission;
	private final TripComputer tripcomputer;
	private final GPSNavigator gpsNavigator;
	private double fuel = 0;
	public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripcomputer,
			GPSNavigator gpsNavigator) {
		
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripcomputer = tripcomputer;
		if(this.tripcomputer != null) {
			this.tripcomputer.setCar(this);;	
		}
		
		this.gpsNavigator = gpsNavigator;
	}


	public CarType getCarType() {
		return carType;
	}
	
	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public TripComputer getTripcomputer() {
		return tripcomputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}
	
	
}
