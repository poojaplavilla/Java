package ui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class UI extends JFrame {

	public static void main(String [] args) {		
		UI ui = new UI();		
	}
	
	JLabel jlabelId, jlabelTitle, jlabelBody;
	JPanel jpanel;
	JTextField jtextId, jtextTitle,jtextBody;
	JButton jbuttonSave, jbuttonExit;
	
	public UI() {
		
		setTitle("UI JDBC");
		setSize(600,150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jpanel = new JPanel();
		jpanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
		
		jlabelId = new JLabel("Id: ");
		jlabelTitle = new  JLabel("Title: ");
		jlabelBody = new  JLabel("Body: ");
		
		jtextId = new JTextField(10);
		jtextTitle = new JTextField(10);
		jtextBody = new JTextField(10);
		
		jbuttonSave = new JButton("SAVE");
		jbuttonExit = new JButton("EXIT");
		
		jpanel.add(jlabelId);
		jpanel.add(jtextId);
		jpanel.add(jlabelTitle);
		jpanel.add(jtextTitle);
		jpanel.add(jlabelBody);
		jpanel.add(jtextBody);
		jpanel.add(jbuttonSave);
		jpanel.add(jbuttonExit);
		
		add(jpanel);
		
		jbuttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Save is clicked ");
				}
		}
		);
		
		//jbuttonSave.addActionListener((ActionEvent e) -> System.out.println("Save is clicked"));
		setVisible(true);		
	}
}
