import clients.GenerateOTP.GenerateOTPResponse;
import clients.GenerateOTP.GenerateOtpClients;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import retrofit2.Response;


public class GetOtpTest{
    Logger logger = LoggerFactory.getLogger(GetOtpTest.class);

    @Test
    @SneakyThrows
   public void getOtp() {

        GenerateOtpClients generateOtpClients =  new GenerateOtpClients();
        Response<GenerateOTPResponse>generateOTPResponseResponse = generateOtpClients.getOtp("6363360126","U2FsdGVkX1/K10bXSsDZI+l05XTwv2Hbo7+jbsk7AY******************************DnJPuwHUKOC5A==");
        logger.info(generateOTPResponseResponse.errorBody().string());
        logger.info("hello added webhook");
        Assert.assertEquals(generateOTPResponseResponse.code(),400);


    }
}
