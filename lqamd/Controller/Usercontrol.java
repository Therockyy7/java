package lqamd.Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lqamd.Model.User;

public class Usercontrol {
    List<User> data = new ArrayList<User>();
    String fileName = "D:\\java_tu_hoc\\lqamd\\user.dat";
    public void loadData(){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine()) != null){
                String []linearr = line.split(":");
                data.add(new User(linearr[0], linearr[1]));
            }
            // System.out.println("list: "+ data.toString());// for test
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not Found: "+ fileName);

            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Line is Null.");
        }
    }

    public void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name user: "); String name = sc.nextLine();
        System.out.println("PassWord: "); String pass = sc.nextLine();
        if(data.contains(new User(name, pass))){
            System.out.println("Suscessfull!");
        }else{
            System.out.println("fail!");
        }
    }
    public void saveData(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            for(User u : data){
                String line = u.getName() + ":" + u.getPassWord()+"\n";
                bw.write(line);
            }
            bw.close();
        } catch (IOException e) {
            System.out.println("File not Found!");
        }
    }

    public void CreateFile(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name user: "); String name = sc.nextLine();
        System.out.println("PassWord: "); String pass = sc.nextLine();
		data.add(new User(name, pass));
        saveData();
        
    }
}
