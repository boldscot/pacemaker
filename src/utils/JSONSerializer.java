/*package utils;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Stack;

import models.Activity;
import models.Location;
import models.User;

public class JSONSerializer implements Serializer 
{
	private Stack stack = new Stack();
	private File file;

	public JSONSerializer(File file)
	{
		this.file = file;
	}

	@Override
	public void push(Object o) 
	{
		stack.push(o);
	}

	@Override
	public Object pop() 
	{
		return stack.pop();
	}

	@SuppressWarnings("unchecked")
	public void read() throws Exception 
	{
		ObjectInputStream is = null;

		try 
		{
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.alias("Location", Location.class);
			xstream.alias("Activity", Activity.class);
			xstream.alias("User", User.class);
		} 
		finally 
		{
			if (is != null)
			{
				is.close();
			}
		}
	}

	public void write() throws Exception 
	{
		ObjectOutputStream os = null;
		
		try 
		{
			XStream xstream = new XStream(new JettisonMappedXmlDriver());
			xstream.setMode(XStream.NO_REFERENCES);
			xstream.alias("User", User.class);
			xstream.alias("Activity", Activity.class);
			xstream.alias("Location", Location.class);
		} 
		finally 
		{
			if (os != null)
			{
				os.close();
			}
		}
	}

}*/
