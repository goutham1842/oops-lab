class University {
  String universityName;
  String location;

University(String name, String loc) {
universityName = name;
 location = loc;
    }

 void displayUniversityInfo() {
    System.out.println("University Name: " + universityName);
    System.out.println("Location: " + location);
  }
}


class College extends University {
   String collegeName;
   int collegeRank;

College(String universityName, String location, String collegeName, int collegeRank) {
  super(universityName, location); // Call constructor of University
   this.collegeName = collegeName;
   this.collegeRank = collegeRank;
  }

void displayCollegeInfo() {
System.out.println("College Name: " + collegeName);
 System.out.println("College Rank: " + collegeRank);
 }
}

class Department extends College {
String departmentName;
int numberOfStudents;
Department(String universityName, String location, String collegeName, int collegeRank,
String departmentName, int numberOfStudents)
 {
super(universityName, location, collegeName, collegeRank);       
this.departmentName = departmentName;
this.numberOfStudents = numberOfStudents;
    }

 void displayDepartmentInfo() {
System.out.println("Department Name: " + departmentName);
 System.out.println("Number of Students: " + numberOfStudents);
    }
}

public class Multilevelone {
    public static void main(String[] args) {

 Department dept = new Department("Oxford University", "UK",
   "Engineering College", 1,
 "Computer Science", 300);


        
dept.displayUniversityInfo();      
    
dept.displayCollegeInfo();         
dept.displayDepartmentInfo();   
    }
}
