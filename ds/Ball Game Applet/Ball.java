//<applet code="Ball.class" width="500" height="500"></applet>

import java.applet.*;
import java.awt.*;
public class Ball extends Applet implements Runnable
{
	Thread t;
	int incx=2,incy=2;
	public int x , y, height, width;
	AudioClip clip;
	public void init()
	{
		t = new Thread(this);
		height=50;
		width=50;
		t.start();
		setBackground(Color.yellow);	
		clip = getAudioClip(getCodeBase(),"notify.wav");		
	}
	public void paint(Graphics g)
	{    
            g.setColor(Color.red);
            g.fillOval(x,y,width,height);
	}
	public void run()
	{
		while(true)
		{
			repaint();
			x+=incx;
			y+=incy;
			if(x<0)
			{
				incx=2;
				clip.play();
			}
			else if(x>=450)
			{
				incx=-2;
				clip.play();
			}

			if(y<0)
			{
				incy=3;
				clip.play();
			}
			else if(y>=450)
			{
				incy=-3;
				clip.play();
			}				
			try{
			Thread.sleep(10);}catch(Exception e){}
		}
	}	
}
