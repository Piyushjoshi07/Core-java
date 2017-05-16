import java.awt.*;
import java.applet.Applet;
/* <applet code="UseParamTag" height="300" width="200">
<param name="site" value="Param Tag Testing"/>
</applet> */
public class UseParamTag extends Applet
{
private String defaultMessage = "Hello";
public void paint(Graphics g)
{
	String s1=getParameter("Site");
	if(s1==null)
	{s1=defaultMessage;}
g.drawString(s1,100,100)	;
}
}