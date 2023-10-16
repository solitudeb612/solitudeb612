package com.example.class_practice;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;



import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student s1 = new Student("1", "ID1", new Date(), "Male", "SocietyID1", "Address1", "12345", "123-456-7890", "School1", "ClassID1", "RoomID1");
        Student s2 = new Student("2", "ID2", new Date(), "Female", "SocietyID2", "Address2", "54321", "987-654-3210", "School2", "ClassID2", "RoomID2");
        Student s3 = new Student("3", "ID3", new Date(), "Male", "SocietyID3", "Address3", "67890", "555-555-5555", "School3", "ClassID3", "RoomID3");

        //将Student对象添加到集合中
        students.add(s1);
        students.add(s2);
        students.add(s3);



        String csvFileName = "student_data.csv";

        try (FileWriter fileWriter = new FileWriter(csvFileName);
             CSVPrinter csvPrinter = new CSVPrinter(fileWriter, CSVFormat.DEFAULT)) {

            // 写入CSV文件头部
            csvPrinter.printRecord("sid", "id", "birthday", "gender", "societyID", "address", "postcode", "phone", "school", "classID", "roomID");

            // 写入学生数据
            for (Student student : students) {
                csvPrinter.printRecord(student.getSid(), student.getId(), student.getBirthday(), student.getGender(), student.getSocietyID(),
                        student.getAddress(), student.getPostcode(), student.getPhone(), student.getSchool(),
                        student.getClassID(), student.getRoomID());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
