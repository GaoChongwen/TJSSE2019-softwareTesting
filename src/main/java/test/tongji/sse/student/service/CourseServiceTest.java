package test.tongji.sse.student.service;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import tongji.sse.student.domain.Course;

/**
 * CourseService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>六月 3, 2019</pre>
 */
public class CourseServiceTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: createCourse(Course course)
     */
    @Test
    public void testCreateCourse() throws Exception {
//TODO: Test goes here...
        Integer id = 1;
        String subjectName = "Math";
        String language = "English";
        String majorId = "2";
        String comment = "";
        String examType = "Exam";
        String ways = "";
        String campus = "";
        String subjectType = "";
        String schedule = "";
        Integer courseHour = 20;
        Integer credit = 3;
        Integer semesterId = 1;
        Integer teacherId = 1;
        Integer collegeId = 15;
        String weekDay = "wed";
        String weekTime = "34";
        Course course = new Course(id, subjectName, language, Integer.parseInt(majorId), comment, examType, ways, campus, subjectType, schedule, courseHour,
                credit, semesterId, teacherId, collegeId, weekDay, weekTime);

//        courseService.createCourse(course);
    }

    /**
     * Method: selectCourse(Integer userId, Integer courseId)
     */
    @Test
    public void testSelectCourse() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getTeacherCourse(Integer teacherId)
     */
    @Test
    public void testGetTeacherCourse() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: addExamination(Examination examination)
     */
    @Test
    public void testAddExamination() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: generateCourseId()
     */
    @Test
    public void testGenerateCourseId() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getUserCourses(User user)
     */
    @Test
    public void testGetUserCourses() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getStudentList(Course course)
     */
    @Test
    public void testGetStudentListCourse() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getSemesterId(Integer year, String season)
     */
    @Test
    public void testGetSemesterId() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: markStudent(Integer studentId, Integer courseId, Double score)
     */
    @Test
    public void testMarkStudent() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAllCourse()
     */
    @Test
    public void testGetAllCourse() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getStudentList(Integer courseId)
     */
    @Test
    public void testGetStudentListCourseId() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getStudentCourses(Integer id)
     */
    @Test
    public void testGetStudentCourses() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: userStudyCourse(UserStudyCourse userStudyCourse)
     */
    @Test
    public void testUserStudyCourse() throws Exception {
//TODO: Test goes here... 
    }


} 
