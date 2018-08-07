package ru.crimearent.mainPageLocators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public SelenideElement tableTakeCityMainPage;
    public SelenideElement tableReturnCityMainPage;

    public SelenideElement fieldCalendarTakeCityMainPage;
    public SelenideElement fieldCalendarReturnCityMainPage;
    public SelenideElement timeTakeCityMainPage;
    public SelenideElement timeReturnCityMainPage;

    public SelenideElement promoCodeFieldMainPage;
    public SelenideElement findCarButtonMainPage;


    public MainPage() {
        this.tableTakeCityMainPage = $("[class=\"selectBox-label\"]",0);
        this.tableReturnCityMainPage = $("[style=\"width: 148px;\"]",1);
        this.fieldCalendarTakeCityMainPage = $("#date-start");
        this.fieldCalendarReturnCityMainPage = $("#date-finish");
        this.timeTakeCityMainPage = $("[class=\"field-time\"]",0);
        this.timeReturnCityMainPage = $("[class=\"field-time\"]",1);
        this.promoCodeFieldMainPage = $(By.name("promocode"));
        this.findCarButtonMainPage = $("[class=\"btn-form btn-form-block\"]");
    }


    public MainPage enterTakeAndReturnCityDataTimePromocodeSubmit (String cityOne, String cityTwo, String dataOne, String dataTwo,
                                                                   String timeOne, String timeTwo, String promoCode) {
        tableTakeCityMainPage.click();
        selectCityTake(cityOne);
        tableReturnCityMainPage.click();
        selectCityReturn(cityTwo);
        fieldCalendarTakeCityMainPage.setValue(dataOne).pressEnter();
        fieldCalendarReturnCityMainPage.setValue(dataTwo).pressEnter();
        timeTakeCityMainPage.click();
        selectTimeTake(timeOne);
        timeReturnCityMainPage.click();
        selectTimeReturn(timeTwo);
        promoCodeFieldMainPage.setValue(promoCode);
        findCarButtonMainPage.click();
        return new MainPage();
    }






    private MainPage selectCityTake (String cityTake) {
        switch (cityTake) {
            case "Алушта":
                $("[rel=\"76149c63-44f4-11e5-aa23-bcee7b591456\"]",0).click();
                break;
        }
        return new MainPage();
    }






    private MainPage selectCityReturn (String cityReturn) {
        switch (cityReturn) {
            case "Алушта":
                $("[rel=\"76149c63-44f4-11e5-aa23-bcee7b591456\"]",1).click();
                break;
            case "Бахчисарай":
                $("[rel=\"2ae17171-e43f-11e5-81f6-ac9e17b8d7a7\"]",1).click();
                break;
        }
        return new MainPage();
    }



    private MainPage selectTimeTake (String timeTake) {
        switch (timeTake) {
            case "00:00":
                $("[rel=\"0\"]",0).click();
                break;

        }
        return new MainPage();

    }



    private MainPage selectTimeReturn (String timeReturn) {
        switch (timeReturn) {
            case "00:00":
                $("[rel=\"0\"]",1).click();
                break;

        }
        return new MainPage();

    }


}
