package BookStore.utility;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@JsonInclude(Include.NON_NULL)
public class ResponseHandler implements Serializable  {

	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object data;

	    private List<?> datas;
	    
	    private Boolean isSuccess;

	    private String message;

	    private Integer generatedId;
	    
	    private boolean hasError;

	    private boolean hasDuplicate;
	    
	    public ResponseHandler(String message, Integer generatedId) {
	        this.message = message;
	        this.generatedId = generatedId;
	    }
	    
	     public ResponseHandler(String message, Boolean isSuccess) {
	        this.message = message;
	        this.isSuccess = isSuccess;
	    }
	     

	     public Integer getGeneratedId() {
	         return generatedId;
	     }

	     public void setGeneratedId(Integer generatedId) {
	         this.generatedId = generatedId;
	     }

	     public ResponseHandler(String message) {
	         this.message = message;

	     }

	     public String getMessage() {
	         return message;
	     }

	     public void setMessage(String message) {
	         this.message = message;
	     }

	     public ResponseHandler() {
	     }

	     public ResponseHandler(Object data, List<Object> datas) {
	         this.data = data;
	         this.datas = datas;
	     }

	     public ResponseHandler(Object data) {
	         this.data = data;
	     }

	     public ResponseHandler(List<Object> datas) {
	         this.datas = datas;
	     }

	     public Object getData() {
	         return data;
	     }

	     public void setData(Object data) {
	         this.data = data;
	     }

	     public List<?> getDatas() {
	         return datas;
	     }

	     public void setDatas(List<Object> datas) {
	         this.datas = datas;
	     }
	     
	     public Boolean getIsSuccess() {
	         return isSuccess;
	     }

	     public void setIsSuccess(Boolean isSuccess) {
	         this.isSuccess = isSuccess;
	     }

	     public boolean isHasError() {
	         return hasError;
	     }

	     public void setHasError(boolean hasError) {
	         this.hasError = hasError;
	     }

	     public boolean isHasDuplicate() {
	         return hasDuplicate;
	     }

	     public void setHasDuplicate(boolean hasDuplicate) {
	         this.hasDuplicate = hasDuplicate;
	     }


}
