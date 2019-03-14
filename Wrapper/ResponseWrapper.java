package collabmed.com.collabmeddashboardapp.Wrapper;


/**
 * Created by Benn on 12/2/2018.
 */

public class ResponseWrapper<T> {
    private T data;
//    /*
//     * Status 0 - fetching, 1 - success , 2 - error
//     */
//    private int status;

    private Throwable  throwable;


    public ResponseWrapper(T data, Throwable throwable) {
        this.data = data;
        this.throwable = throwable;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public T getData() {
        return data;
    }

    public void setData(ResponseWrapper<T> responseWrapper){
        this.data = responseWrapper.getData();
        this.throwable = responseWrapper.getThrowable();
    }

}
