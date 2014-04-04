package dg.maincode.managers;

import java.util.ArrayList;
import java.util.HashMap;

import dg.maincode.STLObjecten.STLObject;
import dg.maincode.STLObjecten.STLTriagle;
import dg.maincode.STLObjecten.STLSide;

public class STLObjectManager {	
	static private HashMap<String,STLObject> STLObjecten;
	static{
		//anything static that needs to be initialized for this class;
		STLObjecten = new HashMap<String, STLObject>();
	}
	
	static public void addNewObject(ArrayList<STLSide> sTLSides, String name, int iD){
		//STLObjecten.put(name, new STLTriagle(sTLSides, name, iD));
	}
	
	static public STLObject getObject(String name){
		return STLObjecten.get(name);
	}
	
	static public ArrayList<float[]> getFloatDataFromObject(String name){
		ArrayList<float[]> temp = new ArrayList<float[]>();
		HashMap<Integer,STLTriagle> tempMap = STLObjecten.get(name).getSTLTriagle();
		int i = 0;
		STLTriagle t = null;
		while((t = tempMap.get(i)) != null){
			for(int y= 0;y < 3;i++){
				temp.add(t.getSTLObjectFloatData().get(y));
			}
			i++;
		}
		return temp;
	}
	
	static public float[] FloatDataToFloatVerticesData(ArrayList<float[]> FloatData){
		float[] VerticesData = new float[FloatData.size()*7];
		int vdPosition = 0;
		for(int i = 0;i < FloatData.size();i++){
			VerticesData[vdPosition] = FloatData.get(i)[0];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[1];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[2];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[3];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[4];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[5];
			vdPosition++;
			VerticesData[vdPosition] = FloatData.get(i)[6];
			vdPosition++;
		}
		
		return VerticesData;
	}
	
	static public void generateDummyObjects(){
		
		STLObject tempObj = new STLObject("Dummy 1");
		STLTriagle tempTriagle = null;
		
		//T1 dummy
		ArrayList<STLSide> sTLSides = new ArrayList<STLSide>();
		sTLSides.add(new STLSide(-0.5f, -0.25f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f));
		sTLSides.add(new STLSide(0.5f, -0.25f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f));
		sTLSides.add(new STLSide(0.0f, 0.559016994f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f));
		tempTriagle = new STLTriagle(sTLSides);
		tempObj.addSTLTriagle(tempTriagle);
		
		//T2 dummy
		sTLSides = new ArrayList<STLSide>();
		sTLSides.add(new STLSide(-0.5f, -0.25f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f));
		sTLSides.add(new STLSide(0.5f, -0.25f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f));
		sTLSides.add(new STLSide(0.0f, 0.559016994f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f));
		tempTriagle = new STLTriagle(sTLSides);
		tempObj.addSTLTriagle(tempTriagle);
		
		//T3 dummy
		sTLSides = new ArrayList<STLSide>();
		sTLSides.add(new STLSide(-0.5f, -0.25f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f));
		sTLSides.add(new STLSide(0.5f, -0.25f, 0.0f, 0.5f, 0.5f, 0.5f, 1.0f));
		sTLSides.add(new STLSide(0.0f, 0.559016994f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f));
		tempTriagle = new STLTriagle(sTLSides);
		tempObj.addSTLTriagle(tempTriagle);
		
		//Object 1 dummy
		STLObjecten.put(tempObj.getName(), tempObj);
	}
	
}
