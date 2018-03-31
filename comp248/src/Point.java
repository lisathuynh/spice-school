public class Point {
    private int x; // x-coordinate
    private int y; // y-coordinate
/* A- Write a constructor to set the coordinates of the point to two specific
values x1 and y1 which are passed from the driver. */
    public Point (int x1, int y1){
        x = x1;
        y = y1;
    }
/* B- Write two accessor methods: One to return the content of the x coordinate,
the other to return the content of the y coordinate. */
    public int getPointX (){
        return x;
    }
    public int getPointY (){
        return y;
    }
/* C- Write two mutator methods: One to set the content of the x coordinate to
some value passed from the driver and one to set the y coordinate to some
value which again is passed from the driver. */
    public void setPointX (int x){
        this.x = x;
    }
    public void setPointY (int y){
        this.y = y;
    }
/* D- Write a method which will return true if two points have the same
coordinates and false otherwise. */
    public boolean PointMatch(){
        return ( x == y);
    }
/* E- Write a method calledreverse which will return a new point with the
coordinates reversed. That is, if the point which invokes the method has
coordinates (a, b), then the method should return a new point with coordinates
(b, a). */
    public void reverse(){
        int switchX = x;
        x = y;
        y = switchX;
    }
/* F- Write a method calledmoveBy which will move a point by an integer value.
The method will add to each coordinate the value passed as argument. So if the
original point was (x1, y1), after this method is invoked it will have the
coordinates (x1+a, y1+a), where a is the argument (the integer value). */
    public void moveBy(int i){
        x += i;
        y += i;
    }
/* G- Write the toString method such that it displays an object in the following
format: Coordinates of point are (x, y) where x and y are the contents of
the instance variables. */
public String toString(){
    return("Coordinates of point are (" + x + ", " + y + ")");
}
} // end of class Point

