package oop_HW5.services;

import oop_HW5.models.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class GroupService {
    private final StudentService studentService;
    private final TeacherService teacherService;

    public GroupService(StudentService studentService, TeacherService teacherService) {
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    public List<User> getAllUsersFromGroup(String groupTitle) {
        List<User> users = new ArrayList<>();
        users.addAll(studentService.getAllByTitile(groupTitle));
        users.addAll(teacherService.getAllByTitile(groupTitle));

        return users;
    }
}
