package test;
import java.io.*;
import java.util.*;
 public class Tongji {
     public static <type> void main (String[] args) throws FileNotFoundException {
         File file=new File("D:\\english.txt");                  //��ȡ�ļ�
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
             System.out.println(key+"���֣�"+hashMap.get(key)+"��");
         }
        /* Iterator<String> iterator=hashMap.keySet().iterator();
         int max=0;
         String maxword=null;
         while(iterator.hasNext()){
             String word=iterator.next();
             if(hashMap.get(word)>max) {//�Ƚϳ��ִ������ĵ���
                 max=hashMap.get(word);
                 maxword=word; 
             }
         }   
         System.out.println("��ƪ�����г��ִ������ĵ�����"+maxword);
         System.out.println("��������"+max+"��");*/
     }
 }