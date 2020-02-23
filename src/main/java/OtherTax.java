public class OtherTax implements Tax {
    public Integer getTax(int income) {
        int tax = (int) (income*0.5);
        return tax;
    }
}
