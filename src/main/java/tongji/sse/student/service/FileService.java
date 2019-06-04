package tongji.sse.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import tongji.sse.student.dao.ExperienceMapper;
import tongji.sse.student.domain.Experience;

import java.util.ArrayList;

@Service
@Component
public class FileService {
    @Autowired
    ExperienceMapper experienceMapper;

    // To get the max id and return max id+1
    public Integer generationExpId() {
        Integer id = experienceMapper.getMaxId();
        if (id == null) {
            return 1;
        } else {
            return id + 1;
        }
    }

    //store the exp to the db

    public Boolean insertExp(Experience experience) {
        try {
            experienceMapper.insert(experience);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Boolean insertExp(Integer userId, String description,String name,  String fileName, String type) {
        userId = 4;
        Integer id = generationExpId();
        Experience experience = new Experience(id,userId, name,description,fileName,0, type);

        try {
            experienceMapper.insert(experience);
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public ArrayList<Experience> getAllExperience() {
        return (ArrayList<Experience>)experienceMapper.selectAll();
    }

    public ArrayList<Experience> getUserExperience(Integer userId) {
        return (ArrayList<Experience>) experienceMapper.getUserExpList(userId);
    }

    public boolean review(Integer fileId, Integer status) {
        Experience experience = experienceMapper.getOne(fileId);
        try {
            if (experience != null && experience.getStatus() != null) {
                experience.setStatus(status);
                System.out.println(experience.getStatus());
                experienceMapper.updateStatus(status, fileId);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
    }
    }

}
