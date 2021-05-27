public class Printer {
    
    private int tonerLevel;
    private int numPages;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >-1 && tonerLevel<= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numPages = 0;
        this.duplex = duplex;
    }

    public int fillToner(int fill){
        if (fill >0 && fill <=100){
            if (this.tonerLevel + fill > 100) {
                return -1;
            }
            this.tonerLevel += fill;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int pages){
        System.out.println("Printing pages");
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages/2) + (pages%2);

        }
        this.numPages += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getNumPages() {
        return this.numPages;
    }

    public boolean getDuplex() {
        return this.duplex;
    }

    public boolean isDuplex() {
        return this.duplex;
    }


}
