package dg.maincode.STLObjecten;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import dg.maincode.managers.STLObjectManager;

import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

public class STLparser {
	
	private static final File DEFAULT_PATH = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
	
	/**
	 * parse the STL file based on the default path and name.
	 * @param name
	 */
	public static void parseSTL(String name){
		File STLFile = new File(name);
		//Read text from file
		StringBuilder text = new StringBuilder();

		try {
			
		    BufferedReader br = new BufferedReader(new FileReader(STLFile));
		    String line;
		    STLObject obj = new STLObject("temp");
		    STLTriagle Triagle = new STLTriagle();
		    String newObjectname = "";

		    while ((line = br.readLine()) != null) {
		    	line = line.trim();
		    	String[] split = line.split(" ");
		    	
		    	if(split[0].equals("solid")){
		    		newObjectname = split[1];
		    		obj.setName("cube");
		    	}
		    	if(split[0].equals("facet") && split[1].equals("normal")){
		    		Triagle.setNormal(new float[]{Float.parseFloat(split[2]),Float.parseFloat(split[3]),Float.parseFloat(split[4])});
		    	}
		    	if(split[0].equals("vertex"))
		    	{
		    		STLSide side = new STLSide(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]), 0f, 0f, 0f, 0f);
		    		Triagle.addSide(side);
		    	}
		    	if(split[0].equals("endfacet"))
		    	{
		    		obj.addSTLTriagle(Triagle);
		    		Triagle = new STLTriagle();
		    	}
		        text.append(line);
		        text.append('\n');
		    }
		    STLObjectManager.addNewObject(obj);
		    Log.w("NewObject",STLObjectManager.getObject(newObjectname).getName());
		}
		catch (IOException e) {
			Log.w("IOExeption",e.getMessage());
		    //You'll need to add proper error handling here
		}
	}
}
