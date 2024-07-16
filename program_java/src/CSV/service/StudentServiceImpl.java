package CSV.service;


import CGManagement.repository.IStudentRepo;
import CGManagement.repository.StudenRepoImpl;
import CSV.model.Student;

import java.time.LocalDate;
import java.util.List;


public class StudentServiceImpl implements IStudentService{
    private final IStudentRepo studentRepo = new StudenRepoImpl();

    public List<Student> findAll() {
        return studentRepo.findAll();
    }

    @Override
    public boolean addStudent(int id, String code,String name, LocalDate birthday, String email, String className) {
        List<Student> students = findAll();
        if(students.isEmpty()){
            id = 1;
        }
        else{
            id = students.get(students.size() - 1).getId() + 1;
        }
        return studentRepo.addStudent(id, code, name, birthday, email, className);
    }

    @Override
    public boolean removeStudent(int id) {
        return studentRepo.removeStudent(id);
    }

    public boolean updateStudent(int id, String name, LocalDate birthday, String email, String className) {
        return studentRepo.updateStudent(id, name, birthday, email, className);
    }

    @Override
    public List<Student> getStudentsByName(String name) {
        return studentRepo.getStudentsByName(name);
    }

}
