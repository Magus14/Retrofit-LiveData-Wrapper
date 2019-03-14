public class CallbackWrapper<T> implements Callback<T> {
    public MutableLiveData<ResponseWrapper<T>> bodyLiveData;

    public CallbackWrapper(MutableLiveData<ResponseWrapper<T>> bodyLiveData) {
        this.bodyLiveData = bodyLiveData;
    }

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        try{
            Log.e("magus878",response.raw().toString());
            if(response.isSuccessful()){
                bodyLiveData.setValue(new ResponseWrapper<>(response.body(),null));
            }
            else{
                bodyLiveData.setValue(new ResponseWrapper<>(null, new Exception(response.errorBody().string())));
            }
        }
        catch (Exception e){
            bodyLiveData.setValue(new ResponseWrapper<>(null, new Exception(e)));
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        bodyLiveData.setValue(new ResponseWrapper<>(null, t));
    }
}
