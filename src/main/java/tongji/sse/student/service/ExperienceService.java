package tongji.sse.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tongji.sse.student.dao.ExperienceMapper;
import tongji.sse.student.domain.Experience;

@Service
@Component
public class ExperienceService {
    @Autowired
    private ExperienceMapper experienceMapper;





}
