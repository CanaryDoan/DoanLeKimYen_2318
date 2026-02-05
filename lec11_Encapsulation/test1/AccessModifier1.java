package lec11_Encapsulation.test1;

public class AccessModifier1 {

    /* Rule 2 same package sub class
* default protected public
     */
    private int pvt = 1;
    int df = 2; //Access modifier default
    protected int pro = 3;
    public int pbl = 4;
    // Methods here can access all variables

    public void display() {
        System.out.println(pvt);
        System.out.println(df);
        System.out.println(pro);
        System.out.println(pbl);
    }
}