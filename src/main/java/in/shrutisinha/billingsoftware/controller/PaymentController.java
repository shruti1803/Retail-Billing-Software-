package in.shrutisinha.billingsoftware.controller;

import com.razorpay.RazorpayException;
import in.shrutisinha.billingsoftware.io.OrderResponse;
import in.shrutisinha.billingsoftware.io.PaymentRequest;
import in.shrutisinha.billingsoftware.io.PaymentVerificationRequest;
import in.shrutisinha.billingsoftware.io.RazorpayOrderResponse;
import in.shrutisinha.billingsoftware.service.OrderService;
import in.shrutisinha.billingsoftware.service.RazorpayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final RazorpayService razorpayService;
    private final OrderService orderService;

    @PostMapping("/create-order")
    @ResponseStatus(HttpStatus.CREATED)
    public RazorpayOrderResponse createRazorpayOrder(@RequestBody PaymentRequest request) throws RazorpayException {
        return razorpayService.createOrder(request.getAmount(), request.getCurrency());
    }

    @PostMapping("/verify")
    public OrderResponse verifyPayment(@RequestBody PaymentVerificationRequest request) {
        return orderService.verifyPayment(request);
    }
}

