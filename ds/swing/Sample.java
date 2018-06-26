import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.UIManager.*;
import javax.swing.*;
import java.awt.event.*;
public class Sample extends JFrame implements ActionListener
{
	JMenuBar menuBar;
	JPanel panel;

	public static void main(String args[]) throws Exception
	{
		Sample sample = new Sample("LookAndFeel GUI");
	}
	
	public Sample(String title)
	{
		super(title);
		createGUI();
	}
	
	public void createGUI()
	{
		panel = new JPanel();
        		panel.setLayout(new GridLayout(2,3));		
		
		for(LookAndFeelInfo info:UIManager.getInstalledLookAndFeels())
		{
			addButton(info);
		}
		
		
		this.add(panel);
		this.setSize(300,300);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void addButton(LookAndFeelInfo info)
	{
		JButton btn=new JButton(info.getName());
		btn.setActionCommand(info.getClassName());
		btn.addActionListener(this);
		panel.add(btn);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		   UIManager.setLookAndFeel(e.getActionCommand());
		   SwingUtilities.updateComponentTreeUI(this);
		}
		catch(Exception exception){}
	}
	
}