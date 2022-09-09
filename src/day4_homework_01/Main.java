package day4_homework_01;

public class Main {

	public static void main(String[] args) {
		
		// Abstract Class Ile Calismak
		// Cok Kullanicili Oyun Puan Hesaplamasi
		ManGameCalculator manGameCalculator = new ManGameCalculator();
		manGameCalculator.calculator();
		manGameCalculator.gameOver();
		
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.calculator();
		womanGameCalculator.gameOver();
		
		ChildGameCalculator childGameCalculator = new ChildGameCalculator();
		childGameCalculator.calculator();
		childGameCalculator.gameOver();
	}
}