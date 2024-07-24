package Structuralpatterns.AdapterPattern;


// Adapter that makes oldPrinter compatible with newprinterInterface 

class PrinterAdapter implements NewPrintInterface{
private Oldprinter op;

public PrinterAdapter(Oldprinter op)
{
    this.op=op;
}
    
    @Override
    public void print() {
        op.Oldprintermethod();
          
    }
    
}

