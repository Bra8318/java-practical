import java.awt.*;
import java.awt.event.*;

public class practice1 extends Frame {
	Label l;
	TextField tf;
	Button b;
	Checkbox ck1,ck2,ck3,ck4;
	CheckboxGroup cbg;

	  practice1(){
		l = new Label();
		tf = new TextField();
		b = new Button("click");
		cbg = new CheckboxGroup();
		ck1 = new Checkbox("item1",cbg,false);
		ck2 = new Checkbox("item2",cbg,true); 
		ck3 = new Checkbox("item3",cbg,true);
		ck4 = new Checkbox("item4",cbg,true);

		add(l);
		add(tf);
		add(b);
		add(cbg);
		add(ck);

		l.setBounds(50,100,50,30);
		tf.setBounds(80,100,50,30);
		b.setBounds(100,100,50,30);
		ck1.setBounds(150,100,50,30);
		ck2.setBounds(170,100,50,30);
		ck3.setBounds(190,100,50,30);
		ck4.setBounds(210,100,50,30);

		setSize(300,400);
		setLayout(null);
		setVisible(true);

		//b.addActionListener(this);
	}
	public static void main(String args []){
		new practice1();
	}
}

/*import java.awt.*;  
import java.awt.event.*;  
//1st step  
public class practice1 implements ActionListener{  
public static void main(String[] args) {  
    Frame f=new Frame("ActionListener Example");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
    //2nd step  
    b.addActionListener(this);  
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}  
//3rd step  
public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
}  
}  */

