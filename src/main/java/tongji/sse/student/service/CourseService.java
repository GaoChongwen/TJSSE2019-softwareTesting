package tongji.sse.student.service;

import org.bcos.web3j.abi.datatypes.Int;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tongji.sse.student.dao.*;
import tongji.sse.student.domain.*;

import java.util.ArrayList;
import java.util.List;

//
//interface CourseServiceInterface {
//    public void createCourse(Course course) throws Exception;
//    public void selectCourse(User user, Course course) throws Exception;
//    public void addExamination(Examination examination) throws Exception;
//    public void markStudentFinal(User user, Course course, Integer score) throws Exception;
////    public void markStudentQuiz(User user, Examination examination, Integer socre) throws Exception;
//    public Integer generateCourseId();
//    public ArrayList<Course> getUserCourses(User user) throws Exception;
//    public ArrayList<Student> getStudentList(Course course) throws Exception;
//
//}
@Service
public class CourseService   {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private UserStudyCourseMapper userStudyCourseMapper;
    @Autowired
    private ExaminationMapper examinationMapper;
    @Autowired
    private CourseExaminationMapper courseExaminationMapper;
    @Autowired
    private MajorMapper majorMapper;
    @Autowired
    private SemesterMapper semesterMapper;


    public void createCourse(Course course) throws Exception {
        try {
            courseMapper.insert(course);

        } catch (Exception e) {
            throw e;
        }
    }

    public void selectCourse(Integer userId, Integer courseId) throws Exception {
        try {
            UserStudyCourse userStudyCourse = new UserStudyCourse(userId, courseId, -1.0);
            userStudyCourseMapper.insert(userStudyCourse);
        } catch (Exception e) {
            throw e;
        }
    }


    public ArrayList<Course> getTeacherCourse(Integer teacherId) {
        ArrayList<Course> courses = null;
        try {
            courses = courseMapper.selectMyCourse(teacherId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return courses;
    }




    public void addExamination(Examination examination) throws Exception {
        try {
            examinationMapper.insert(examination);
//            ArrayList<Integer> studentList = courseMapper.getStudentList(examination.getCourseId());
        } catch (Exception e) {
            throw e;
        }
    }


    public Integer generateCourseId() {
        Integer max = courseMapper.getMaxId();
        if (max != null) {
            return max + 1;
        } else {
            return 0;
        }
    }

//    public void markStudentFinal(User user, Course course, Integer score) throws Exception {
//        userStudyCourseMapper.updateStudentScore(course.getId(), user.getId(), score);
//    }


    public ArrayList<Course> getUserCourses(User user) throws Exception {
        ArrayList<Course> courses = null;
        try {
            courses = courseMapper.getStudentCourseList(user.getId());
        } catch (Exception e) {
            throw e;
        }
        return courses;
    }
//TODO
    public ArrayList<Student> getStudentList(Course course) throws Exception {
        ArrayList<Student> students = null;
        try {
            students = courseMapper.getStudentList(course.getId());
        } catch (Exception e) {
            throw e;
        }
        return students;
    }

    public Integer getSemesterId(Integer year, String season) throws Exception {
        try {
            Semester semester = semesterMapper.getSemester(year, season);
            if (semester == null || semester.getId() == null) {
                Integer id = semesterMapper.getMaxId();
                if (id == null) {
                    id = 1;
                }
                Semester semester1 = new Semester(id + 1, year, season);
                semesterMapper.insert(semester1);
                return semester1.getId();
            } else {
                return semester.getId();
            }
        } catch (Exception e) {
            throw e;
        }
    }


    public void markStudent(Integer studentId, Integer courseId, Double score) throws Exception {
        try {
            userStudyCourseMapper.updateScore(courseId,studentId,score);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public List<Course> getAllCourse() {
        return courseMapper.selectAll();
    }

    public ArrayList<Student> getStudentList(Integer courseId) {
        return courseMapper.getStudentList(courseId);
    }

    public ArrayList<Course> getStudentCourses(Integer id) {
        return courseMapper.getStudentCourseList(id);
    }

    public UserStudyCourse userStudyCourse(UserStudyCourse userStudyCourse) {
        return userStudyCourseMapper.selectOneById(userStudyCourse.getUserId(),userStudyCourse.getCourseId());
    }

}
