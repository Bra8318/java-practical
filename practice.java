
/*import java.awt.*;
//import java.awt.event.*;
public class practice extends Frame{
	practice(){
	Button b = new Button("click me");
	b.setBounds(30,100,80,30);
	add(b);
	
    setVisible(true);
	setLayout(null);
	setSize(300,300);
	setTitle("Frame");}
	public static void main (String args[]){
		new practice();
	}}

import java.awt.*;
import java.awt.event.*;
public class practice implements ActionListener{
	TextField td;
	//practice(){
		public static void main(String args[]){
		Frame f = new Frame();
		Label l = new Label("Enter your name");
		Button b = new Button("click me");
		 td = new TextField();

		b.setBounds(50,100,50,30);
		l.setBounds(90,150,50,30);
		td.setBounds(120,150,50,30);
		f.setSize(300,400);
		f.add(l);
		f.add(b);
		f.add(td);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	b.addActionLisner(ActionEvent e{
		void actionPerformed(ActionEvent e){
			td.setText("Welcome");
		}
	});
		
	}*/
	


/*import java.awt.*;
import java.awt.event.*;
 
public class practice extends Frame implements ActionListener{
 public static void main(String args[]){
	Label l = new Label();
	Button b = new Button("submit");
	TextField tf = new TextField();
	 
	l.setBounds(50,100,50,30);
	b.setBounds(80,100,50,30);
	tf.setBounds(100,100,50,30);

	add(l);add(b);add(tf);
    b.addActionListener(this);


 }
 public void ActionPerformed(ActionEvent e){
	tf.setText("hello how are you");
 }
}

/*public class practice{
	public static void main(String args[]){
		System.out.println("welcome how are you");
	}
}*/
