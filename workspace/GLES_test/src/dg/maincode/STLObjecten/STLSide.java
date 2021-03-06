package dg.maincode.STLObjecten;

public class STLSide {
	
	//Object data
	private float X;
	private float Y;
	private float Z;
	
	//Color data
	private float Red;
	private float Blue;
	private float Green;
	private float Alpha;
	
	
	
	public STLSide(float x, float y, float z, float red, float blue,
			float green, float alpha) {
		super();
		X = x;
		Y = y;
		Z = z;
		Red = red;
		Blue = blue;
		Green = green;
		Alpha = alpha;
	}
	public float getX() {
		return X;
	}
	public void setX(float x) {
		X = x;
	}
	public float getY() {
		return Y;
	}
	public void setY(float y) {
		Y = y;
	}
	public float getZ() {
		return Z;
	}
	public void setZ(float z) {
		Z = z;
	}
	public float getRed() {
		return Red;
	}
	public void setRed(float red) {
		Red = red;
	}
	public float getBlue() {
		return Blue;
	}
	public void setBlue(float blue) {
		Blue = blue;
	}
	public float getGreen() {
		return Green;
	}
	public void setGreen(float green) {
		Green = green;
	}
	public float getAlpha() {
		return Alpha;
	}
	public void setAlpha(float alpha) {
		Alpha = alpha;
	}
	public float[] toFloatData() {
		float[] floatData = new float[7];
		floatData[0] = getX();
		floatData[1] = getY();
		floatData[2] = getZ();
		floatData[3] = getRed();
		floatData[4] = getGreen();
		floatData[5] = getBlue();
		floatData[6] = getAlpha();
		return floatData;
	}
	
	
	
	

}
