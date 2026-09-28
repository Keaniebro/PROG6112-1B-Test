public class ConsoleSalesReport extends ConsoleSales {
    public ConsoleSalesReport(String ConsoleType, String store, int totalSales) {
        super(ConsoleType,store, totalSales );
    }

    public void printConsolesSalesReport() {
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*****************************");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("store: " + getStore());
        System.out.println("CONSOLE SALES REPORT" + getTotalSales());
    }
}
