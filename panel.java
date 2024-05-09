import java.awt.*;
public class panel {
    public static void main(String args[]){
    Frame f = new Frame();
    String t = "MY NAME IS LAKHAN"; 
    Label l = new Label("String: "+ t);
    l.setBounds(50,100,200,100);
    l.setBackground(Color.pink);
    f.add(l);
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(400,300);
}
}