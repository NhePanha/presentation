package javaapplication16;
import java.util.Scanner;
public class project2 {
    public int code;
    public String name;
    public String gender;
    public int Start_time;
    public int end_time;
    public String dd;
    public String position;
    public String shift;
    
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Code       : ");code=sc.nextInt();
        System.out.print("Enter Name       : ");name = sc.next();
        System.out.print("Enter Gender     : ");gender=sc.next();
        System.out.print("Enter Start Time : ");Start_time=sc.nextInt();
        System.out.print("Enter End Time   : ");end_time = sc.nextInt();
        System.out.print("Enter Position   : ");position = sc.next();
        System.out.print("Enter Day        : ");dd=sc.next();
        if(Start_time==7 && end_time==17)
        {
            shift = "EMPLOYEE FULD TIME";
        }
        else if(Start_time==7 && end_time==11)
        {
            shift = "EMPLOYEE PART TIME SHIFT AM";
        }
        else if(Start_time==1 && end_time==5)
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
        else if(Start_time == 12 && end_time == 5)
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
        else if(Start_time == 7 && end_time == 12)
        {
            shift = "EMPLOYEE PART TIME SHIFT AM";
        }
            
        else
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
    }
    public static void Header()
    {
        System.out.println("\t CODE \t NAME \t GENDER \t S-TIME \t E-TIME \t DAY \t \t POSITION \t SHIFT");
    }
    public void Output()
    {
        System.out.println("\t "+code+" \t "+name+" \t "+gender+" \t \t "+Start_time+" \t\t "+end_time+"\t  \t "+dd+" \t "+position+" \t "+shift);
    }
    public static void Shift()
    {
        System.out.println("[===================SHIFT EMPLOYEE==================]");
        System.out.println("\t___________MONDAY TO FRIDAY_________");
        System.out.println("\tMON-FRI     07:00 - 05:00 AM-PM");
        System.out.println("\tMON-FRI     07:00 - 11:00 AM");
        System.out.println("\tMON-FRI     01:00 - 05:00 PM");
        System.out.println("\t__________SATURDAY TO SUNDAY________");
        System.out.println("\tSAT-SUN     07:00 - 05:00 AM-PM");
        System.out.println("\tSAT-SUN     07:00 - 12:00 AM");
        System.out.println("\tSAT-SUN     12:00 - 05:00 PM");   
    }
    public int getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        this.name =n;
    }
    public void setStartTime(int t)
    {
        this.Start_time=t;
        if(Start_time==7 && end_time==17)
        {
            shift = "EMPLOYEE FULD TIME";
        }
        else if(Start_time==7 && end_time==11)
        {
            shift = "EMPLOYEE PART TIME SHIFT AM";
        }
        else if(Start_time==1 && end_time==5)
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
        else if(Start_time == 12 && end_time == 5)
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
        else if(Start_time == 7 && end_time == 12)
        {
            shift = "EMPLOYEE PART TIME SHIFT AM";
        }
            
        else
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
    }
    public void setEndTime(int e)
    {
        this.end_time=e;
        if(Start_time==7 && end_time==17)
        {
            shift = "EMPLOYEE FULD TIME";
        }
        else if(Start_time==7 && end_time==11)
        {
            shift = "EMPLOYEE PART TIME SHIFT AM";
        }
        else if(Start_time==1 && end_time==5)
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
        else if(Start_time == 12 && end_time == 5)
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
        else if(Start_time == 7 && end_time == 12)
        {
            shift = "EMPLOYEE PART TIME SHIFT AM";
        }
            
        else
        {
            shift = "EMPLOYEE PART TIME SHIFT PM";
        }
    }
    public void setDay(String d)
    {
        this.dd=d;
    }
    public String getPostion()
    {
        return position;
    }
    public static void main(String[] args) {
        project2[] emp = new project2[100];
        Scanner sc = new Scanner(System.in);
        int i,n = 0,j,op;
        project2.Shift();
        do{
            System.out.println("_=_=_=_=_=_=_=_=_=_=_OPTION_=_=_=_=_=_=_=_=_=_=_=_=");
            System.out.println("[1-> INPUT DATA                                   ]");
            System.out.println("[2-> OUTPUT DATA                                  ]");
            System.out.println("[3-> SEARCH DATA                                  ]");
            System.out.println("[4-> SORT DATA                                    ]");
            System.out.println("[5-> UPDATE DAT                                   ]");
            System.out.println("[6-> DELETE DATA                                  ]");
            System.out.println("[7-> ADD DATA                                     ]");
            System.out.println("[8-> CHANG TIME                                   ]");
            System.out.println("[9-> CHANG DAY                                    ]");
            System.out.println("[10-> CHOOSE EMPLOYEE                             ]");
            System.out.print("[PLEASE CHOSE ONE OPTION  ] :");op=sc.nextInt();
            switch(op)
            {
                case 1 -> {
                    System.out.print("Enter Number of Employee : ");n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        System.out.println("=_=_=_=_=_=_=_=_#"+(i+1)+"=_=_=_=_=_=_=_=_=_");
                        emp[i] = new project2();
                        emp[i].Input();
                    }
                }
                case 2 -> {
                    project2.Header();
                    for(i=0;i<n;i++)
                    {
                        emp[i].Output();
                    }   
                }
                case 3 -> {
                    String s_name=null;
                    int b=0;
                    System.out.print("Enter employee by name : ");s_name=sc.next();
                    for(i=0;i<n;i++)
                    {
                        if(s_name.equalsIgnoreCase(emp[i].getName()))
                        {
                            project2.Header();
                            emp[i].Output();
                            b=1;
                        }
                    }
                    if(b==0)
                    {
                        System.out.println("Search not found...!!!!!");
                    }
                    else
                    {
                        System.out.println("Search found.......");
                    }
                }
                case 4 -> {
                    int n_code;
                    int b=0;
                    for(i=0;i<n;i++)
                    {
                        for(j=i;j<n;j++)
                        {
                            n_code = emp[i].code;
                            emp[i].code = emp[j].code;
                            emp[j].code = n_code;
                            b=1;
                        }
                    }
                    if(b==0)
                    {
                        System.err.println("Error Sorting!!!!!");
                    }
                    else
                    {
                        System.err.println("Sorting Sucess....");
                    }
                        
                }
                case 5->{
                    String s_name=null;
                    int b=0;
                    System.out.print("Enter employee by name : ");s_name=sc.next();
                    for(i=0;i<n;i++)
                    {
                        if(s_name.equalsIgnoreCase(emp[i].getName()))
                        {
                            
                            System.out.print("Enter Name for Update : ");s_name=sc.next();
                            emp[i].setName(s_name);
                            b=1;
                        }
                    }
                    if(b==0)
                    {
                        System.out.println("Error Upadate!!!!!");
                    }
                    else
                    {
                        System.out.println("Update Successful.....");
                    }
                }
                case 6->{
                    String s_name=null;
                    int b=0;
                    System.out.print("Enter employee by name : ");s_name=sc.next();
                    for(i=0;i<n;i++)
                    {
                        if(s_name.equalsIgnoreCase(emp[i].getName()))
                        {
                            for(j=i;j<n;j++)
                            {
                                emp[j]=emp[j+1]; 
                            }
                        }
                        n--;
                        b=1;
                    }
                    if(b==0)
                    {
                        System.out.println("Error Delete!!!!!");
                    }
                    else
                    {
                        System.out.println("Delete Successful.....");
                    }
                }
                case 7->{
                    int m;
                    int b=0;
                    System.out.print("Add Number Of Employee : ");m=sc.nextInt();
                    for(i=n;i<n+m;i++)
                    {
                        emp[i] = new project2();
                        emp[i].Input();
                        b=1;
                    }
                    n=n+m;
                    if(b==0)
                    {
                        System.out.println("Error Add....!!!!!!");
                    }
                    else
                    {
                        System.out.println("Add Employee Success..");
                    } 
                }
                case 8->{
                    String s_name;
                    int sw_time;
                    int sw1_time;
                    int b=0;
                    System.out.print("Enter employee by name : ");s_name = sc.next();
                    for(i=0;i<n;i++)
                    {
                        if(s_name.equalsIgnoreCase(emp[i].getName()))
                        {
                            
                            System.out.print("Enter Start Tiem  for Update : ");sw_time=sc.nextInt();
                            emp[i].setStartTime(sw_time);
                            System.out.print("Enter End Time for Update    : ");sw1_time=sc.nextInt();
                            emp[i].setEndTime(sw1_time);
                            
                            b=1;
                        }
                    }
                    if(b==0)
                    {
                        System.out.println("Error Cange!!!!!");
                    }
                    else
                    {
                        System.out.println("Cange Successful.....");
                    }
                }
                case 9->{
                    String s_name;
                    String day;
                    int b=0;
                    System.out.print("Enter employee by name : ");s_name = sc.next();
                    for(i=0;i<n;i++)
                    {
                        if(s_name.equalsIgnoreCase(emp[i].getName()))
                        {
                            
                            System.out.print("Enter Day  : ");day=sc.next();
                            emp[i].setDay(day);
                            
                            b=1;
                        }
                    }
                    if(b==0)
                    {
                        System.out.println("Error Cange!!!!!");
                    }
                    else
                    {
                        System.out.println("Cange Successful.....");
                    }
                }
                case 10->{
                    String s_position=null;
                    int b=0;
                    int n1;
                    System.out.println("How many employee : ");n1 = sc.nextInt();
                    System.out.print("Enter employee by position : ");s_position=sc.next();
                    for(i=0;i<n1;i++)
                    {
                        if(s_position.equalsIgnoreCase(emp[i].getPostion()))
                        {
                            project2.Header();
                            for(i=0;i<n1;i++)
                            {
                                emp[i].Output();
                                b=1;
                            }
                        }
                        break;
                    }
                    if(b==0)
                    {
                        System.out.println("NOT EMPLOYEE!!!!!!!!!!");
                    }
                    else
                    {
                        System.out.println("HAVE EMPLOYEE "+(i+1));
                    }
                        
                }
            }
        }while(op!=0);
    }
}