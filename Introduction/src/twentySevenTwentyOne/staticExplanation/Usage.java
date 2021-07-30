package twentySevenTwentyOne.staticExplanation;

import twentySevenTwentyOne.staticExplanation.A.B;

import twentySevenTwentyOne.staticExplanation.A.C;

public class Usage {
    // If i were to make a obj of class B i'll have to do this:
    A Aobject = new A();
    B Bobject = Aobject.new B();
    // I'll have to make a obj of class A and then a object of class B

    // But in the case of making object of class C i won't have to go through this long process cause its a static class
    C Cobject = new A.C();
    //  But still have to import A.C from A class
}
