/* This program demonstrates the difference between
public and private.
*/
class AccessTest {
int a; // default access
public int b; // public access
private int c; // private access
// methods to access c
void setc(int i) { // set c's value
c = i;
}
int getc() { // get c's value
return c;
}
public static void main(String args[]) {
AccessTest ob = new AccessTest();
// These are OK, a and b may be accessed directly
ob.a = 10;
ob.b = 20;
// This is not OK and will cause an error
// ob.c = 100; // Error!
// You must access c through its methods
ob.setc(100);

 // OK
}
}