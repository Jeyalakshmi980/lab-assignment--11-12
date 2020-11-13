/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_11_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class lab_11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Words count");
        wordcount obj=new wordcount();
        file1 f1=new file1(obj,args[0]);
        file2 f2=new file2(obj,args[1]);
        file3 f3=new file3(obj,args[2]);
        f1.start();
        f2.start();
        f3.start();
        
        
    }
    
}
class wordcount
{
    public void count(String filename) throws FileNotFoundException, IOException
    {
        File f=new File(filename);
        BufferedReader fd=new BufferedReader (new FileReader(f));
        String read;
        int count=0;
        while((read=fd.readLine())!=null)
        {
         int i;
         String str[]=read.split(" ");
         for(i=0;i<str.length;i++) {
                count++;
            }
        }
        System.out.println(f.getName()+":"+count+" words");
        fd.close();
    }
}
class file1 extends Thread
{
    wordcount w;
    String filename;
    public file1(wordcount w,String filename) {
        this.w = w;
        this.filename=filename;
    }
    public void run()
    {
        try
        {
            w.count(filename);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class file2 extends Thread
{
    wordcount w;
    String filename;
    public file2(wordcount w,String filename) {
        this.w = w;
        this.filename=filename;
    }
    public void run()
    {
        try
        {
            w.count(filename);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class file3 extends Thread
{
    wordcount w;
    String filename;
    public file3(wordcount w,String filename) {
        this.w = w;
        this.filename=filename;
    }
    public void run()
    {
        try
        {
            w.count(filename);
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
    
