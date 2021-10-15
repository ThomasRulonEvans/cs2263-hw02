package edu.isu.cs.cs2263;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * @author Thomas Evans
 * @version v2.0.0
 */
public class IOManager {


    //writes data from program to json file
    public static ArrayList<String> writeData(ArrayList<Student> students){
        ArrayList<String> serializedStudents = new ArrayList<>();
        Gson gsonWrite = new Gson();
        for (Student stud :students){
            String serializedStudent = gsonWrite.toJson(stud);
            serializedStudents.add(serializedStudent);
        }
        return serializedStudents;
    }

    //reads data to program from json file
    public static ArrayList<Student> readData(String filename) throws FileNotFoundException {
        ArrayList<Student> deserializedStudents = new ArrayList<>();
        Gson gsonRead = new Gson();
        Type studentType = new TypeToken<ArrayList<Student>>(){}.getType();
        JsonReader jsonReader = new JsonReader(new FileReader(filename));
        return  gsonRead.fromJson(jsonReader, studentType);
    }
}
