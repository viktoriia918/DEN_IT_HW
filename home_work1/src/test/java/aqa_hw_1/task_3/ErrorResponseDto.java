package aqa_hw_1.task_3;

public class ErrorResponseDto {

    private int code;
    private String type;
    private String message;



    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }
    public void setType(String Type) {
        this.type = Type;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}