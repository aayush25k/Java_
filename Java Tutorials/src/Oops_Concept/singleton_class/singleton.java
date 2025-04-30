package Oops_Concept.singleton_class;

public class singleton {
    // class which can only create one object/instance;
    // to make this we have to make sure that the constructor of the class should only be called once;
    // therefore we have to make the constructor as private(we will study in access modifiers);

    private singleton(){
        //  this constructor can be access in this class only;
        // we cannot access private constructor in any other file or class;
    }


}
