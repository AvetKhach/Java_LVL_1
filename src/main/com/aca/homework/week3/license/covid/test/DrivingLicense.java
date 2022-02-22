package com.aca.homework.week3.license.covid.test;

public class DrivingLicense {

    private User user;
    final private char [] licenseCategories ={'A','B','C','D','E'};
    private String licenseOfUser;

    public DrivingLicense(String licenseOfUser,User user){
        this.user = user;
        setLicenseOfUser(licenseOfUser);
    }
    public void setLicenseOfUser(String licenseOfUser) {
        StringBuilder license = new StringBuilder();
        for (int i = 0; i <licenseCategories.length ; i++) {
            for (int j = 0; j < licenseOfUser.length(); j++) {
                if(licenseOfUser.charAt(j)==licenseCategories[i]){
                    license.append(licenseCategories[i]);
                }
            }
        }
        if(license.toString().equals("")){
            System.out.println("Category is not from the list");
        }
        System.out.print(license);
    }
}
