public class Reader {

    private String element;
    private Converter converter;

    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }


    public void parseinput(String element){

        switch (element){
            case "line":
                converter.makeLine();
                break;
            case "paragraph":
                converter.makeParagraph();
                break;
            case "table":
                converter.makeTable();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
     
    }
}