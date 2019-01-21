package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AClass {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Health Bingo");
		frame.repaint();
		frame.revalidate();
		frame.setVisible(true);
		frame.setBounds(400, 200, 1200, 1400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Font f = new Font(Font.SANS_SERIF, 40, 40);
		JPanel buttons = new JPanel();
		JButton b0 = new JButton("Bacteria");
		JButton b1 = new JButton("virus");
		JButton b2 = new JButton("wash hands");
		JButton b3 = new JButton("brush teeth");
		JButton b4 = new JButton("cold water");
		JButton b5 = new JButton("citrus fruit");
		JButton b6 = new JButton("vegetables");
		JButton b7 = new JButton("vitamin C");
		JButton b8 = new JButton("swine flu");
		JButton b9 = new JButton("Insulin shots");
		JButton b10 = new JButton("8");
		JButton b11 = new JButton("2000");
		JButton b12 = new JButton("trans fats");
		JButton b13 = new JButton("coming home from outside");
		JButton b14 = new JButton("tobacco");
		JButton b15 = new JButton("alcohol or drugs");
		b0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(0, true);
			}
		});
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(1, true);
			}
		});
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(2, true);
			}
		});
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(3, true);
			}
		});
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(4, true);
			}
		});
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(5, true);
			}
		});
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(6, true);
			}
		});
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(7, true);
			}
		});
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(8, true);
			}
		});
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(9, true);
			}
		});
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(10, true);
			}
		});
		b11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(11, true);
			}
		});
		b12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(12, true);
			}
		});
		b13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(13, true);
			}
		});
		b14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(14, true);
			}
		});
		b15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RuntimeThread.p.clicked.set(15, true);
			}
		});
		
		b0.setFont(f);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		b10.setFont(f);
		b11.setFont(f);
		b12.setFont(f);
		b13.setFont(f);
		b14.setFont(f);
		b15.setFont(f);
		GridLayout layout = new GridLayout();
		layout.setColumns(4);
		layout.setRows(4);
		buttons.setLayout(layout);
		buttons.add(b0);
		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		buttons.add(b4);
		buttons.add(b5);
		buttons.add(b6);
		buttons.add(b7);
		buttons.add(b8);
		buttons.add(b9);
		buttons.add(b10);
		buttons.add(b11);
		buttons.add(b12);
		buttons.add(b13);
		buttons.add(b14);
		buttons.add(b15);
		/*
		
		JPanel down = new JPanel();
		down.add(text);
		frame.setLayout(new BorderLayout());
		frame.add(buttons, BorderLayout.CENTER);
		frame.add(down, BorderLayout.PAGE_END);
		*/
		BorderLayout l = new BorderLayout();
		l.setVgap(20);
		
		frame.setLayout(l);
		frame.add(buttons, BorderLayout.CENTER);
		JTextArea text = new JTextArea();
		frame.add(text, BorderLayout.NORTH);
		text.setFont(new Font(Font.SANS_SERIF, 50, 50));
		text.setText("Hello There");
		Thread thread = new Thread(new RuntimeThread());
		thread.start();
		while (true) {
			text.setText(RuntimeThread.displayedQuestion);
			try {
			if (RuntimeThread.p.green.get(0)) {
				b0.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(1)) {
				b1.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(2)) {
				b2.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(3)) {
				b3.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(4)) {
				b4.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(5)) {
				b5.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(6)) {
				b6.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(7)) {
				b7.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(8)) {
				b8.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(9)) {
				b9.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(10)) {
				b10.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(11)) {
				b11.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(12)) {
				b12.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(13)) {
				b13.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(14)) {
				b14.setBackground(Color.GREEN);
			}
			if (RuntimeThread.p.green.get(15)) {
				b15.setBackground(Color.GREEN);
			}
			} 
			catch (NullPointerException e) {
				
			}
		}
	}

}
