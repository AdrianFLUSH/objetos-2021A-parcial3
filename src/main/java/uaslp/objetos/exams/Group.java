package uaslp.objetos.exams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Group {
    private int Capacity;
    private int availability;
    private double GAverage;

    List<Student> students;

    public Group(int Capacity) {
        this.Capacity = Capacity;
        this.availability = Capacity;
        students = new ArrayList<>(Capacity);
    }

    public int getCapacity() {
        return Capacity;
    }

    public int getAvailability() {
        return Capacity - students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) throws GroupIsFullException {
        if (students.size() == Capacity) {
            throw new GroupIsFullException();
        } else
            students.add(student);
    }
    public double getAverage() {

        for(int i=0; i<students.size(); i++)
        {
                GAverage=GAverage+students.get(i).getAverage();
        }
        return GAverage/students.size();
    }
}