module com.nafi.simulatingoperationsofkeyacosmeticsltd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nafi.simulatingoperationsofkeyacosmeticsltd to javafx.fxml;
    opens com.nafi.simulatingoperationsofKeyacosmeticsltd.SalesExecutive to javafx.fxml,javafx.base ;
    opens com.nafi.simulatingoperationsofKeyacosmeticsltd.MarketingSpecialist to javafx.fxml,javafx.base ;

    exports com.nafi.simulatingoperationsofkeyacosmeticsltd;
    exports nafi;
    opens nafi to javafx.fxml;
}