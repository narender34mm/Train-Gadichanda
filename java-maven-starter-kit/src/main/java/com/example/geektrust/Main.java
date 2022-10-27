package com.example.geektrust;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import com.example.geektrust.entities.TrainArrival;
import com.example.geektrust.entities.TrainDeparture;

@Generated
public class Main {
	public static void main(String[] args) {

		try {

			
			Scanner scan = new Scanner( new FileInputStream(args[0]));

			while (scan.hasNextLine()) {
				
				String[] p1 = scan.nextLine().split(" ");
				TrainArrival.aTrainArrival(p1);
				String[] p2 = scan.nextLine().split(" ");
				TrainArrival.bTrainArrival(p2);
				TrainDeparture.departure();
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
