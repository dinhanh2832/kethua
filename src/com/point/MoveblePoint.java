package com.point;

public class MoveblePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveblePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {xSpeed,ySpeed};
    }
    public String toString(){
        return "(" + getX() + "," + getY() + "),speed= (" + getXSpeed() + "," + getYSpeed() + ")";
    }
    public MoveblePoint move(){
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + xSpeed);
        return this;
    }
}
