package Tobeto.showRoomStore.core.utilities.result;

public class ErrorResult extends Result {


    public ErrorResult(String message, boolean result) {
        super(message, result);

    }
    public  ErrorResult(){
        super(false);
    }
}
