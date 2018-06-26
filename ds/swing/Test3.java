import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Test3 extends JFrame
{
	JPanel panel;
	Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
	public static void main(String args[])
	{
		new Test3("GridBagLayout Example");
	}
	public Test3(String title)
	{
		super(title);
		createGui();
	}
	public void createGui()
	{
		Container con= getContentPane();
		panel = new JPanel();
		GridBagLayout gb = new GridBagLayout();
		panel.setLayout(gb);
		GridBagConstraints c = new GridBagConstraints();
		
		button1=new Button("Button-1");
		button2=new Button("Button-2");
		button3=new Button("Button-3");
		button4=new Button("Button-4");
		button5=new Button("Button-5");
		button6=new Button("Button-6");
		button7=new Button("Button-7");
		button8=new Button("Button-8");
		button9=new Button("Button-9");
		button10=new Button("Button-10");
		
		c.gridx=0;
		c.gridy=0;
		c.fill=GridBagConstraints.HORIZONTAL;
		panel.add(button1,c);
		c.gridx=1;
		c.gridy=0;
		panel.add(button2,c);
		c.gridx=2;
		c.gridy=0;
		panel.add(button3,c);
		c.gridx=3;
		c.gridy=0;
		panel.add(button4,c);
		
		c.gridx=0;
		c.gridy=1;
		c.gridwidth=4;
		c.fill=GridBagConstraints.HORIZONTAL;
		panel.add(button5,c);
		
		c.gridx=0;
		c.gridy=2;
		c.gridwidth=3;
		c.fill=GridBagConstraints.HORIZONTAL;
		panel.add(button6,c);
		c.fill=GridBagConstraints.HORIZONTAL;
		c.gridx=3;
		c.gridy=2;
		panel.add(button7,c);
		
		c.gridx=0;
		c.gridy=3;
		c.gridwidth=1;
		c.gridheight=2;
		c.fill=GridBagConstraints.BOTH;
		panel.add(button8,c);
		c.gridx=1;
		c.gridy=3;
		c.gridwidth=3;
		c.fill=GridBagConstraints.HORIZONTAL;
		panel.add(button9,c);
		c.gridx=1;
		c.gridy=4;
		c.gridwidth=3;
		c.fill=GridBagConstraints.HORIZONTAL;
		panel.add(button10,c);
		
		
		
		con.add(panel);
		this.setSize(500,500);
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}