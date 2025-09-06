package Heap.practice;
import java.util.*;

public class ClassObject {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            if(this.rank==s2.rank){
                return this.name.compareTo(s2.name);
            }
            return this.rank-s2.rank; //min heap
            //return s2.rank-this.rank; //max heap
        }
    }
}
