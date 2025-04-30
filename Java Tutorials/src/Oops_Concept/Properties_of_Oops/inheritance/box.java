package Oops_Concept.Properties_of_Oops.inheritance;

public class box {
    int h;
    int l;
    int w;

    box(){
        this.h=0;
        this.l=0;
        this.w=0;
    }

    box(int s){
        this.h=s;
        this.l=s;
        this.w=s;
    }
    box(int h,int l,int w){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    // so,this class only contains information about the height,length and width of a box;
    // now in another class we will store the information about the weight of the box;
    // we will inherit the properties of the box class to box_weight class;
    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box(5);
        box b3 = new box(5,10,15);



    }
}
