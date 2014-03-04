/**
 * Created by sasakiumi on 3/4/14.
 */
public class NightState implements State{
    private static NightState ourInstance = new NightState();

    public static NightState getInstance() {
        return ourInstance;
    }

    private NightState() {
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("Use in night");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("Calling in night");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("Record calling in night");
    }

    @Override
    public String toString() {
        return "in night";
    }
}
