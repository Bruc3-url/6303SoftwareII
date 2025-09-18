public class EjecutarBuilder6303 {
    
    public static void main(String[] args) {

        //Creacion de los objertos de tipo Convert
        Converter objC1 = new ASCIIConverter();
        Converter objC2 = new PostScriptConverter();
        Converter objC3 = new PDFConverter();

            //RELACIONAR LOS OBJS CON LA CLASE READER
            Reader objR1 = new Reader ("LINE",objC1);
            Reader objR2 = new Reader ("LINE",objC2);
            Reader objR3 = new Reader ("TABLE", objC3);
            Reader objR4 = new Reader ("TABLE", objC1);
            

            //ASCII con LINE
            objR1.parseinput();
            //PostScript con LINE
            objR2.parseinput();
            //PDF con TABLE
            objR3.parseinput();
            //ASCII con TABLE
            objR4.parseinput();

        }

    }







