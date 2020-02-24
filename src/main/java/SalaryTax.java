public class SalaryTax implements Tax {

    public SalaryTax(){

    }
    public Integer getTax(int income) {
        int tax = (int) (income*0.1);
        return tax;
    }
}
