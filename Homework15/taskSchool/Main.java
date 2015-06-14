package taskSchool;

public class Main {

	public static void main(String[] args) {
		// declaration of different directors
		Director d1 = new Director("Gordan Mashic", 1991);
		Director d2 = new Director("Adis Cehajic", 1985);
		// declaration of different classrooms
		Classroom sC1 = new Classroom("Ia", 25);
		Classroom sC2 = new Classroom("IIb", 23);
		Classroom sC3 = new Classroom("Ic", 21);
		Classroom sC4 = new Classroom("IId", 26);
		// arrays of classrooms
		Classroom[] schoolClass1 = {sC1, sC2};
		Classroom[] schoolClass2 = {sC3, sC4};
		// declaration of different schools
		School s1 = new School("BIT Camp", d1, schoolClass1);
		School s2 = new School("IT Camp", d2, schoolClass2);
		// array of schools
		School[] schools = {s1, s2};
		// calls out for methods and prints result
		System.out.println("Name of the class with most students: " + getNameOfClassWithTheMostStudents(s1));
		System.out.println("School with youngest director: " + getSchoolWithYoungestDirector(schools));
		System.out.println("School with most students is: " + getNameOfSchoolWithMoreStudents(s1, s2));
	}
	/**
	 * Get class with most students
	 * <p>
	 * Calculates which class in school has the most students.
	 * @param s - school
	 * @return - class name or null 
	 */
	public static String getNameOfClassWithTheMostStudents(School s){
		// store class with most students in this variable
		int theMostStudents = 0;
		// for loop within school length
		for(int i = 0; i < s.schoolClass.length; i++){
			// compare number of students for i 
			if(s.schoolClass[i].numStudents > theMostStudents){
				theMostStudents = s.schoolClass[i].numStudents;
			}
		}
		// for loop within school length
		for(int i = 0; i < s.schoolClass.length; i++){
			// if it's a school with the most students from loop above return class name
			if(theMostStudents == s.schoolClass[i].numStudents){
				return s.schoolClass[i].className;
			}
		}
		
		return null;
		
	}
	/**
	 * Which school has youngest director?
	 * 
	 * @param schools - array of schools
	 * @return - name of school or null if it's same
	 */
	public static School getSchoolWithYoungestDirector(School[] schools){
		// store youngest director in this variable
		int theYoungestD = 0;
		// for loop within school length
		for(int i = 0; i < schools.length; i++){
			// if number is larger store in variable
			if(schools[i].d.yearOfBirth > theYoungestD){
				theYoungestD = schools[i].d.yearOfBirth ;
			}
		}
		// for loop within school length
		for(int i = 0; i < schools.length; i++){
			// if number is same as in loop above return school name
			if(theYoungestD == schools[i].d.yearOfBirth){
				return schools[i];
			}
		}

		return null;
	}
	/**
	 * Get name of school with more students
	 * @param s1 - school1 to compare
	 * @param s2 - school2 to compare
	 * @return - name of school with more students
	 */
	public static String getNameOfSchoolWithMoreStudents(School s1, School s2){
		// counters for both schools
		int counter1 = 0;
		int counter2 = 0;
		// for loop within one school 
		for(int i = 0; i < s1.schoolClass.length; i++){
			// counter for each i
			counter1 += s1.schoolClass[i].numStudents;
		}
		// for loop within one school 
		for(int i = 0; i < s2.schoolClass.length; i++){
			// counter for each i
			counter1 += s2.schoolClass[i].numStudents;
		}
		// compare counters and return school name
		if(counter1 < counter2){
			return s2.name;
		} else {
			return s1.name;
		}
	}
}
