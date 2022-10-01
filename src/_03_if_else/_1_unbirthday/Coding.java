package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Coding {
	public static void main(String[] args) {
		String date = "September 30";
		String birthday = JOptionPane.showInputDialog("When's your birthday?");
		if(birthday .equals(date)) {
			JOptionPane.showMessageDialog(null,"Happy Birthday");
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UnBirthday");
		}
	}

}
