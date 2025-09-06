package in.shrutisinha.billingsoftware.service;

import com.razorpay.RazorpayException;
import in.shrutisinha.billingsoftware.io.RazorpayOrderResponse;

public interface RazorpayService {

    RazorpayOrderResponse createOrder(Double amount, String currency) throws RazorpayException;
}
