package com.example.web.service;

import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

class HeaderFooterHandler extends PdfPageEventHelper {

    private static final String HEADER_IMAGE_PATH = "C:\\Users\\Somil\\Desktop\\RBL Bank\\header.jpg";
    private static final String FOOTER_IMAGE_PATH = "C:\\Users\\Somil\\Desktop\\RBL Bank\\footer.jpg";
   
    @Override
    public void onEndPage(PdfWriter writer, Document document) {
        try {
            // Add header image
            Image header = Image.getInstance(HEADER_IMAGE_PATH);
            
            header.scaleAbsoluteWidth(document.getPageSize().getWidth());
    		header.scaleAbsoluteHeight(document.getPageSize().getHeight() * 0.1f - 43);       // Adjust the height as desired
    		header.setAbsolutePosition(0, document.getPageSize().getHeight() - header.getScaledHeight());
            
            document.add(header);

            // Add footer image
            Image footer = Image.getInstance(FOOTER_IMAGE_PATH);
      
            footer.scaleAbsoluteWidth(document.getPageSize().getWidth());
    		footer.scaleAbsoluteHeight(document.getPageSize().getHeight() * 0.1f - 43);       // Adjust the height as desired
    		footer.setAbsolutePosition(document.getPageSize().getWidth() - footer.getScaledWidth(),20);
            
            document.add(footer);
            
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
