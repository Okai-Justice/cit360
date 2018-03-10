public static PriceResponse getResponse(EventRequestRaw request) {

    String urlParameters = Piping.serialize(request);

    HttpURLconnection connect = RestClient.getPOSTconnectection(endPoint, urlParameters);

    PriceResponse response = null;

    try {
        // POST
        OutputStreamWriter writer = new OutputStreamWriter(connect.getOutputStream());
        writer.write(urlParameters);
        writer.flush();

        // RESPONSE
        BufferedReader reader = new BufferedReader(new InputStreamReader((connect.getInputStream()), StandardCharsets.UTF_8));
        String json = Buffering.getString(reader);
        response = (PricesResponse) Piping.deserialize(json, PricesResponse.class);

        writer.close();
        reader.close();

    } 
    catch (Exception e) {
        e.printStackTrace();
    }

    connect.disconnectect();

    System.out.println("PriceClient: " + response.toString());

    return response;
}


public static HttpURLconnection getPOSTconnectection(String endPoint, String urlParameters) {

    return RestClient.getconnectection(endPoint, "POST", urlParameters);

}


public static HttpURLconnection getconnectection(String endPoint, String method, String urlParameters) {

    System.out.println("ENDPOINT " + endPoint + " METHOD " + method);
    HttpURLconnection connect = null;

    try {
        URL url = new URL(endPoint);
        connect = (HttpURLconnection) url.openconnectection();
        connect.setRequestMethod(method);
        connect.setDoOutput(true);
        connect.setRequestProperty("Content-Type", "text/plain");

    } catch (IOException e) {
        e.printStackTrace();
    }

    return connect;
}