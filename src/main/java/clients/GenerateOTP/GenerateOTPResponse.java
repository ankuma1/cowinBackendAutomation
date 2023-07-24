package clients.GenerateOTP;

import lombok.Builder;
import lombok.Setter;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Builder
@Setter
public class GenerateOTPResponse {
    public String txnId;
    public String errorCode;
    public String error;
}
