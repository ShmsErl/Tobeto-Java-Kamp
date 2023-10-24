package Tobeto.showRoomStore.core.utilities.result;



public class SuccessDataResult<T> extends DataResult {
    public SuccessDataResult(String message, T data) {
        super(message, true, data);
    }

    public SuccessDataResult( T data) {
        super(true, data);
    }
    public SuccessDataResult(String message){
        super(message,true,null);
    }
    public SuccessDataResult(){
        super(null,true,null);
    }
}
