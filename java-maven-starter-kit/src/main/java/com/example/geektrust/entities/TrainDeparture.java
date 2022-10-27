package com.example.geektrust.entities;

public class TrainDeparture {
	static int count = 0;
	static int index = 0;
	
	public static void departure() {

		System.out.print("DEPARTURE " + "TRAIN_AB " +  "ENGINE "+  "ENGINE ");

		
		while (count < Train.departureDistance.size()) {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < Train.departureDistance.size(); i++) {
				if (Train.departureDistance.get(i) > max) {
					max = Train.departureDistance.get(i);
					index = i;
				}
			}
			count++;
			Train.departureDistance.set(index, 0);
			if (!Train.departurePlace.get(index).equals("HYB")) {
				System.out.print(Train.departurePlace.get(index) + " ");
			}

		}

	}

}
