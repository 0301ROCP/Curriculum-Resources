package com.revature.cafe;

import java.io.IOException;
import java.util.List;

import com.revature.models.Car;

public interface Cafe {
	
	public void askForOrders() throws IOException;
	
	
	public double calculateOrderPrice(List<Car> carList) throws ArithmeticException, IOException;
	

}
