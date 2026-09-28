public class ConsoleSales implements IConsoles {
    private String consoleType;
    private String store;
    private int totalSales;

    public  ConsoleSales(String ConsoleType, String Store, int TotalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
