import java.io.*;
import java.util.*;
import java.net.*;
import javax.net.ssl.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class GoogleQuery{

	public int searchNum = 20;
	public String searchKeyword, url, content, title, results;
	public static String citeUrl;	
	public static KeywordList kLst;
	public PriorityQueue<WebNode> heap;
	public long startingTime;


	public GoogleQuery(String searchKeyword) throws UnsupportedEncodingException{
		
		//this.searchNum = searchNum;
		this.startingTime = System.currentTimeMillis();
		kLst = new KeywordList();
		String encodedKeyword = java.net.URLEncoder.encode(searchKeyword,"utf-8");
		this.searchKeyword = encodedKeyword;
		this.url = "http://www.google.com/search?q=" + this.searchKeyword + "3C&oe=utf8&num=50";

	}
	
	
	private String fetchContent() throws IOException{
		
		String retVal = "";
		String line = null;
		URL u = new URL(url);
		URLConnection conn = u.openConnection();
		conn.setRequestProperty("User-agent", "Chrome/7.0.517.44");
		InputStream in = conn.getInputStream();
		InputStreamReader inReader = new InputStreamReader(in, "utf-8");
		BufferedReader bf = new BufferedReader(inReader);
		
		while ((line = bf.readLine()) != null) {
			retVal = retVal + line;
		}
		return retVal;
	}

	public HashMap<String, String> query() throws IOException,MalformedURLException,FileNotFoundException {

		if (content == null){
			content = fetchContent();
		}

		HashMap<String, String> retVal = new HashMap<String, String>();
		Document doc = Jsoup.parse(content);
		Elements lis = doc.select("div");
		lis = lis.select(".kCrYT");
		
		for (Element li : lis) {
			try{
				citeUrl = li.select("a").get(0).attr("href").substring(7);
				title = li.select("a").get(0).select(".vvjwJb").text();
				//citeUrl = li.select("a").get(0).attr("href").substring();
				if (title.equals("")) {
					continue;
				}
				WebPage rootPage = new WebPage(citeUrl,title);		
				WebTree tree = new WebTree(rootPage);
				
				ArrayList<Keyword> lst = new ArrayList<Keyword>();
				String s1 = new String("手機".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s1, 20.0));
				String s2 = new String("筆電".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s2, 20.0));
				String s3 = new String("桌上型電腦".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s3, 20.0));
				String s4 = new String("智慧手錶".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s4, 20.0));
				String s401 = new String("平板電腦".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s401, 20.0));
				String s402 = new String("耳機".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s402, 20.0));
				String s501 = new String("Apple".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s501, 10.0));
				String s502 = new String("Asus".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s502, 10.0));
				String s503 = new String("小米".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s503, 10.0));
				String s5 = new String("Samsung".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s5, 10.0));
				String s6 = new String("Acer".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s6, 10.0));
				String s7 = new String("Oppo".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s7, 10.0));
				String s8 = new String("Sony".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s8, 10.0));
				String s9 = new String("iphone".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s9, 8.0));
				String s10 = new String("Macbook".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s10, 8.0));
				String s11 = new String("iPad".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s11, 8.0));
				String s12 = new String("Airpods".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s12, 8.0));
				String s13 = new String("Zenphone".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s13, 8.0));
				String s14 = new String("Zenbook".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s14, 8.0));
				String s15 = new String("Vivobook".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s15, 8.0));
				String s16 = new String("Note".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s16, 8.0));
				String s17 = new String("Galaxy".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s17, 8.0));
				String s18 = new String("Aspire".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s18, 8.0));	
				String s19 = new String("Swift".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s19, 8.0));
					
				String s20 = new String("Reno".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s20, 8.0));
				String s201 = new String("Xperia".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s201, 8.0));
				String s202 = new String("使用說明書".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s202, 4.0));
				String s21 = new String("型號".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s21, 4.0));
				String s22 = new String("規格".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s22, 4.0));
				String s23 = new String("尺寸".getBytes("GBK"),"UTF-8");
				lst.add(new Keyword(s23, 4.0));
				
					
					
					
				tree.setPostOrderScore(lst);
				tree.eularPrintTree();	
					
				kLst.getList().add(WebTree.result);
					
				
				
				System.out.println(citeUrl);
				System.out.println("-----------------------------");

				// System.out.println("    Text length: " + node.webPage.wordCounter.content.length());

				// System.out.println("    Score: " + node.nodeScore);
			
			} catch (Exception e) {
				 System.out.println("Skip: " + e.getMessage());
				 continue;
			} 
			}
		
		kLst.sort();
		Collections.reverse(kLst.lst);
		kLst.show();
		
		for(Result result:kLst.lst) {
			retVal.put(result.name, result.url);

		}
		
		return retVal;
	}

	
	static {
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname,SSLSession session) {
				return true;
			}
		}
		
				);
	}
	 
	 
	 public ArrayList<String> hyper() throws IOException{
			if(content==null){
				content= fetchContent();
			}
			Document doc = Jsoup.parse(content);
			Elements lis = doc.select("a");
			ArrayList<String>list = new ArrayList<String>();
			for(Element li : lis) {
				String url = li.attr("href");
				list.add(url);	
			}
			return list;
			
	 }
	 public static String encodeURL(String url) {
			try {
				String encodeURL = URLEncoder.encode(url, "UTF-8");
				return encodeURL;
			} catch (UnsupportedEncodingException e) {
				return "Error: " + e.getMessage();
			}
		}
	 
	 
}
	
	

	
