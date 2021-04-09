package com.company;

public class Point3D extends Point2D{
    private float z=0.0f;

    public Point3D(){}
    public Point3D(float z){
        this.z=z;
    }
    public Point3D(float x, float y, float z){
        //nếu super(this.x, this.y) là sai vì this là gọi đến đối tượng hiện tại của lớp đó.
        super(x,y);
        this.z= z;
    }
    public float getZ(){
        return this.z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x,float y, float z){
        //Nếu để set(float x) là lỗi
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),this.z};
    }
    public String toString(){
        return "(x= "+super.getX()+ ",y= "+super.getY()+ ",z= "+ this.z+")";
    }


}
