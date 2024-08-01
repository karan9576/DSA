 

import java.util.*;
class p1{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        } 

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String []args){
            PriorityQueue<Student> pq=new PriorityQueue<>();
            pq.add(new Student("Ram",2));
            pq.add(new Student("karan",1));
            while(!pq.isEmpty()){
                System.out.println(pq.remove().name);//sorted wrt to rank
            }

    }
}
