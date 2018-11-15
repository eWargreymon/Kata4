package main;

import java.io.IOException;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

public class main {

    public static void main(String args[]) throws IOException{
        
        main maincontrol = new main();
        maincontrol.control();
    }
    
    private void control() throws IOException{
        input();
        process();
        output();
    }
    
    private String filename;
    private Histogram<String> histogram;
    private void input() {
        filename = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata4\\email.txt";
    }

    private void process() throws IOException {
        List<Mail> mailList = MailListReader.read(filename);
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
