package CreationalPatterns.PrototypePattern;

class Main{
    public static void main(String args[])
    {

    PaperDoll originalDoll=new PaperDoll("originalDoll");
    PaperDoll cloneDoll= (PaperDoll)originalDoll.clone();

   System.out.println(originalDoll);
   System.out.println(cloneDoll);
    }


}