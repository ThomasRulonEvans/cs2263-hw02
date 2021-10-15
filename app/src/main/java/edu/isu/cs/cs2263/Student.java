package edu.isu.cs.cs2263;


import java.util.ArrayList;

/**
 * @author Thomas Evans
 * @version v2.0.0
 */
public class Student {
    /**
     * initial vars
     */
    private String firstName;
    private String lastName;

    /**
     *Setting /getter
     */
    public  void Student(){

    }

    public ArrayList<Course> courseList = new ArrayList<Course>();


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addCourse(Course course){
        courseList.add(course);
    }

    public ArrayList<Course> getCourseList(){
        return courseList;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}
