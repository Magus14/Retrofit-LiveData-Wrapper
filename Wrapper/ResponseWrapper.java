public class ResponseWrapper<T> {
    private T data;

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
