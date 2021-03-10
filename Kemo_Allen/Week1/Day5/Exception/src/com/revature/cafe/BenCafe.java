package com.revature.cafe;

import java.io.IOException;
import java.util.List;

import com.revature.models.Car;

public class BenCafe implements Cafe{

	@Override
	public void askForOrders() throws IOException {

	}

	@Override
	public double calculateOrderPrice(List<Car> carList) throws IOException, ArithmeticException  {

			this.askForOrders();
		
			try {
				this.askForOrders();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			return 0;
	}
	
	public void riskyMethod() throws IOException {
		
		this.askForOrders();
		this.calculateOrderPrice(null);
	}

}
