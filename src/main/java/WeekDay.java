public enum WeekDay {
    MON("星期一"),TUE("星期二"),WED("星期三"),THU("星期四"),FRI("星期五"),STA("星期六"),SUN("星期日");
    public final String dayValue;
    private WeekDay(String dayValue){
        this.dayValue = dayValue;
    }

    public String toString(){
        return dayValue;
    }
}
