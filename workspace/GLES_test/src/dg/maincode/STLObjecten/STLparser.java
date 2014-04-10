package dg.maincode.STLObjecten;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

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

		    while ((line = br.readLine()) != null) {
		        text.append(line);
		        text.append('\n');
		    }
		    Log.w("Filecontent",text.toString());
		}
		catch (IOException e) {
			Log.w("IOExeption",e.getMessage());
		    //You'll need to add proper error handling here
		}
	}
}
