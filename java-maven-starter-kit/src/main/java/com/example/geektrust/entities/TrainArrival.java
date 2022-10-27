package com.example.geektrust.entities;

public class TrainArrival {
	public static void aTrainArrival(String[] train) {

		System.out.print("ARRIVAL " + "TRAIN_A " +"ENGINE ");
		loop(train);
		System.out.println();

	}

	public static void bTrainArrival(String[] train) {

		System.out.print("ARRIVAL " + "TRAIN_B " +  "ENGINE ");
		loop(train);
		System.out.println();

	}

	public static void loop(String[] train) {
		for (int i = 0; i < train.length; i++) {

			if ((Train.bTrain.containsKey(train[i]) && Train.bTrain.get(train[i]) >= Train.bTrain.get("HYB"))) {

				printTrainA(train[i]);

			} else if (Train.aTrain.containsKey(train[i]) && Train.aTrain.get(train[i]) >= Train.aTrain.get("HYB")) {
				printTrainB(train[i]);

			}
		}

	}

	public static void printTrainA(String train) {
		System.out.print(train + " ");
		if (!train.equals("HYB")) {
			Train.departurePlace.add(train);
			Train.departureDistance.add(Train.bTrain.get(train) - Train.bTrain.get("HYB"));

		}
	}
	public static void printTrainB(String train) {
		System.out.print(train + " ");
		if (!train.equals("HYB")) {
			Train.departurePlace.add(train);
			Train.departureDistance.add(Train.aTrain.get(train) - Train.aTrain.get("HYB"));

		}
	}


}
