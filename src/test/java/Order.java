import org.testng.Assert;
import org.testng.annotations.Test;
import ru.crimearent.precondition.Precondition;


public class Order extends Precondition {
    



    @Test()
    public void crimeaRentPositiveOrder() throws Exception {

        String varCityOne = "Алушта";
        String varCityTwo = "Бахчисарай";

        String varTimeTake = "10.08.2018";
        String varTimeReturn = "11.08.2018";

        String varTimeOne = "00:00";
        String varTimeTwo= "00:00";

        String varPromoCode= "0";




        mainPage.enterTakeAndReturnCityDataTimePromocodeSubmit(varCityOne,varCityTwo,varTimeTake,varTimeReturn
                ,varTimeOne, varTimeTwo, varPromoCode);


        String varPricePerDayFromSelectPage = selectCarPage
                .takePriceFromSelectPageDoesNotMatterWithDiscountOrNot();

        selectCarPage.getFirstCarCardSelectPageClick();


        offerPage.selectOneNavigatorCameraFridgeAndTwoKidSeats();

        Assert.assertTrue(varPricePerDayFromSelectPage.equals(offerPage.getPriceRentPerDayOfferPage()),
                "\nPrice per day is:\n" + varPricePerDayFromSelectPage +
                        "\nPrice per day from OfferPage is:\n" + offerPage.getPriceRentPerDayOfferPage());
        offerPage.getSubmitButtonOfferPageClick();

        Assert.assertTrue(varPricePerDayFromSelectPage.equals(entUserDataForResev.getPricePerDayInYourOrderTable())
        ,"Price per day from offer page is:\n"+varPricePerDayFromSelectPage+
        "\nPrice inside table YOUR ORDER is:\n"+entUserDataForResev.getPricePerDayInYourOrderTable());


        String varTotalPriceFromBeforePayPage = entUserDataForResev.getTotalPriceInYourOrderTable();

        entUserDataForResev.enterUserData();


        Thread.sleep(4000);

        System.out.println("total price beforePage"+varTotalPriceFromBeforePayPage);
        System.out.println("price per day beforePage"+offerPageBeforePay.getPricePerDayPageBeforePay());
        System.out.println("total price beforePage"+offerPageBeforePay.getTotalPricePageBeforePay());
//        Assert.assertTrue(varTotalPriceFromYourOrderTable.equals(offerPageBeforePay.getTotalPricePageBeforePay()),
//                "\nTotal price from order table is:\n"+varTotalPriceFromYourOrderTable+
//        "\nTotal price on BeforePayPage is:\n"+offerPageBeforePay.getTotalPricePageBeforePay());
//
//        Assert.assertTrue(varPricePerDayFromSelectPage.equals(offerPageBeforePay.getPricePerDayPageBeforePay()),
//                "\nPrice per day from SelectPage is:\n"+varPricePerDayFromSelectPage+
//        "\nPrice per day on BeforePayPage is:\n"+offerPageBeforePay.getPricePerDayPageBeforePay());



        Thread.sleep(54000000);



    }
}
