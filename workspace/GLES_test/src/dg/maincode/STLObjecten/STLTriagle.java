package dg.maincode.STLObjecten;

import java.util.ArrayList;

public class STLTriagle {
	private ArrayList<STLSide> STLSides;
	private float[] normal; 
	
	public STLTriagle(ArrayList<STLSide> sTLSides) {
		super();
		STLSides = sTLSides;
		normal = new float[3];
	}
	
	public ArrayList<STLSide> getSTLTriagles() {
		return STLSides;
	}
	
	public void setSTLTriagles(ArrayList<STLSide> sTLSides) {
		STLSides = sTLSides;
	}
	
	public ArrayList<float[]> getSTLObjectFloatData(){
		ArrayList<float[]> STLObjectFloatData = new ArrayList<float[]>();
		for(STLSide t : STLSides){
			STLObjectFloatData.add(t.toFloatData());
		}
		return STLObjectFloatData;
	}

	public float[] getNormal() {
		return normal;
	}

	public void setNormal(float[] normal) {
		this.normal = normal;
	}		
	
}
