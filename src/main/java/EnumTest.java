/**
 * @ClassName EnumTest
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/3/4 13:48
 **/
public class EnumTest extends Demo{
    public static void main(String[] args){
        logger.info(WeekDay.MON.toString());

        WeekDay day = WeekDay.MON;
        switch (day){
            case MON:logger.info("today is " + day);
            break;
            case TUE:
            case WED:
            case THU:
            case FRI:
            case STA:
            case SUN:
                default:{
                    throw new RuntimeException("cannot process " + day);
                }
        }
    }
}
