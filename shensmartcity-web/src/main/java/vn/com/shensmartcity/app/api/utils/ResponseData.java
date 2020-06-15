package vn.com.shensmartcity.app.api.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseData {
  
  private int status;
  private Object data;
  private String message;
  
  public ResponseData() {
  }
  
  public ResponseData(Object data) {
    this.data = data;
  }
  
  public ResponseData(int status, Object data) {
    this.status = status;
    this.data = data;
  }
 
  public static ResponseData PARAM_ERROR(Object data) {
    return new ResponseData(PARAM_ERROR, data, FAILED_MESS);
  }
  
  public static ResponseData SUCCESS(Object data) {
    return new ResponseData(SUCCESS, data, SUCCESSFULLY_MESS);
  }
  
  public static ResponseData NOTFOUND(Object data) {
    return new ResponseData(NOTFOUND, data, FAILED_MESS);
  }
  
  public static ResponseData SQL_FAILED(Object data) {
    return new ResponseData(SQL_FAILED, data, FAILED_MESS);
  }
  
  public static ResponseData SERVER_ERROR(Object data) {
    return new ResponseData(SERVER_ERROR, data, FAILED_MESS);
  }
  
  public static ResponseData VALIDATION_ERROR(Object data) {
    return new ResponseData(VALIDATION_ERROR, data, FAILED_MESS);
  }
  
  public static final int PARAM_ERROR = 100;
  public static final int SUCCESS = 200;
  public static final int NOTFOUND = 300;
  public static final int SQL_FAILED = 400;
  public static final int SERVER_ERROR = 500;
  public static final int VALIDATION_ERROR = 600;
  
  public static final String SUCCESSFULLY_MESS = "Successfully";
  public static final String FAILED_MESS = "Failed";
}
