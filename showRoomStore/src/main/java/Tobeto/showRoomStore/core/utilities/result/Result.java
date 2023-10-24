package Tobeto.showRoomStore.core.utilities.result;

public abstract class Result {
    private String message;
    private boolean result;

    public Result(String message, boolean result){
        this.message = message;
        this.result = result;


    }

    public Result(String message){
        this.message = message;



    }
    public Result( boolean result){

        this.result = result;


    }

    public String getMessage() {
        return message;
    }

    public boolean getResult(){
        return  result;
    }
}
