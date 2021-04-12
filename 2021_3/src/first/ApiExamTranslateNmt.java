package first;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

// ���̹� ������ (Papago SMT) API ����
public class ApiExamTranslateNmt {
	 String responseBody;
	 String hey;
    public static void main(String[] args) {
       
    }
    public String go() {
    	 String clientId = "dSxq7JARAm_gvGuINIPl";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
         String clientSecret = "_mPJrcnp2y";//���ø����̼� Ŭ���̾�Ʈ ��ũ����";

         String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
         String text;
         try {
             text = URLEncoder.encode(hey, "UTF-8");
         } catch (UnsupportedEncodingException e) {
             throw new RuntimeException("���ڵ� ����", e);
         }

         Map<String, String> requestHeaders = new HashMap<>();
         requestHeaders.put("X-Naver-Client-Id", clientId);
         requestHeaders.put("X-Naver-Client-Secret", clientSecret);

         String responseBody = post(apiURL, requestHeaders, text);
         return responseBody;
        // System.out.println(responseBody);
    }

    public static String post(String apiUrl, Map<String, String> requestHeaders, String text){
        HttpURLConnection con = connect(apiUrl);
        String postParams = "source=ko&target=en&text=" + text; //�������: �ѱ��� (ko) -> �������: ���� (en)
        try {
            con.setRequestMethod("POST");
            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
                con.setRequestProperty(header.getKey(), header.getValue());
            }

            con.setDoOutput(true);
            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.write(postParams.getBytes());
                wr.flush();
            }

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) { // ���� ����
                return readBody(con.getInputStream());
            } else {  // ���� ����
                return readBody(con.getErrorStream());
            }
        } catch (IOException e) {
            throw new RuntimeException("API ��û�� ���� ����", e);
        } finally {
            con.disconnect();
        }
    }

    public static HttpURLConnection connect(String apiUrl){
        try {
            URL url = new URL(apiUrl);
           return (HttpURLConnection)url.openConnection();
        } catch (MalformedURLException e) {
            throw new RuntimeException("API URL�� �߸��Ǿ����ϴ�. : " + apiUrl, e);
        } catch (IOException e) {
            throw new RuntimeException("������ �����߽��ϴ�. : " + apiUrl, e);
        }
    }

    public static String readBody(InputStream body){
        InputStreamReader streamReader = new InputStreamReader(body);

        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
            StringBuilder responseBody = new StringBuilder();

            String line;
            while ((line = lineReader.readLine()) != null) {
                responseBody.append(line);
            }

            return responseBody.toString();
        } catch (IOException e) {
            throw new RuntimeException("API ������ �дµ� �����߽��ϴ�.", e);
        }
    }
}