import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class paras extends Applet implements ActionListener {
    String s;
    Label l1 = new Label("");
    TextField t1 = new TextField(10);
    Button b1 = new Button("Click");
    
    public void init() {
        add(l1);
        add(t1);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setSize(2000,300);
            l1.setForeground(Color.red);
            s = t1.getText();
            l1.setText(s);
            for(int i=0;i<600;i++){
                l1.setLocation(400, 100+i);
                l1.setText(s);
                int fs=(1000-i)/10;
                l1.setFont(new Font("TimesRoman", Font.PLAIN, fs));
                wait(10);
            }
        }
    }
    public static void wait(int ms){
        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}  
/* 
<applet code="paras.class" width="1000" height="1000"> 
</applet> 
*/
