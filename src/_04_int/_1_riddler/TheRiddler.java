package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle = JOptionPane.showInputDialog("Who can shave three times a day and still grow a beard?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle .equalsIgnoreCase("A barber")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			score--;
		}
		riddle = JOptionPane.showInputDialog("Why did Tigger go to the bathroom?");
		if(riddle .equalsIgnoreCase("He wanted to find his friend, Pooh")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			score--;
		}
		riddle = JOptionPane.showInputDialog("Johnny's dad had told Johnny that if he could get an A+ on his final exam, he could get any ice cream flavor he wanted plus a pizza. When the day for the final exam came, the professor said, \"There are three questions on this exam. You will have one hour to answer them all and no more. Anyone caught taking any longer or cheating will get an automatic F.\" When Johnny received the paper, he read the first question. As he read it, he realized the exam was no piece of cake so he worked as hard as he could. When he finally finished question one, he checked the clock. There was only 5 minutes left! At this rate, he wouldn't be able to finish in time. As Johnny looked around, he saw that there were hundreds of students and figured that he could get away with a few extra minutes, so he worked away past the hour mark. As Johnny went to turn in his paper, the professor stopped him. \"Young man,\" the professor said sternly. \"I saw you keep working long after the 1-hour mark. You were caught cheating and will get an F.\" Thinking quickly, Johnny replied, \"Do you know who I am?\" The professor stoically responded, \"I neither know or care who you are. You need to learn respect and discipline.\" \"Good.\" said Johnny and he ran away. When the day for the exam scores to be announced came, Johnny received an A+. How?");
		if(riddle .equalsIgnoreCase("When the professor confirmed Johnny's anonymity (the professor didn't know who he was), Johnny quickly slipped his exam paper into the pile of exams and ran off, so the professor wouldn't know which exam paper deserved an F. Congratulations on sticking through the whole riddle.")) {
			JOptionPane.showMessageDialog(null, "Correct");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			score--;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
		
	}
}

