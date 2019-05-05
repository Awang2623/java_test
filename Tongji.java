package test;
import java.io.*;
import java.util.*;
 public class Tongji {
     public static <type> void main (String[] args) throws FileNotFoundException {
         File file=new File("D:\\english.txt");                  //读取文件
         Scanner input=new Scanner(file);
         HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
         while(input.hasNextLine()) {
             String line=input.nextLine();
             String[] lineWords=line.split("\\W+");          
             Set<String> wordSet=hashMap.keySet();
             for(int i=0;i<lineWords.length;i++) {
                 if(wordSet.contains(lineWords[i])) {
                     Integer number=hashMap.get(lineWords[i]);
                     number++;
                     hashMap.put(lineWords[i], number);  
                     }
                 else {
                     hashMap.put(lineWords[i], 1);
                 }
             }
         }
         for (String key : hashMap.keySet()) {
             System.out.println(key+"出现："+hashMap.get(key)+"次");
         }
        /* Iterator<String> iterator=hashMap.keySet().iterator();
         int max=0;
         String maxword=null;
         while(iterator.hasNext()){
             String word=iterator.next();
             if(hashMap.get(word)>max) {//比较出现次数最多的单词
                 max=hashMap.get(word);
                 maxword=word; 
             }
         }   
         System.out.println("本篇文章中出现次数最多的单词是"+maxword);
         System.out.println("共出现了"+max+"次");*/
     }
 }