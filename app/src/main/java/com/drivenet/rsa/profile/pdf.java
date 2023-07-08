package com.drivenet.rsa.profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.pdf.PdfDocument;
import android.os.Environment;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

import com.drivenet.rsa.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class pdf
{
    public pdf()
    { }
private pdfstring pdfs = new pdfstring();
    public void generatePDF( Bitmap scaledbmp , int pageHeight , int pagewidth , Context context) {
        // creating an object variable
        // for our PDF document.
        PdfDocument pdfDocument = new PdfDocument();

        // two variables for paint "paint" is used
        // for drawing shapes and we will use "title"
        // for adding text in our PDF file.
        Paint paint = new Paint();
        Paint title = new Paint();

        // we are adding page info to our PDF file
        // in which we will be passing our pageWidth,
        // pageHeight and number of pages and after that
        // we are calling it to create our PDF.
        PdfDocument.PageInfo mypageInfo = new PdfDocument.PageInfo.Builder(pagewidth, pageHeight, 2).create();

        // below line is used for setting
        // start page for our PDF file.
        PdfDocument.Page myPage = pdfDocument.startPage(mypageInfo);

        // creating a variable for canvas
        // from our page of PDF.
        Canvas canvas = myPage.getCanvas();

        // below line is used to draw our image on our PDF file.
        // the first parameter of our drawbitmap method is
        // our bitmap
        // second parameter is position from left
        // third parameter is position from top and last
        // one is our variable for paint.
        canvas.drawBitmap(scaledbmp, 56, 40, paint);

        // below line is used for adding typeface for
        // our text which we will be adding in our PDF file.
        title.setTypeface(Typeface.create(Typeface.DEFAULT, Typeface.NORMAL));

        // below line is used for setting text size
        // which we will be displaying in our PDF file.
        title.setTextSize(15);

        // below line is sued for setting color
        // of our text inside our PDF file.
        title.setColor(ContextCompat.getColor(context, R.color.purple_200));

        // below line is used to draw text in our PDF file.
        // the first parameter is our text, second parameter
        // is position from start, third parameter is position from top
        // and then we are passing our variable of paint which is title.
        canvas.drawText("Vision", 209, 100, title);
        canvas.drawText("Profile", 209, 80, title);

        // similarly we are creating another text and in this
        // we are aligning this text to center of our PDF file.
        title.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
        title.setColor(ContextCompat.getColor(context, R.color.black));
        title.setTextSize(15);

        // below line is used for setting
        // our text to center of PDF.
        title.setTextAlign(Paint.Align.CENTER);
        /////////////////////////////////////////////////////////////////////////////////
        canvas.drawText(pdfs.generatePDF1(context), 396, 360, title);
      // canvas.drawText(pdfs.generatePDF2(context), 396, 340, title);
      // canvas.drawText(pdfs.generatePDF3(context), 396, 380, title);
      // canvas.drawText(pdfs.generatePDF4(context), 396, 400, title);
      // canvas.drawText(pdfs.generatePDF5(context), 396, 440, title);
      // canvas.drawText(pdfs.generatePDF6(context), 396, 480, title);
      // canvas.drawText(pdfs.generatePDF7(context), 396, 520, title);
      // canvas.drawText(pdfs.generatePDF8(context), 396, 560, title);
      // canvas.drawText(pdfs.generatePDF9(context), 396, 600, title);
      // canvas.drawText(pdfs.generatePDF10(context), 396, 640, title);
      // canvas.drawText(pdfs.generatePDF11(context), 396, 680, title);
      // canvas.drawText(pdfs.generatePDF12(context), 396, 720, title);
      // canvas.drawText(pdfs.generatePDF13(context), 396, 760, title);
      // canvas.drawText(pdfs.generatePDF14(context), 396, 560, title);
      // canvas.drawText(pdfs.generatePDF15(context), 396, 640, title);
      // canvas.drawText(pdfs.generatePDF16(context), 396, 680, title);
      // canvas.drawText(pdfs.generatePDF17(context), 396, 800, title);
      // canvas.drawText(pdfs.generatePDF18(context), 396, 840, title);
      // canvas.drawText(pdfs.generatePDF19(context), 396, 880, title);
      // canvas.drawText(pdfs.generatePDF20(context), 396, 920, title);
      // canvas.drawText(pdfs.generatePDF21(context), 396, 960, title);
      // canvas.drawText(pdfs.generatePDF22(context), 396, 1000, title);
      // canvas.drawText(pdfs.generatePDF23(context), 396, 1000, title);
        // after adding all attributes to our
        // PDF file we will be finishing our page.
        pdfDocument.finishPage(myPage);

        // below line is used to set the name of
        // our PDF file and its path.
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "vision1.pdf");

        try {
            // after creating a file name we will
            // write our PDF file to that location.
            pdfDocument.writeTo(new FileOutputStream(file));

            // below line is to print toast message
            // on completion of PDF generation.
            Toast.makeText(context, "PDF file generated successfully.", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            // below line is used
            // to handle error
            Toast.makeText(context, "PDF file generated failed"+e, Toast.LENGTH_SHORT).show();

            e.printStackTrace();
        }
        // after storing our pdf to that
        // location we are closing our PDF file.
        pdfDocument.close();
    }

}
