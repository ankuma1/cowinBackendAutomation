package clients.GenerateOTP;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface GenerateOTPService {

    @POST("/api/v2/auth/generateMobileOTP")
    Call<GenerateOTPResponse> getOtp(
            @Body GenerateOtpRequest generateOtpRequest
    );
}
