package ex43;

public class Point3D extends Point2D{
    private float z = 0.0f;
    public Point3D() {
        super();
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
public void setxyz(float x,float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
}
public float[] getxyz(){
        return new float[]{x,y,z};
}

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}


