/**
 * Created by sasakiumi on 3/4/14.
 */
public class DayState implements State{
    private static DayState ourInstance = new DayState();

    public static DayState getInstance() {
        return ourInstance;
    }

    private DayState() {
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("Use a safe");
    }

    @Override
    public void doAlarm(Context context) {
        context.recordLog("Use a alarm");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("Normal calling");
    }

    @Override
    public String toString() {
        return "Day state";
    }
}
