package com.soohyun.food;

import java.util.Scanner;

public class FoodMenu {
	public void select(Food [] foods) {
		Scanner sc = new Scanner(System.in);

		int select =0;
		FoodInput foodInput = new FoodInput();
		FoodReceipt foodReceipt = new FoodReceipt();
		FoodOrder foodOrder = new FoodOrder();
		FoodView foodView = new FoodView();
		boolean check = true;

		while(check) {
			System.out.println("1.주문\t2.결산");
			select = sc.nextInt();

			if(select == 1) {
				foodOrder.order(foods); //여기까진

			}//손님이 주문하는거
			else {
				foodView.view(foods);
				System.out.println("결산");
			}
		} //주문과 결산 반복
	



	}
}