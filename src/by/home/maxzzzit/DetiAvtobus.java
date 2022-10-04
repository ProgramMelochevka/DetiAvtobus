package by.home.maxzzzit;

import java.util.Scanner;

public class DetiAvtobus {

	public static void main(String[] args) {
		Scanner kolvo = new Scanner(System.in);
		int deti, avtobus, mest = 40;
		System.out.println("Сколько детей едет на экскурсию?");
		deti = kolvo.nextInt();
		avtobus = deti / mest;
		if (deti % mest > 0)
			avtobus++;
		System.out.println("Для " + deti + " детей необходимо " + avtobus + " автобуса");
	}

}
