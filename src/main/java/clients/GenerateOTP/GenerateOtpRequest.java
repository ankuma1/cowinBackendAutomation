package clients.GenerateOTP;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Setter;

@Builder
@Setter
public class GenerateOtpRequest {

    public String mobile;
    public String secret;
}

