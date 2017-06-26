class Area {
    final float PI = 3.14f;
    float r;
    float h;
    Area() {
        r = 1;
        h = 1;
    }
    Area(float x){
        r = x;
        h = 1;
    }
    Area(float x,float y) {
        r = x;
        h = y;
    }
    public void areaOfCircle() {
        float area = (float) (PI*Math.pow(r,2));
        System.out.println("Area of the Circle of Radius : " + r + " is - " + area);
    }
    public void areaOfCylinder() {
        float area = (float) ((2*PI*r*h)+( 2*PI*Math.pow(r,2)) );
        System.out.println("Area of the Cylinder of Radius : " + r + " and Height : " + h + " is - " + area); 
    }
}
class Q4 {
    public static void main(String[] args) {
        Area circle = new Area(2);
        Area cylinder = new Area(2,5);
        circle.areaOfCircle();
        cylinder.areaOfCylinder();
    }
}