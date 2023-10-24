package Tobeto.showRoomStore.core.utilities.result;


public class ErrorDataResult<T> extends DataResult {
    public ErrorDataResult(String message,T data) {
        super(message, false, data);
    }

    public ErrorDataResult(T data){
        super(false,data );
    }
    public ErrorDataResult(String message){
        super(message,false,null);
    }
    public ErrorDataResult(){
        super(false,null);
    }
}
