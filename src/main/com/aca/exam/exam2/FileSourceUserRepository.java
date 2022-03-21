package com.aca.exam.exam2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileSourceUserRepository implements CrudRepository<User, String> {
    private static final FileSourceUserRepository fileSourceUserRepository = new FileSourceUserRepository();


    private FileSourceUserRepository() {
    }

    public static FileSourceUserRepository getInstance() {
        return fileSourceUserRepository;
    }


    @Override
    public User findById(String s) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\avetis\\IdeaProjects\\aca-project\\src\\main\\com\\aca\\exam\\exam2\\users.txt"));
        String nextLine = scanner.nextLine();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            nextLine = scanner.nextLine();
            String[] users = nextLine.split(",");
            User user = new User(users[0], users[1], users[2]);
            if (s.equals(users[0])) {
                return user;
            }
        }
        return null;

    }

    @Override
    public List<User> findAll() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\Users\\avetis\\IdeaProjects\\aca-project\\src\\main\\com\\aca\\exam\\exam2\\users.txt"));
        int lineSize = 0;
        while (scanner.hasNextLine()) {
            lineSize++;
            String[] users = scanner.nextLine().split(",");
            User user = new User(users[0], users[1], users[2]);
        }
        return null;
    }
}
