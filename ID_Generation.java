package Uni_stu_record_system;

public class ID_Generation extends Student {
    public StringBuilder Idgeneration(){
        int min = 10000;
        int max = 49999;
        String random_string;
        //Generate random int value from 10000 to 49999
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        Integer i = random_int;
        StringBuilder sb = new StringBuilder();
        StringBuilder stringBuilder = sb.append(i);
        return stringBuilder;
    }
}
