package Util;

import Data.Data;
import Models.Student;

import java.util.Date;
import java.util.Scanner;

public class Methods {
    public static void Question()
    {
        int proc=ForInt("Emeliyyat secin: \n1.Qeydiyyat \n2.Redakte Et \n3.Axtarish");
        if(proc==1)
        {
            CreateStudent();
            PrinStudents();
        } else if (proc==2) {

        }
        else {
            SearchStudents();
        }
        String proc2=ForString("Davam etmek isteyirsinizmi he/yox ?");
        if(proc2.equals("he"))
        {
            Question();
        }
    }
    public  static String ForString(String titul)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print(titul);
        String name=scanner.next();
        return name;
    }
    public  static int ForInt(String titul)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print(titul);
        int name=scanner.nextInt();
        return name;
    }
    public  static void  CreateStudent()
    {
        int count=Methods.ForInt("Teleb sayi:");
        Data.Students=new Student[count];
        for (int i=0;i<count;i++)
        {
            String name=ForString(i+".Telebenin adi");
            String surname=ForString(".Telebenin Soyadi");
            int age=ForInt("Telebenin yashi:");
            String classname =ForString(".Telebenin sinifi");
            Student st=new Student(name,surname,age,classname);
            Data.Students[i]=st;
        }
    }
    public  static void PrinStudents()
    {
        var students=Data.Students;
        for (int i=0;i<students.length;i++)
        {
            System.out.println(
                    students[i].getName()
                            +" "+students[i].getSurName()
                            +" "+students[i].getClassName()
                            +" "+students[i].getAge()
            );
        }
    }
    public  static  void  SearchStudents()
    {
        String word=ForString("Search:");
        var students=Data.Students;
        for (int i=0;i<students.length;i++)
        {
            var student=students[i];
            if (student.getName().contains(word) || student.getSurName().contains(word) || student.getClassName().contains(word))
            {
                System.out.println(
                        students[i].getName()
                                +" "+student.getSurName()
                                +" "+student.getClassName()
                                +" "+student.getAge()
                );
            }
        }
    }
    




}
