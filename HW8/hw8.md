# HW8 - Use Google and get the links!

開發出你的搜尋引擎，本次作業僅需各位先嘗試連接到google seach engine後，將內容回傳至你自己的頁面，如下圖。

![alt text](<2.png>)
![alt text](<1.png>)

請繳交隨意字詞搜尋結果的截圖以及程式碼的公開github連結。

---

提示：
1. 可使用 HW4 bonus 作為基礎來改寫功能。

2. call Google 需使用官方提供的 api（每日可免費使用100次），並於`src/main/resources/application.properties` 設定：
    - google.cse.enabled=true
    - google.cse.apiKey=你的API金鑰
    - google.cse.cx=你的搜尋引擎ID

    (可參考連結：https://ithelp.ithome.com.tw/articles/10223751)

3. （供參）Query
```java
 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStream;
 import java.io.InputStreamReader;
 import java.net.URL;
 import java.net.URLConnection;
 import java.util.HashMap;

 import org.jsoup.Jsoup;
 import org.jsoup.nodes.Document;
 import org.jsoup.nodes.Element;
 import org.jsoup.select.Elements;

 public class GoogleQuery 
 {
     public String searchKeyword;
     public String url;
     public String content;

     public GoogleQuery(String searchKeyword)
     {
         this.searchKeyword = searchKeyword;
         try 
         {
             // This part has been specially handled for Chinese keyword processing. 
             // You can comment out the following two lines 
             // and use the line of code in the lower section. 
             // Also, consider why the results might be incorrect 
             // when entering Chinese keywords.
             String encodeKeyword=java.net.URLEncoder.encode(searchKeyword,"utf-8");
             this.url = "https://www.google.com/search?q="+encodeKeyword+"&oe=utf8&num=20";

             // this.url = "https://www.google.com/search?q="+searchKeyword+"&oe=utf8&num=20";
         }
         catch (Exception e)
         {
             System.out.println(e.getMessage());
         }
     }

     private String fetchContent() throws IOException
     {
         String retVal = "";

         URL u = new URL(url);
         URLConnection conn = u.openConnection();
         //set HTTP header
         conn.setRequestProperty("User-agent", "Chrome/107.0.5304.107");
         InputStream in = conn.getInputStream();

         InputStreamReader inReader = new InputStreamReader(in, "utf-8");
         BufferedReader bufReader = new BufferedReader(inReader);
         String line = null;

         while((line = bufReader.readLine()) != null)
         {
             retVal += line;
         }
         return retVal;
     }

     public HashMap<String, String> query() throws IOException
     {
         if(content == null)
         {
             content = fetchContent();
         }

         HashMap<String, String> retVal = new HashMap<String, String>();

         /* 
          * some Jsoup source
          * https://jsoup.org/apidocs/org/jsoup/nodes/package-summary.html
          * https://www.1ju.org/jsoup/jsoup-quick-start
          */

         //using Jsoup analyze html string
         Document doc = Jsoup.parse(content);

         //select particular element(tag) which you want 
         Elements lis = doc.select("div");
         lis = lis.select(".kCrYT");

         for(Element li : lis)
         {
             try 
             {
                 String citeUrl = li.select("a").get(0).attr("href").replace("/url?q=", "");
                 String title = li.select("a").get(0).select(".vvjwJb").text();

                 if(title.equals("")) 
                 {
                     continue;
                 }

                 System.out.println("Title: " + title + " , url: " + citeUrl);

                 //put title and pair into HashMap
                 retVal.put(title, citeUrl);

             } catch (IndexOutOfBoundsException e) 
             {
 //				e.printStackTrace();
             }
         }

         return retVal;
     }
 }

```

4. （供參）CSE 處理
```java
String q = URLEncoder.encode(query, StandardCharsets.UTF_8.name());
    String url = "https://www.googleapis.com/customsearch/v1?key=" + apiKey + "&cx=" + cx + "&num=10&q=" + q;
    ResponseEntity<Map<String, Object>> resp = restTemplate.getForEntity(url, (Class<Map<String, Object>>) (Class<?>) Map.class);
    Map<String, Object> body = resp.getBody();
    if (body == null) {
        return results;
    }
    Object itemsObj = body.get("items");
    if (itemsObj instanceof List) {
        List<?> items = (List<?>) itemsObj;
        for (Object itemObj : items) {
            if (itemObj instanceof Map) {
                Map<String, Object> item = (Map<String, Object>) itemObj;
                Object titleObj = item.get("title");
                Object linkObj = item.get("link");
                String title = titleObj == null ? null : titleObj.toString();
                String link = linkObj == null ? null : linkObj.toString();
                if (title != null && !title.isEmpty() && link != null && !link.isEmpty()) {
                    results.put(title, link);
                }
            }
        }
    }
```
5. SpringBoot  [詳細教學](https://kucw.io/blog/springboot/1/)
---

## Submission
- **Deadline:** 11/11 (Tues.) 00:00  
- Upload screenshot and github link via **Moodle**.
- Just one copy per group.
