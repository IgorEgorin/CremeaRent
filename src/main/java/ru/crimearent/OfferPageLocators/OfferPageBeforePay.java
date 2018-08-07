package ru.crimearent.OfferPageLocators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OfferPageBeforePay {

    private SelenideElement totalPricePageBeforePay;
    private SelenideElement pricePerDayPageBeforePay;


    public OfferPageBeforePay() {
        this.totalPricePageBeforePay = $(By.xpath("//label[@class=\"form-lbl\" and contains (text(), 'Полная стоимость заказа')]"));
        this.pricePerDayPageBeforePay = $("[class=\"price\"]");
    }

    public String getTotalPricePageBeforePay() {
        return totalPricePageBeforePay.attr("value");
    }

    public String getPricePerDayPageBeforePay() {
        return pricePerDayPageBeforePay.getText();
    }


//    private String getFieldPriceWithOutDiscount() {
//        return fieldPriceWithOutDiscount.getText().replaceAll(" д/сутки","");
//    }
//
//    private String getFieldPriceWithDiscount() {
//        return fieldPriceWithDiscount.getText().replaceAll(" д/сутки","")
//                .replaceAll(fieldPriceWithDiscountAndMoreBigger.getText()+" ","");
//    }
//
//    public String pricePerDayFromBeforePayPageWithDiscountOrNot() {
//        if ($("[class=\"strike color-grey\"]").exists()) {
//            return getFieldPriceWithDiscount();
//        }
//        if (!$("[class=\"strike color-grey\"]").exists()) {
//            return getFieldPriceWithOutDiscount();
//        }
//        return null;
//    }
}

