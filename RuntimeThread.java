package main;

import java.util.Random;

public class RuntimeThread implements Runnable {
	public static QuestionPicker p;
	public static volatile String displayedQuestion;
	@Override
	public void run() {
		
		
		while (true) {
			displayedQuestion = "Game Starting";
			try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			p = new QuestionPicker();
			QuestionPicker.questionsWrong = 0;
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Random r = new Random();
				int r1 = r.nextInt(p.questions.size());
				displayedQuestion = p.questions.get(r1);
				p.questions.remove(r1);
				if (p.questions.size() <= 0) {
					displayedQuestion = "Game Over! You lose!";
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}
				p.waitForClick();
				p.checkForCorrect();
				
				if (p.checkForBingo()) {
					displayedQuestion = "Game Over! You Win!";
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
				else if (QuestionPicker.questionsWrong >= 3) {
					displayedQuestion = "Game Over! You lose!";
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					break;
				}
				
			}
		}
	}
}
