package Files;

import lombok.Cleanup;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {

        File f3 = new File(System.getProperty("user.dir") + "//Sample_Logging");

        f3.mkdirs();

//        writeDataToTheFile(f3.getPath()+"//Sample.txt","This is a sample text file");
//        writeDataToTheFile(f3.getPath()+"//Sample.txt","This is a second line of data");
//        writeDataToTheFile(f3.getPath()+"//Sample.txt","This is a third line of data");

        readDataFromTheFile(f3.getPath() + "//Sample.txt");
    }

    public static void readDataFromTheFile(String filePath) throws IOException {
        //FileReader to read the data from the file
        FileReader fr = new FileReader(filePath);

        //fr.read():
        //Reads the file character by charcter
        //Returns the ASCII value of the character
        //Returns -1 if it reaches the end of the file

        int a=0;

//        while ((a = fr.read()) != -1) {
//
//            //Typecasting the ASCII value to character
//            System.out.print((char) a);
//        }

        for(int g=0;;)
        {
            a=fr.read();
            if(a==-1)
            {
                break;
            }
            System.out.print((char) a);
        }
    }


    public static void writeDataToTheFile(String filePath, String content) throws IOException {
        //FileWriter to write the data to the file

        //FileWriter will automatically create the file if it is not present
        //If the file is present then it will overwrite the data present in the file

        //FileWriter writes the data to the file character by character

        File f1 = new File(filePath);

        //@CleanUp is a lombok annotation which will automatically close the resources
        @Cleanup FileWriter fr = new FileWriter(f1, f1.exists());

        if (f1.exists()) {
            fr.write("\n");
        }

        fr.write(content);

//        if(f1.exists())
//        {
//            //If the file is present then it will append the data to the existing data
//            //We are setting the append flag to true
//            FileWriter fr = new FileWriter(filePath,true);
//
//            fr.write("\n");
//
//            fr.write(content);
//
//            fr.close(); //Closing the file writer object to avoid memory leak or deadlocks
//        }
//
//        else {
//            FileWriter fr = new FileWriter(filePath);
//
//            fr.write(content);
//
//            fr.close(); //Closing the file writer object to avoid memory leak or deadlocks
//        }
    }
}

