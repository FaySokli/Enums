package enums;

/**
 *
 * @author froo
 */
public class Friday {
    public enum DaysOfWeek {MONDAY, TUESDAY, 
    WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
    public String howManyDays(DaysOfWeek day) {
         switch(day) {
                case MONDAY:
                    return "4 days left :'(";
                case TUESDAY:
                    return "3 days left :(";
                case WEDNESDAY:
                    return "2 days left :/";
                case THURSDAY:
                    return "1 day left :)";
                case FRIDAY:
                    return "It's Friday :D";
                case SATURDAY:
                    return "5 days left, but it's saturday :)";
                case SUNDAY:
                    return "6 days left, sorry";
                default:
                    return "Not a day";
         }
   }
}

