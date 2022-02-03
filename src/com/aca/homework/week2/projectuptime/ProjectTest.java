package com.aca.homework.week2.projectuptime;

import java.util.Scanner;

public class ProjectTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Project[] projects = new Project[3];
        for (int i = 0; i < projects.length; i++) {
            projects[i] = new Project();
            projects[i] = createProject(start);
        }
        printProjects(projects);
    }
    public static Project createProject(long start) {
        Project project = new Project();
        System.out.println("include project name");
        project.name = new Scanner(System.in).nextLine();
        project.creationSeconds = (System.currentTimeMillis() - start) / 1000;
        return project;
    }
    public static void printProjects(Project[] projects) {
        for (int i = 0; i < projects.length; i++) {
            System.out.println(projects[i].creationSeconds + " " + projects[i].name);
        }
    }
}
