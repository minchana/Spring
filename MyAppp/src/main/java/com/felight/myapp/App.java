package com.felight.myapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hi Minchana" );
        
        XWPFDocument docx = null;
		try {
			docx = new XWPFDocument(new FileInputStream("/Users/minchanaharish/Documents/felight/j2ee/Maven/myfile.docx"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        XWPFWordExtractor we = new XWPFWordExtractor(docx);
        System.out.println( we.getText() );
        
    }
}
