package Tobeto.showRoomStore.core.utilities.result;

public class SuccessResult extends Result{


    public SuccessResult(String message, boolean result) {
        super(message, result);
    }


    public SuccessResult(String message){
        super(message,true);
    }
}
