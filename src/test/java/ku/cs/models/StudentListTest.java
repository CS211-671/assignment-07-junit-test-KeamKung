package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList sl1;

    @BeforeEach
    void init(){
        sl1 = new StudentList();
        sl1.addNewStudent("6xxxxx111","Keam");
    }

    @Test
    @DisplayName("เพิ่มนักเรียนใน StudentList")
    void addNewStudent(){
        sl1.addNewStudent("6xxxxx222","Tee");
        assertNotNull(sl1.findStudentById("6xxxxx222"));
    }

    @Test
    @DisplayName("หานักเรียนใน StudentList")
    void testFindStudentById(){
        assertEquals("6xxxxx111",sl1.findStudentById("6xxxxx111").getId());
    }

    @Test
    @DisplayName("ให้คะแนนนักเรียนใน StudentList")
    void testGiveScoreToId(){
        sl1.giveScoreToId("6xxxxx111",60);
        assertEquals(60,sl1.findStudentById("6xxxxx111").getScore());
    }

    @Test
    @DisplayName("ดูเกรดของนักเรียนใน StudentList")
    void viewGradeOfId(){
        sl1.giveScoreToId("6xxxxx111",60);
        assertEquals("C",sl1.viewGradeOfId("6xxxxx111"));
    }

}