package OOPS_REVISE;

public class basics {
    public static void main(String[] args) {
    
        Student yash= new Student(13,22,"king");
        yash.greeting();
        yash.ChangeName("KING");
        yash.greeting();
    }
    

    static class Student{
        int rno;
        String name;
        int marks;

        void greeting(){
        System.out.println("i am "+ this.name);
    }
        void ChangeName(String NewName){
            name=NewName;
    }

        Student(int rno, int marks,String name){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
        }
    }
}
