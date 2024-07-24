package Structuralpatterns.AdapterPattern;

public class Main{
    public static void main(String args[])
    {
        Oldprinter op = new Oldprinter();
        NewPrintInterface printer = new PrinterAdapter(op);

        printer.print();


    }

}