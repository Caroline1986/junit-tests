import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreateStudentInstance(){
        Student caroline = new Student(1L, "Fer");
        assertNotNull(caroline);
    }

    @Test
    public void  testStudentFields() {
        Student caroline = new Student(1L, "Fer");
        assertEquals("Fer", caroline.getName());
        assertEquals(1L, caroline.getId());
    }

    @Test
    public void testIfGetId() {
        assertEquals(1234, Student.getId(1234));
    }

    @Test
    public void testIfReturnsName() {
        assertEquals("caroline", Student.getName("caroline"));

    }

    @Test
    public void testAddGrade(){
        Student caroline = new Student (1L, "Fer");
        caroline.addGrade(100);
        assertEquals(100, (int)caroline.getGrade().get(0));
    }

//    @Test
//    public void testIfAddsGradeToList() {
//        assertEquals(90, Student.addGrade(90));
//    }

@Test
    public void testAverageGrade(){
        Student caroline = new Student(1L, "Fer");
        caroline.addGrade(100);
        caroline.addGrade(80);
        assertEquals(90.0, caroline.getGradeAverage(),0);
}
}
