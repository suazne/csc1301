import java.util.ArrayList; //Suzanne Schouest Hon Lab 9
public class Student /*this file and the others I submitted do not run but I am submitting the files to show that I did do work,
                     I just wasn't able to complete the assignment. I added some comments to explain, but am very lost and am
                     hoping to gain an understanding of these concepts in our next Lab meeting*/
{
   //attributes
   private String name;
   private String major;
   ArrayList<CourseRecord> courseList = new ArrayList <CourseRecord>();
   
   //constructors
   public Student(String name, String major){
      this.name = name;
      this.major = major;
   }
   
   public String addCourseRecord(String course, int credit, String grade){
      CourseRecord course1 = new CourseRecord (course, credit, grade);
      courseList.add(course1);
   }
   
   //"getters"
   public String getName(){
      return name;
   }
   
   public String getMajor(){
      return major;
   }
   
   public ArrayList <CourseRecord> getCourseList(){
      return courseList;
   }
   
   //"setters"
   public void setName(String name){
      this.name = name;
   }
   
   public void setMajor(String major){
      this.major = major;
   }
   
   public void setGradeList(ArrayList<CourseRecord> courseList){
      this.courseList = courseList;
   }
   
   
   public double gpa(ArrayList<CourseRecord> array){ //or is it: public double gpa(String course, int credits, String grade){
      
      double numberGrade;
      String grade;
      switch (grade)//this changes the letter grades to point system representations so we can calculate the gpa
      {
      case A:
         numberGrade = 4.0;
         break;
      case B:
         numberGrade = 3.0;
         break;
      case C:
         letterGrade = 2.0;
         break;
      case D:
         letterGrade = 1.0;
         break;  
      case F:
         letterGrade = 0.0;
         break;
      default:
         letterGrade = "invalid grade";
      }
      /*here, I would write code on calculating the gpa by adding up the grades multiplied by their respective credits 
      and dividing them by the total credit hours, but I am not sure what the parameters should be for this method.
      I am inclined to say what is listed above as a comment on line 49, but I don't know how to then have each array in the
      array list (each course and its respective data) be brought into the method */
   }
   
   public String toString(){
   /*I don't really understand how to do the ToString method without having done the code that would be written above it. I attended the 
   lab and rewatched the recording but it just isn't making sense to me--this was just a lot all at once*/
   }
}