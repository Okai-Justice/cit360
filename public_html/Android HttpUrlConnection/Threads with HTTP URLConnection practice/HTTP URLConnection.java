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
}public static String GetSource(String url){
String results = "";
try{
  URL SourceCode = new URL(url);
  URLConnection connect = SourceCode.openConnection();
  connect.setRequestProperty("Host", "www.someserver.com");
  connect.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 5.1; rv:11.0) Gecko/20100101 Firefox/11.0");
  connect.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
  connect.setRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
  connect.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
  connect.setRequestProperty("Keep-Alive", "115");
  connect.setRequestProperty("Connection", "keep-alive");
  BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream(), "UTF-8"));
  String inputLine;
  while ((inputLine = in.readLine()) != null){
    results += inputLine;
  }
  return results;
}catch(Exception e){
}
return results;
}