import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.UIManager.*;
import javax.swing.*;
import java.awt.event.*;
public class Sample extends JFrame
{
	JMenuBar menuBar;
	JPanel panel;

	public static void main(String args[]) throws Exception
	{
		Sample sample = new Sample("MenuBar");
		UIManager.setLookAndFeel("javax.swing.UIManager.LookAndFeelInfoWindows");
		SwingUtilities.updateComponentTreeUI(sample);
	
	}
	public Sample(String title)
	{
		super(title);
		createGUI(this);
	}
	public void createGUI(Sample myClass)
	{
		panel = new JPanel();
		GridBagLayout gb = new GridBagLayout(); ////For panel Layout
		panel.setLayout(gb);
		GridBagConstraints c = new GridBagConstraints();
		Container con= getContentPane();
		
		menuBar=new JMenuBar();
		this.setJMenuBar(menuBar);
		
		
		JMenu fileMenu=new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		JMenu editMenu=new JMenu("Edit");
		fileMenu.setMnemonic(KeyEvent.VK_E);
		JMenu settingMenu=new JMenu("Setting");
		fileMenu.setMnemonic(KeyEvent.VK_S);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(settingMenu);
		
		Icon icon = new ImageIcon("info.png");
		JMenuItem fileitem1 = new JMenuItem("Open File",icon);
		KeyStroke fileitem1Key=KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK);
		fileitem1.setHorizontalTextPosition(JMenuItem.RIGHT); ////This Line is optional because, Jmenuitem text by default in right side position;
		
		fileitem1.setAccelerator(fileitem1Key);
		fileitem1.setActionCommand("Open");
		fileitem1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println(e.getActionCommand());
			}
		});
		JMenuItem fileitem2 = new JMenuItem("Save File");
		JMenuItem fileitem3 = new JMenuItem("Save As File");
		JMenuItem fileitem4 = new JMenuItem("Cut");
		JMenuItem fileitem5 = new JMenuItem("Copy");
		JCheckBoxMenuItem checkmenu=new JCheckBoxMenuItem("Show Save Option",true);
		fileMenu.add(checkmenu);
		checkmenu.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				if(e.getStateChange()==2)
					fileMenu.remove(fileitem2);
				else
					fileMenu.add(fileitem2);
					
			}
		});
		
		fileMenu.add(fileitem1);
		fileMenu.add(fileitem2);
		fileMenu.add(fileitem3);
		fileMenu.add(settingMenu);
		JMenuItem fileitem6 = new JMenuItem("XYZ");
		JMenuItem fileitem7 = new JMenuItem("ABC");
		settingMenu.add(fileitem6);
		settingMenu.add(fileitem7);
		editMenu.add(fileitem4);
		editMenu.add(fileitem5);
		
		
		JButton button[] = new JButton[5];
		int i=0;
		
		for(LookAndFeelInfo info:UIManager.getInstalledLookAndFeels())
		{
			button[i] = new JButton(info.getName());
			panel.add(button[i]);
			button[i].setActionCommand(info.getClass()+info.getName());
			
			ActionListener a=new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.out.println(e.getActionCommand());
					
					
				}
			};			
			button[i].addActionListener(a);
			i++;
		}
		
		
		con.add(panel);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}