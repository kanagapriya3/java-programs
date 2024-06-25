class Box {
double width;
double height;
double depth;

Box()
{
width = 5;
height=7;
depth = 8;

}
Box(double w, double h, double d)
{
width = w;
height=h;
depth = d;
}
Box(int w)
{
width = w;
height= 6;
depth = 7;

}

// compute and return volume
double volume() {
return width * height * depth;
}
// sets dimensions of box
void setDim(double w, double h, double d) {
width = w;
height = h;
depth = d;
}
}
class BoxDemo5 {
public static void main(String args[]) {
Box mybox1 = new Box();

Box mybox3 = new Box(5,10,15);
Box mybox4 = new Box(7);
double vol;
// initialize each box
mybox1.setDim(10, 20, 15);

// get volume of first box
vol = mybox1.volume();
System.out.println("Volume is " + vol);
// get volume of second box
vol = mybox3.volume();
System.out.println("Volume is " + vol);
vol = mybox4.volume();
System.out.println("Volume is " + vol);

}

}