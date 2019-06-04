package tongji.sse.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.session.Session;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.scope.Scope;
import tongji.sse.student.domain.Course;
import tongji.sse.student.domain.Student;
import tongji.sse.student.domain.User;
import tongji.sse.student.domain.UserStudyCourse;
import tongji.sse.student.service.CourseService;
import tongji.sse.student.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Component
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private UserService userService;








    @ExceptionHandler(Exception.class)

    @RequestMapping("createCourse")
    @ResponseBody
    String createCourse( HttpServletRequest request, HttpServletResponse response) throws IOException,Exception {
        HttpSession session = request.getSession(false);
        try {
            System.out.println("in");
//            String teacherId = session.getAttribute("id").toString();
            Integer teacherId = 2;
//            if (teacherId == null || teacherId.equals("")) {
//                response.sendError(500, "please login first!");
//                return;
//            }
            String subjectName = request.getParameter("subjectName");
            String subjectType = request.getParameter("subjectType");
            String language = request.getParameter("subjectLang");
            String collegeId = request.getParameter("collegeId");
            String majorId = request.getParameter("majorId");
            String credit = request.getParameter("credit");
            String finalExam = request.getParameter("finalExam");
            String finalPercent = request.getParameter("finalPercent");
            String coursePerformance = request.getParameter("coursePerformance");
            String performancePercent   = request.getParameter("performancePercent");
            String ways = new String("");
            String season = request.getParameter("season");
            String year = request.getParameter("year");
            String schedule = request.getParameter("schedule");
            String weekDay = request.getParameter("weekday");
            String weekTime = request.getParameter("weektime");
            String campus = request.getParameter("campus");
            Integer semesterId = 1;
            try {
                semesterId = courseService.getSemesterId(Integer.parseInt(year), season);
            } catch (Exception e) {
                response.sendError(400, "semester information is empty, please check the content you'v entered!");
                return "Error";
            }
            String comment = request.getParameter("comment");
            for(int i = 1; i < 4; ++i) {
                ways = ways + request.getParameter("way" + String.valueOf(i));
                ways = ways+ ":";
                ways = ways + request.getParameter("percent"+String.valueOf(i));
                ways = ways + "|";
            }
            ways = ways + coursePerformance + ":" + performancePercent + "|" + finalExam + ":" + finalPercent;

            // To maintain the key info is not null
            if (majorId == null || majorId.equals("")
            || collegeId == null || collegeId.equals("")
            || subjectName == null || subjectName.equals("")) {
                response.sendError(400, "key information is empty!");
                return "Error";
            }




            Integer id = courseService.generateCourseId();
            Course course = new Course(id, subjectName, language, Integer.parseInt(majorId), comment,"Exam", ways, campus, subjectType, schedule, 20,
                    Integer.parseInt(credit), semesterId, teacherId, Integer.parseInt(collegeId), weekDay, weekTime);
            courseService.createCourse(course);
            return id.toString();
        } catch (Exception e) {
            response.sendError(500, "can't add the course");
            return "Error";
        }
//        if (session == null) {
//            response.sendError(401, "please login first");
//            return;
//        }

    }



    @RequestMapping("getTeacherCourses")
    @ResponseBody
    ArrayList<Course> getMyCourse() {
        Integer teacherId = 2;
        return courseService.getTeacherCourse(teacherId);
    }


    @RequestMapping("getCourses")
    @ResponseBody
//    @ExceptionHandler
    List<Course> getAllCourses(HttpServletResponse response, HttpServletRequest request) throws Exception {

        System.out.println("startGetCourses");

        HttpSession session = request.getSession(false);
        Integer id = 4;
        List<Course> courses = null;
        if (session != null) {
            System.out.println("Id in session: " + session.getAttribute("id"));
        }
        try {
            courses = courseService.getAllCourse();
            for (Course course: courses) {
                User teacher= userService.getUserById(course.getTeacherUserId());
                if (teacher!= null && teacher.getUsername()!=null) {
                    course.setTeacherName(teacher.getUsername());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendError(500, "Can't load all courses");
        }
        return courses;
    }

    @RequestMapping("applyCourse")
    @ResponseBody
    String applyCourse(@RequestParam(required = true, value = "list[]") List<String> data, HttpServletResponse response) throws Exception {
        System.out.println(data);
        Integer userId = 4;
        for (String courseId: data) {
            try {
                courseService.selectCourse(userId, Integer.parseInt(courseId));
            } catch (Exception e) {
                e.printStackTrace();
                response.sendError(500, "can't apply course!");
                return "Wrong";
            }
        }
        return "OK";
    }


    @RequestMapping("getStudentList")
    @ResponseBody
    public ArrayList<Student> getStudentList(@RequestParam("courseId") Integer courseId) {
        ArrayList<Student> students =  courseService.getStudentList(courseId);
        for (Student student: students) {
            try {
                User user = userService.getUserById(student.getUserId());
                student.setName(user.getUsername());
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return students;
    }

    @RequestMapping("score")
    @ResponseBody
    String score(@RequestParam("stuId") Integer studentId, @RequestParam("courseId") Integer courseId){
        System.out.println(studentId);
        System.out.println(courseId);
        return "ok";
    }

}
