package main;

import java.util.ArrayList;

public class QuestionPicker {
	public static ArrayList<String> questionsT = new ArrayList<String>();
	public static int questionsWrong;
	public QuestionPicker () {
		questionsT.add("What kind of germ is treated with antibiotics?");
		questionsT.add("What is antibiotics bad against");
		questionsT.add("what should you do all the time to not get sick");
		questionsT.add("what should you do for your teeth twice a day");
		questionsT.add("what type of water is not good when you are sick");
		questionsT.add("What types are fruit are good for sick people");
		questionsT.add("what foods are always a healthy option");
		questionsT.add("what vitamin is good for you when you are sick");
		questionsT.add("what disease broke out in 2009-2010");
		questionsT.add("What do type 1 diabetes patients normally use");
		questionsT.add("how many glasses of water should you drink a day");
		questionsT.add("how many calories should a healthy adult eat in a day");
		questionsT.add("What kind of fats are the worst");
		questionsT.add("What usually is a good time to wash hands");
		questionsT.add("what causes lung cancer");
		questionsT.add("what causes addictions");
		questions.add("What kind of germ is treated with antibiotics?");
		questions.add("What is antibiotics bad against");
		questions.add("what should you do all the time to not get sick");
		questions.add("what should you do for your teeth twice a day");
		questions.add("what type of water is not good when you are sick");
		questions.add("What types are fruit are good for sick people");
		questions.add("what foods are always a healthy option");
		questions.add("what vitamin is good for you when you are sick");
		questions.add("what disease broke out in 2009-2010");
		questions.add("What do type 1 diabetes patients normally use");
		questions.add("how many glasses of water should you drink a day");
		questions.add("how many calories should a healthy adult eat in a day");
		questions.add("What kind of fats are the worst");
		questions.add("What usually is a good time to wash hands");
		questions.add("what causes lung cancer");
		questions.add("what causes addictions");
		int count = 0;
		while ( count < 16) {
			Boolean added = false;
			clicked.add(count, added);
			green.add(count, added);
			count++;
		}
		
	}
	public boolean checkForBingo() {
		if (green.get(0) && green.get(1) && green.get(2) && green.get(3)) {
			return true;
		}
		else if (green.get(4) && green.get(5) && green.get(6) && green.get(7)) {
			return true;
		}
		else if (green.get(8) && green.get(9) && green.get(10) && green.get(11)) {
			return true;
		}
		else if (green.get(12) && green.get(13) && green.get(14) && green.get(15)) {
			return true;
		}
		else if (green.get(0) && green.get(4) && green.get(8) && green.get(12)) { 
			return true;
		}
		else if (green.get(1) && green.get(5) && green.get(9) && green.get(13)) {
			return true;
		}
		else if (green.get(2) && green.get(6) && green.get(10) && green.get(14)) {
			return true;
		}
		else if (green.get(3) && green.get(7) && green.get(11) && green.get(15)) {
			return true;
		}
		else if (green.get(0) && green.get(5) && green.get(10) && green.get(15)) {
			return true;
		}
		else if (green.get(3) && green.get(6) && green.get(9) && green.get(12)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public void checkForCorrect() {
		try {
		if (RuntimeThread.displayedQuestion.equals(questionsT.get(0)) && clicked.get(0)) {
			green.set(0, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(1)) && clicked.get(1)) {
			green.set(1, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(2)) && clicked.get(2)) {
			green.set(2, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(3)) && clicked.get(3)) {
			green.set(3, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(4)) && clicked.get(4)) {
			green.set(4, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(5)) && clicked.get(5)) {
			green.set(5, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(6)) && clicked.get(6)) {
			green.set(6, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(7)) && clicked.get(7)) {
			green.set(7, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(8)) && clicked.get(8)) {
			green.set(8, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(9)) && clicked.get(9)) {
			green.set(9, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(10)) && clicked.get(10)) {
			green.set(10, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(11)) && clicked.get(11)) {
			green.set(11, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(12)) && clicked.get(12)) {
			green.set(12, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(13)) && clicked.get(13)) {
			green.set(13, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(14)) && clicked.get(14)) {
			green.set(14, true);
		}
		else if (RuntimeThread.displayedQuestion.equals(questionsT.get(15)) && clicked.get(15)) {
			green.set(15, true);
		}
		else {
			questionsWrong++;
		}
		}
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 16; i++) {
			clicked.set(i, false);
		}
	}
	public void waitForClick() {
		while (true) {
			boolean finalB = false;
			for (int i = 0; i < 16; i++) {
				if (clicked.get(i)) {
					finalB = true;
				}
			}
			if (finalB == true) {
				break;
			}
		}
	}
	public ArrayList<String> questions = new ArrayList<String>();
	public ArrayList<Boolean> clicked = new ArrayList<Boolean>();
	public ArrayList<Boolean> green = new ArrayList<Boolean>();
	
	
	public ArrayList<String> getList() {
		return questions;
	}
}
