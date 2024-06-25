// Objects are passed by reference.
class Arg2 {
int a, b;
Arg2(int i, int j) {
a = i;
b = j;
}
// pass an object
void meth(Arg2 o) {
o.a *= 2;
o.b /= 2;
}
}
class CallByRef {
public static void main(String args[]) {
Arg2 ob = new Arg2(15, 20);
System.out.println("ob.a and ob.b before call: " +
ob.a + " " + ob.b);
ob.meth(ob);
System.out.println("ob.a and ob.b after call: " +
ob.a + " " + ob.b);
}
}