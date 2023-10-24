package Tobeto.showRoomStore.core.utilities.result;

public abstract class DataResult<T> extends Result {

    private T data;
    public DataResult(String message, boolean result,T data) {

        super(message, result);
        this.data = data;
    }

    public DataResult(Boolean result,T data){
        super(result);
        this.data = data;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
