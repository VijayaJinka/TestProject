package Files;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class FileConcepts {
    public static void main(String[] args) throws IOException {

        //Prints the current working directory
        System.out.println(System.getProperty("user.dir"));

        //Always remember that passing the file path may be a valid or a invalid one
        //Java does not understand unless and until we perform some operations

        File f1=new File(System.getProperty("user.dir")+"//Logs");

        //Checks if the file path exists or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(f1.exists());

        //Checks if we can read the data from the particular file path
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(f1.canRead());

        f1.mkdirs(); //Creates the missing directories

        //Checks if we can write the data to the particular file path
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(f1.canWrite());

        //Gets the file path stored in the file object
        System.out.println(f1.getPath());

        //Checks if the given file path is a directory or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(f1.isDirectory());

        //Checks if the given file path is hidden or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(f1.isHidden());

        File f2=new File(f1.getPath()+"//Logs.txt");

        //Creates a file in the given path if it is not present
        // else it ignores the file creation process
        f2.createNewFile();

        //Prints the size of the file in the form of bytes
        System.out.println(f2.length());

        //Prints the size of the file in the form of KB
        System.out.println(f2.length()/1024);

        //Prints the size of the file in the form of MB
        System.out.println(f2.length()/(1024*1024));

        //Prints the size of the file in the form of GB
        System.out.println(f2.length()/(1024*1024*1024));

        //Setting the file to read only
        f2.setReadOnly();

        System.out.println(f2.canWrite());

        //Setting the file to write only mode
        f2.setWritable(true);

        System.out.println(f2.canWrite());

        File f3=new File(f1.getPath()+"//Logs_New.txt");

        //Renaming the file only when it is not present
        f2.renameTo(f3);

        System.out.println(f2.exists());
        System.out.println(f3.exists());

        //Gets the parent path of the given file object
        System.out.println(f3.getParent());

        //Deletes the file once the execution is completed
        f3.deleteOnExit();

        //Prints the last modified date and time in nano seconds
        System.out.println(f3.lastModified());

        System.out.println(getDateTimeFormat("dd-MM-yyyy HH-mm-ss.SSS zzz",f3.lastModified()));

        //Checks if the given file object is a file or not
        //Returns true if the above condition is satisfied else it returns false
        System.out.println(f3.isFile());

        //Checks the total space that is present in the curent drive
        System.out.println(f3.getTotalSpace()/(1024*1024*1024));

        //Checks the free space that is present in the current drive
        System.out.println(f3.getUsableSpace()/(1024*1024*1024));

        f1.delete(); //Deletes the file or folder on the spot

        File f4=new File(System.getProperty("user.dir"));

        //Storing it in the file object array to have the list of files present in the given directory
        File[] listOfFiles=f4.listFiles();

        System.out.println("******************");

        //Prints the names of the files present in the given directory
        Arrays.stream(listOfFiles).forEach(file -> System.out.println(file.getName()));

    }

    //hh -> 12 hours format
    //HH -> 24 hours format

    //Pass a time zone  - Use zzz
    //Day of the week - EEEE

    //AM or PM - a (Used when we are passing the time in 12 hour format)

    //MM - Month Like 01, 02, 03 etc...
    //MMM - MOnth like Jan, Feb, Mar etc...
    //MMMM - Month like January, February, March etc...

    //date format - DD-MM-yyyy , dd-MM-yyyy hh-mm-ss, dd-MM-yyyy HH-mm-ss.SSS
    public static String getDateTimeFormat(String format,long time)
    {
        //SimpleDateFormat is a class which is used to format the date and time
        //Helps us in converting the date and time into the required format
        SimpleDateFormat dateFormat=new SimpleDateFormat(format);

        //Date Library helps us in converting the time in nano seconds to a date format
        Date d1=new Date(time);

        System.out.println(d1);

        //Formats the date and time into the required format
        return dateFormat.format(d1);
    }
}

