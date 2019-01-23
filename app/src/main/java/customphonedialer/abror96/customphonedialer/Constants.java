package customphonedialer.abror96.customphonedialer;

import timber.log.Timber;

public class Constants {

    public static String asString(int data) {
        String value;
        switch (data) {
            case 0:
                value = "NEW";
                break;
            case 1:
                value = "DIALING";
                break;
            case 2:
                value = "RINGING";
                break;
            case 3:
                value = "HOLDING";
                break;
            case 4:
                value = "ACTIVE";
                break;
            case 7:
                value = "DISCONNECTED";
                break;
            case 8:
                value = "SELECT_PHONE_ACCOUNT";
                break;
            case 9:
                value = "CONNECTING";
                break;
            case 10:
                value = "DISCONNECTING";
                break;
            default:
                Timber.w("Unknown state " + data);
                value = "UNKNOWN";
                break;
        }
        return value;
    }

}
