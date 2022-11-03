import java.util.Scanner;
import java.util.Calendar;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;

class staff
{
    String sid, sname, desg, sex;
    int salary;
    void new_staff()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        sid = input.nextLine();
        System.out.print("name:-");
        sname = input.nextLine();
        System.out.print("desigination:-");
        desg = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("salary:-");
        salary = input.nextInt();
        
    }
    void staff_info()
    {
        System.out.println(sid + "\t" + sname + "\t" + sex + "\t\t" + salary);
    }
}
class doctor
{
    String did, dname, specilist, appoint, doc_qual,phono;
    int droom;
    void new_doctor()                                                  //functiom to adding doctor information in file
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        did = input.nextLine();
        System.out.print("name:-");
        dname = input.nextLine();
        System.out.print("specilization:-");
        specilist = input.nextLine();
        System.out.print("work time:-");
        appoint = input.nextLine();
        System.out.print("Phone No:-");
        phono = input.nextLine();
        System.out.print("qualification:-");
        doc_qual = input.nextLine();
        System.out.print("room no.:-");
        droom = input.nextInt();
        try{
            FileWriter f1=new FileWriter("doctor.txt",true);
            PrintWriter f1f1=new PrintWriter(f1);
            f1f1.println(did + "        " + dname + "          " + specilist + "             " + appoint + "            " + doc_qual + "               " + droom);
            f1f1.close();


        }
        catch(Exception e){
            System.out.println("Eror storing the data");
        }
    }
    void doctor_info()                                 //function to getting doctor information from file
    {   
        char [] arr1=new char[1000];
        try{
            FileReader f1=new FileReader("doctor.txt");
            f1.read(arr1);
            System.out.println(arr1);
            f1.close();
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("something going wrong");

        }
    }
    void docspec(){
        System.out.println(dname +"\t"+ specilist + "\t" + phono);
    }
    
}
class patient
{                                                                     //functiom to adding patient information in file
    String pid, pname, disease, sex, admit_status;
    int age;
    void new_patient()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("id:-");
        pid = input.nextLine();
        System.out.print("name:-");
        pname = input.nextLine();
        System.out.print("disease:-");
        disease = input.nextLine();
        System.out.print("sex:-");
        sex = input.nextLine();
        System.out.print("admit_status:-");
        admit_status = input.nextLine();
        System.out.print("age:-");
        age = input.nextInt();
        char [] arr=new char[1000];
        try{
            FileWriter f2=new FileWriter("patient.txt",true);
            PrintWriter f2f2=new PrintWriter(f2);
            f2f2.println(pid + "\t" + pname + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t       " + age);
            f2f2.close();


        }
        catch(Exception e){
            System.out.println("Eror storing the data");
        }
    }

    void patient_info()                                                //function to getting patient information from file
    {
        char [] arr2=new char[1000];
        try{
            FileReader f2=new FileReader("patient.txt");
            f2.read(arr2);
            System.out.println(arr2);
            f2.close();
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("something going wrong");

        }
        
    }
    
}
class medical
{
    String med_name, med_comp, exp_date;
    int med_cost, count;
    void new_medi()                                                  //functiom to adding medical information in file
    {
        Scanner input = new Scanner(System.in);
        System.out.print("name:-");
        med_name = input.nextLine();
        System.out.print("comp:-");
        med_comp = input.nextLine();
        System.out.print("exp_date:-");
        exp_date = input.nextLine();
        System.out.print("cost:-");
        med_cost = input.nextInt();
        System.out.print("no of unit:-");
        count = input.nextInt();
        try{
            FileWriter f3=new FileWriter("medical.txt",true);
            PrintWriter f3f3=new PrintWriter(f3);
            f3f3.println(med_name + "  \t" + med_comp + "    \t" + exp_date + "     \t" + med_cost);
            f3f3.close();


        }
        catch(Exception e){
            System.out.println("Eror storing the data");
        }
    }
    void find_medi()                                                                   //function to getting medical information from file
    {   
        char [] arr3=new char[1000];
        try{
            FileReader f3=new FileReader("medical.txt");
            f3.read(arr3);
            System.out.println(arr3);
            f3.close();
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("something going wrong");

        }
        
    }
}
class lab                        
{
    String fecility;
    int lab_cost;
    void new_feci()                                                //ading new facilty
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fecility = input.nextLine();
        System.out.print("cost:-");
        lab_cost = input.nextInt();
        try{
            FileWriter f3=new FileWriter("lab.txt",true);
            PrintWriter f3f3=new PrintWriter(f3);
            f3f3.println(fecility + "\t\t" + lab_cost);                      
            f3f3.close();


        }
        catch(Exception e){
            System.out.println("Eror storing the data");
        }
    }
    
    void feci_list()                                                 //showing facility list
    {
        char [] arr3=new char[1000];
        try{
            FileReader f3=new FileReader("lab.txt");
            f3.read(arr3);
            System.out.println(arr3);
            f3.close();
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("something going wrong");

        }
        
    }
}
class fecility  
{
    String fec_name;
    void add_feci()                                 //Adding imp & emg. services
    {
        Scanner input = new Scanner(System.in);
        System.out.print("fecility:-");
        fec_name = input.nextLine();
        try{
            FileWriter f3=new FileWriter("fecility.txt",true);
            PrintWriter f3f3=new PrintWriter(f3);
            f3f3.println(fec_name);
            f3f3.close();


        }
        catch(Exception e){
            System.out.println("Eror storing the data");
        }
    }
    void show_feci()                                    //showing IMP and EMG. services
    {
        char [] arr3=new char[1000];
        try{
            FileReader f3=new FileReader("fecility.txt");
            f3.read(arr3);
            System.out.println(arr3);
            f3.close();
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("something going wrong");

        }
    
    }
}
public class HospitalManagement
{
    public static void main(String args[])
    {
        String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
        };
        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2=4;


        System.out.println("\n==============================================================================");

 
        System.out.println("                * * * Welcome to JAVA Hospital * * *");
        System.out.println("\n==============================================================================");
        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " ," + calendar.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));
        // creating the object for each class
        doctor d = new doctor();
        doctor[] doc = new doctor[50];
        patient p = new patient();
        lab l = new lab();
        fecility f = new fecility();
        medical m = new medical();
        staff[] s = new staff[100];
        int i;
        //this is only for doctor and contact no.
        for (i = 0; i < 50; i++)
            doc[i] = new doctor();
        //this is only for staff / making 100 spaces for the staff
        for (i = 0; i < 100; i++)
            s[i] = new staff();
         
        doc[0].did = "21";                     //storing data in aaray of doctor class 
        doc[0].dname = "Dr.Vishwas";
        doc[0].specilist = "eye";
        doc[0].appoint = "5-11AM";
        doc[0].doc_qual = "MBBS,MD";
        doc[0].droom = 17;
        doc[0].phono="9254648212";
        doc[1].did = "32";
        doc[1].dname = "Dr.Vikram";
        doc[1].specilist = "eye";
        doc[1].appoint = "10-3AM";
        doc[1].doc_qual = "MBBS,MD";
        doc[1].droom = 45;
        doc[1].phono="9254644542";
        doc[2].did = "17";
        doc[2].dname = "Dr.Rekha";
        doc[2].specilist = "Surgeon";
        doc[2].appoint = "8-2AM";
        doc[2].doc_qual = "BDM";
        doc[2].droom = 8;
        doc[2].phono="9266648212";
        doc[3].did = "33";
        doc[3].dname = "Dr.Pramod";
        doc[3].specilist = "Artho";
        doc[3].appoint = "10-4PM";
        doc[3].doc_qual = "MBBS,MS";
        doc[3].droom = 40;
        doc[3].phono="9254649612";

        s[0].sid = "22";                                //storing data in aaray of staff class          
        s[0].sname = "Prakash";
        s[0].desg = "worker";
        s[0].sex = "Male";
        s[0].salary = 25000;
        s[1].sid = "23";
        s[1].sname = "Komal";
        s[1].desg = "nurse";
        s[1].sex = "Female";
        s[1].salary = 15000;
        s[2].sid = "24";
        s[2].sname = "Raju";
        s[2].desg = "worker";
        s[2].sex = "Male";
        s[2].salary = 15000;
        s[3].sid = "25";
        s[3].sname = "Rani";
        s[3].desg = "nurse";
        s[3].sex = "male";
        s[3].salary = 20000;
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");


            System.out.println("1.Doctors  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.print("BUTTON::");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List\n3.Call Specialist DR.");
                            System.out.print("BUTTON::");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        doc[count1].new_doctor();count1++;
                                        break;
                                    }
                                case 2:
                                    {   
                                        d.doctor_info();
                                        break;
 
                                    }
                                case 3:
                                {
                                    System.out.print("Specialist in:");
                                    String Spec=input.next();
                                    System.out.println("--------------------------------------------------------------------------------");
                                    System.out.println("Name \t Specialist-IN \t Phone N0.");
                                    System.out.println("--------------------------------------------------------------------------------");
                                    for (j = 0; j < count1; j++)
                                        {
                                            if (Spec.toLowerCase().equals(doc[j].specilist.toLowerCase()))     //checking the specialist from the whole specialist string and printing the maching specialist data
                                                doc[j].docspec();
                                        }
                                        break;
   
                                }

                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p.new_patient();
                                        break;
                                    }
                                case 2:
                                    {
                                        p.patient_info();
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **MEDICINE SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry\n2. Existing Medicines List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        m.new_medi();
                                        break;
                                    }
                                case 2:
                                    {
                                            m.find_medi();
                                        
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **LABORATORY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l.new_feci();
                                        break;
                                    }
                                case 2:
                                    {     
                                        l.feci_list();
                                        break;

                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                case 5:
                    {
                        s5 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("          **HOSPITAL FACILITY SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s5 == 1)
                        {
                            System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        f.add_feci();
                                        break;
                                    }
                                case 2:
                                    {

                                        
                                            f.show_feci();
                                        
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s5 = input.nextInt();
                        }
                        break;
                    }
                case 6:
                    {
                        s6 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s6 == 1)
                        {
                            String a = "nurse", b = "worker", c = "security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        s[count2].new_staff();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++)
                                        {
                                            if (a.equals(s[j].desg.toLowerCase()))     //checking the designation from the whole designation string and printing the maching designation data
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                case 3:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++)
                                        {
                                            if (b.equals(s[j].desg))     //checking the designation from the whole designation string and printing the maching designation data
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                                case 4:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++)
                                        {
                                            if (c.equals(s[j].desg.toLowerCase()))     //checking the designation from the whole designation string and printing the maching designation data
                                                s[j].staff_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s6 = input.nextInt();
                        }
                        break;
                    }
                default:
                    {
                        System.out.println(" You Have Enter Wrong Choice!!!");
                    }
            }
            System.out.println("\nReturn to MAIN MENU Press 1");
            status = input.nextInt();
        }
    }
}