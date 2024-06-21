package enumertaion.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {
        HttpStatus[] values = HttpStatus.values();
        for (HttpStatus status : values) {
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        // OK 일 경우에만 return success 해야하는데 넘어오는 파라미터가 없음
        return code >= 200 && code <= 299;
    }
}
