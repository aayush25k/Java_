package Oops_Concept.Properties_of_Oops.inheritance;

public class box_weight extends box {

    int weight;

    box_weight(){
        this.weight = 0;
    }
    box_weight(int l,int h,int w,int n){
        super(l,h,w);
        // what is super keyword??
        // super keyword allows referencing of the parent class;
        this.weight = n;
        //super(l,h,w); // this will also give error as we have to initialise the content of the parent class first,
        // then the child class;
        // this is because the parent class don't have any information about the child class ,
        // but the child class does have all the information of the parent class;
    }


}
// this is box_weight class which extends from box class;
// we will now create the object of this class in main class;