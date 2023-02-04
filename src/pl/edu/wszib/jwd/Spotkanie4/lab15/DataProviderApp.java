package pl.edu.wszib.jwd.Spotkanie4.lab15;

public class DataProviderApp {
    public static void main(String[] args) {
        DataProvider dataProvider = new FileDataProvider();
        DataPresenter dataPresenter = new DataPresenter();

        dataPresenter.showData(dataProvider);
    }
}
