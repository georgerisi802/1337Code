package webCrawler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * Singlethreaded version
 */

public class Solution {
	public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        HashSet<String> result = new HashSet<>();
        Queue<String> crawlQ = new LinkedList<>();
        
        crawlQ.add(startUrl);
        String startHost = getHost(startUrl);
        
        String cur;
        while(!crawlQ.isEmpty()){
            System.out.println("Result: " + result);
            System.out.println("Crawl Queue: " + crawlQ);
            cur = crawlQ.remove();
            if(!result.contains(cur) && getHost(cur).equals(startHost)) {
                result.add(cur);
                System.out.println(cur + " not in result, adding.");
                crawlQ.addAll(htmlParser.getUrls(cur)); 
            }
            else System.out.println(cur + " already in result");
        }
        
        List<String> fin = new LinkedList<>();
        fin.addAll(result);
        System.out.println("Final result is: " + fin);
        return fin;
    }
    
    String getHost(String addr){
        String[] arr = addr.split("/");
        System.out.println("Host is " + Arrays.toString(arr));
        return arr[2];
    }
}
