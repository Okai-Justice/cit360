public static PriceResponse getResponse(EventRequestRaw request) {

    String urlParameters = Piping.serialize(request);

    HttpURLConnection conn = RestClient.getPOSTConnection(endPoint, urlParameters);

    PriceResponse response = null;

    try {
        // POST
        OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
        writer.write(urlParameters);
        writer.flush();

        // RESPONSE
        BufferedReader reader = new BufferedReader(new InputStreamReader((conn.getInputStream()), StandardCharsets.UTF_8));
        String json = Buffering.getString(reader);
        response = (PricesResponse) Piping.deserialize(json, PricesResponse.class);

        writer.close();
        reader.close();

    } 
    catch (Exception e) {
        e.printStackTrace();
    }

    conn.disconnect();

    System.out.println("PriceClient: " + response.toString());

    return response;
}


public static HttpURLConnection getPOSTConnection(String endPoint, String urlParameters) {

    return RestClient.getConnection(endPoint, "POST", urlParameters);

}


public static HttpURLConnection getConnection(String endPoint, String method, String urlParameters) {

    System.out.println("ENDPOINT " + endPoint + " METHOD " + method);
    HttpURLConnection conn = null;

    try {
        URL url = new URL(endPoint);
        conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(method);
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Type", "text/plain");

    } catch (IOException e) {
        e.printStackTrace();
    }

    return conn;
}