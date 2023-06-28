package application;

import java.util.Date;

import entities.enums.OrderStatus;
import enttites.Order;

public class Program {

	public static void main(String[] args) {

		Order order = new Order (1080, new Date(),OrderStatus.PENDING_PAYMANT);
		
		System.out.println (order);
		
		OrderStatus os1 = OrderStatus.DEIVELERED;
		OrderStatus os2 = OrderStatus.valueOf("DEIVELERED");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
		
	}

}
