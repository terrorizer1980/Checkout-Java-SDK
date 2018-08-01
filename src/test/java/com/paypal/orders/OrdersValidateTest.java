package com.paypal.orders;

import com.braintreepayments.http.HttpResponse;
import com.braintreepayments.http.serializer.Json;
import com.paypal.Skeleton;

import java.io.IOException;

public class OrdersValidateTest extends Skeleton {
    private OrderActionRequest buildRequestBody() throws IOException {
        String json = "{\"payment_source\":{\"token\":{\"id\":\"6swCZZHu3aZv\",\"type\":\"6Ig1HDG2vpFE LqpMz\"},\"card\":{\"last_digits\":\"DgSrzx6PYafTS2K4Ozb\",\"name\":\"w1Fg1Z7gRH\",\"number\":\"VP30Mi9f6s\",\"security_code\":\"HATe3fUQgQ\",\"billing_address\":{\"admin_area_4\":\"4cQdr7zMetTRyat\",\"address_line_1\":\"75LQBsQvKV8awbJ\",\"admin_area_2\":\"x5QQXp15sCya\",\"admin_area_3\":\"RLbMx7fHWuR6PtrF6C1\",\"admin_area_1\":\"1GMNN2WaGuc7UdG\",\"country_code\":\"iAYOFMCC4DDJG7RNT\",\"postal_code\":\"pTXXLaJcgb 6UbC0WQd\",\"address_details\":{\"building_name\":\"A9Jix6Nc1 LFvdchLN\",\"delivery_service\":\"VfJyDDH3t8p9fIBudu\",\"street_name\":\"fPxXBAvUY5sAF\",\"street_number\":\"gIM2EEG9CuuvxaS2VO\",\"street_type\":\"rpW1QL9qPggqX\",\"sub_building\":\"h KAEs40qH\"},\"address_line_2\":\"G2OyRY2G9YVOfv8q0vv\",\"address_line_3\":\"Uwf8uhyKS85\"},\"card_type\":\"68dK9pQ6USHKdsu5h\",\"expiry\":\"tdZ4guKhFbYT\",\"id\":\"NuALFF1SItJ5hND1cH\"}}}";
        return new Json().decode(json, OrderActionRequest.class);
    }

    public void testOrdersValidateRequest() throws IOException {
        OrdersValidateRequest request = new OrdersValidateRequest("OPcOx64Wb5zsdC2T")
            .payPalClientMetadataId("8Dg1IKHAvNB");
        request.requestBody(buildRequestBody());

        HttpResponse<Order> response = client().execute(request);

        // Add your own checks here
    }
}
