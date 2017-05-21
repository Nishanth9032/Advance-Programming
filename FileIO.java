import java.io.File;
import java.util.*;
import java.lang.*;
/*
 *nishanth mantri 
 * s3598347
 */


public class FileIO {
    private Scanner read;
    void openFile(){
        try{
            read = new Scanner(new File("Participants.txt"));
        }
        catch(Exception e){
            System.out.println("Could not find file");
        }
    }

    public void readFile() {
        System.out.printf("Refrees and Participants available are:\n");
        while (read.hasNext()) {
            int pid = read.nextInt();
            String ptype = read.next();
            String pname = read.next();
            String page = read.next();
            String pstate = read.next();


            System.out.printf("%s %s %s %s %s \n", pid, ptype, pname, page, pstate);

        }
    }
    void closeFile(){
        read.close();
    }

}

