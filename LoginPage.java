package Gui;
import java .awt.*; 
import java.awt.event.*;
class LoginPage extends Frame {
/*Frame frame =new Frame();
	Label l1 =new Label("Username");
	Label l2 =new Label("Password");
	TextFeild t1 = new TextFeild();
	TextFeild t2 = new 	TextFeild();
	Button button =new Button("Login");
	l1.setBounds(50,100,80,30);
	l2.setBounds(50,150,80,30);
	t1.setBounds(100,100,200,30);
	t2.setBounds(150,150,200,30);
	button.setBounds(100,200,80,30);
	frame.add(l1,l2);
	frame.add(t1,t2);
	frame.add(button);*/
	TextField name,pass;
	    Button b1,b2;
	    LoginPage()
	    {
	        setLayout(new FlowLayout());
	        this.setLayout(null);
	        Label n=new Label("Name:",Label.CENTER);
	        Label p=new Label("password:",Label.CENTER);
	        name=new TextField(20);
	        pass=new TextField(80);
	        pass.setEchoChar('.');
	        b1=new Button("submit");
	        b2=new Button("cancel");
	        this.add(n);
	        this.add(name);
	        this.add(p);
	        this.add(pass);
	        this.add(b1);
	        this.add(b2);
	        n.setBounds(70,90,90,60);
	        p.setBounds(70,130,90,60);
	        name.setBounds(200,100,90,20);
	        pass.setBounds(200,140,90,20);
	        b1.setBounds(100,260,70,40);
	        b2.setBounds(180,260,70,40);

	    }
	    public static void main(String args[])
	    {
	    	LoginPage ml=new LoginPage();
	        ml.setVisible(true);
	        ml.setSize(400,400);
	        ml.setTitle("my login window");

	    
	
}
}
