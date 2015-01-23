package com.eric.jimiopen.common.utils.dbutils;  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Vector;

import org.apache.commons.lang3.StringUtils;
    
/** 
* @ClassName: HttpRequestUtils 
* @Description: http����
* @author �ź��� 
* date 2012-12-24  
*/
public class HttpRequestUtils {  
    /** 
    * @Fields defaultContentEncoding : Ĭ�ϱ��� 
    */ 
    private static String defaultContentEncoding = Charset.defaultCharset().name();  

    /** 
     * ����GET���� 
     *  
     * @param urlString 
     *            URL��ַ 
     * @return ��Ӧ���� 
     * @throws IOException 
     */  
    public static HttpRespons sendGet(String urlString, String contentEncoding) throws IOException {  
        return send(urlString, "GET", null, null, contentEncoding);  
    }  
   
    /** 
     * ����GET���� 
     *  
     * @param urlString 
     *            URL��ַ 
     * @param params 
     *            ����� 
     * @return ��Ӧ���� 
     * @throws IOException 
     */  
    public HttpRespons sendGet(String urlString, Map<String, String> params, String contentEncoding)  
            throws IOException {  
        return send(urlString, "GET", params, null, contentEncoding);  
    }  
   
    /** 
     * ����GET���� 
     *  
     * @param urlString 
     *            URL��ַ 
     * @param params 
     *            ����� 
     * @param propertys 
     *            �������� 
     * @return ��Ӧ���� 
     * @throws IOException 
     */  
    public HttpRespons sendGet(String urlString, Map<String, String> params,  
            Map<String, String> propertys, String contentEncoding) throws IOException {  
        return send(urlString, "GET", params, propertys, contentEncoding);  
    }  
   
    /** 
     * ����POST���� 
     *  
     * @param urlString 
     *            URL��ַ 
     * @return ��Ӧ���� 
     * @throws IOException 
     */  
    public HttpRespons sendPost(String urlString, String contentEncoding) throws IOException {  
        return send(urlString, "POST", null, null, contentEncoding);  
    }  
   
    /** 
     * ����POST���� 
     *  
     * @param urlString 
     *            URL��ַ 
     * @param params 
     *            ����� 
     * @return ��Ӧ���� 
     * @throws IOException 
     */  
    public HttpRespons sendPost(String urlString, Map<String, String> params, String contentEncoding)  
            throws IOException {  
        return send(urlString, "POST", params, null, contentEncoding);  
    }  
   
    /** 
     * ����POST���� 
     *  
     * @param urlString 
     *            URL��ַ 
     * @param params 
     *            ����� 
     * @param propertys 
     *            �������� 
     * @return ��Ӧ���� 
     * @throws IOException 
     */  
    public HttpRespons sendPost(String urlString, Map<String, String> params,  
            Map<String, String> propertys, String contentEncoding) throws IOException {  
        return send(urlString, "POST", params, propertys, contentEncoding);  
    }  
   
    /** 
     * ����HTTP���� 
     *  
     * @param urlString 
     * @return ��ӳ���� 
     * @throws IOException 
     */  
    private static  HttpRespons send(String urlString, String method,  
            Map<String, String> parameters, Map<String, String> propertys, String contentEncoding)  
            throws IOException {  
        HttpURLConnection urlConnection = null;  
   
        if (method.equalsIgnoreCase("GET") && parameters != null) {  
            StringBuffer param = new StringBuffer();  
            int i = 0;  
            for (String key : parameters.keySet()) {  
                if (i == 0)  
                    param.append("?");  
                else  
                    param.append("&");  
                param.append(key).append("=").append(parameters.get(key));  
                i++;  
            }  
            urlString += param;  
        }  
        URL url = new URL(urlString);  
        urlConnection = (HttpURLConnection) url.openConnection();  
   
        urlConnection.setRequestMethod(method);  
        urlConnection.setDoOutput(true);  
        urlConnection.setDoInput(true);  
        urlConnection.setUseCaches(false);  
   
        if (propertys != null)  
            for (String key : propertys.keySet()) {  
                urlConnection.addRequestProperty(key, propertys.get(key));  
            }  
   
        if (method.equalsIgnoreCase("POST") && parameters != null) {  
            StringBuffer param = new StringBuffer();  
            for (String key : parameters.keySet()) {  
                param.append("&");  
                param.append(key).append("=").append(parameters.get(key));  
            }  
            urlConnection.getOutputStream().write(param.toString().getBytes());  
            urlConnection.getOutputStream().flush();  
            urlConnection.getOutputStream().close();  
        }  
   
        return makeContent(urlString, urlConnection, contentEncoding);  
    }  
   
    /** 
     * �õ���Ӧ���� 
     *  
     * @param urlConnection 
     * @return ��Ӧ���� 
     * @throws IOException 
     */  
    private static  HttpRespons makeContent(String urlString,  
            HttpURLConnection urlConnection, String contentEncoding) throws IOException {  
        HttpRespons httpResponser = new HttpRespons();  
        try {  
            InputStream in = urlConnection.getInputStream();  
            BufferedReader bufferedReader = new BufferedReader(  
                    new InputStreamReader(in));  
            httpResponser.contentCollection = new Vector<String>();  
            StringBuffer temp = new StringBuffer();  
            String line = bufferedReader.readLine();  
            while (line != null) {  
                httpResponser.contentCollection.add(line);  
                temp.append(line).append("\r\n");  
                line = bufferedReader.readLine();  
            }  
            bufferedReader.close();  
   
            String ecod = urlConnection.getContentEncoding();  
            if (ecod == null) {
            	if(StringUtils.isNotBlank(contentEncoding)){
            		 ecod = contentEncoding;  
            	}else{
            		 ecod = defaultContentEncoding;  
            	}
            } 
               
   
            httpResponser.urlString = urlString;  
   
            httpResponser.defaultPort = urlConnection.getURL().getDefaultPort();  
            httpResponser.file = urlConnection.getURL().getFile();  
            httpResponser.host = urlConnection.getURL().getHost();  
            httpResponser.path = urlConnection.getURL().getPath();  
            httpResponser.port = urlConnection.getURL().getPort();  
            httpResponser.protocol = urlConnection.getURL().getProtocol();  
            httpResponser.query = urlConnection.getURL().getQuery();  
            httpResponser.ref = urlConnection.getURL().getRef();  
            httpResponser.userInfo = urlConnection.getURL().getUserInfo();  
   
            httpResponser.content = new String(temp.toString().getBytes(), ecod);  
            httpResponser.contentEncoding = ecod;  
            httpResponser.code = urlConnection.getResponseCode();  
            httpResponser.message = urlConnection.getResponseMessage();  
            httpResponser.contentType = urlConnection.getContentType();  
            httpResponser.method = urlConnection.getRequestMethod();  
            httpResponser.connectTimeout = urlConnection.getConnectTimeout();  
            httpResponser.readTimeout = urlConnection.getReadTimeout();  
   
            return httpResponser;  
        } catch (IOException e) {  
            throw e;  
        } finally {  
            if (urlConnection != null)  
                urlConnection.disconnect();  
        }  
    }  
   
} 