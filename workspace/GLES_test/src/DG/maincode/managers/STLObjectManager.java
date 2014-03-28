package DG.maincode.managers;

import java.util.ArrayList;
import java.util.HashMap;
import DG.maincode.STLObjecten.STLObject;
import DG.maincode.STLObjecten.STLTriagle;

public class STLObjectManager {	
	static private HashMap<String,STLObject> STLObjecten;
	static{
		//anything static that needs to be initialized for this class;
		STLObjecten = new HashMap<String, STLObject>();
	}
	
	static public void addNewObject(ArrayList<STLTriagle> sTLTriagles, String name, int iD){
		STLObjecten.put(name, new STLObject(sTLTriagles, name, iD));
	}
	
	static public STLObject getObject(String name){
		return STLObjecten.get(name);
	}
	
	static public ArrayList<float[]> getFloatDataFromObject(String name){
		return STLObjecten.get(name).getSTLObjectFloatData();
	}
	
	static public void generateDummyObjects(){
		
		//O1 dummy
		ArrayList<STLTriagle> sTLTriagles = new ArrayList<STLTriagle>();
		sTLTriagles.add(new STLTriagle(-0.5f, -0.25f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f));
		sTLTriagles.add(new STLTriagle(0.5f, -0.25f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f));
		sTLTriagles.add(new STLTriagle(0.0f, 0.559016994f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
		STLObjecten.put("O1",new STLObject(sTLTriagles, "O1", 0));
		
		//O2 dummy
		sTLTriagles = new ArrayList<STLTriagle>();
		sTLTriagles.add(new STLTriagle(-0.5f, -0.25f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f));
		sTLTriagles.add(new STLTriagle(0.5f, -0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f));
		sTLTriagles.add(new STLTriagle(0.0f, 0.559016994f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f));
		STLObjecten.put("O2",new STLObject(sTLTriagles, "O2", 1));
		
		//O3 dummy
		sTLTriagles = new ArrayList<STLTriagle>();
		sTLTriagles.add(new STLTriagle(-0.5f, -0.25f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f));
		sTLTriagles.add(new STLTriagle(0.5f, -0.25f, 0.0f, 0.5f, 0.5f, 0.5f, 1.0f));
		sTLTriagles.add(new STLTriagle(0.0f, 0.559016994f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f));
		STLObjecten.put("O3",new STLObject(sTLTriagles, "O3", 1));
	}
	
}
