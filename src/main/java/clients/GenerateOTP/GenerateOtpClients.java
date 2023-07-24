package clients.GenerateOTP;

import io.qameta.allure.Step;
import lombok.SneakyThrows;
import utils.retrofit.APITest;
import retrofit2.Call;
import retrofit2.Response;

import java.io.FileNotFoundException;

public class GenerateOtpClients extends APITest {

    private static GenerateOTPService service;

    public GenerateOtpClients() throws FileNotFoundException {
        super("cowin");
        service = httpCall.services(GenerateOTPService.class);

    }

    @Step("API to get COWIN OTP")
    @SneakyThrows
    public Response<GenerateOTPResponse> getOtp(String mobileNumber, String token) {
        GenerateOtpRequest request = GenerateOtpRequest.builder().mobile(mobileNumber).secret(token).build();
        Call<GenerateOTPResponse> calls = service.getOtp(request);
        Response<GenerateOTPResponse> generateOTPResponse = calls.execute();
        return generateOTPResponse;
    }


}
