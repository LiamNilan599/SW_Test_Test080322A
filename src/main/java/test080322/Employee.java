package test080322;

public class Employee
{
    String title, name, PPS, phone, type;
    int age;

    Employee(String title, String name, String PPS, String phone, String type, int age)
    {
     this.title = title ;

     if(name.length() < 6 || name.length() > 22)
     {
         String Message = "Name invalid";
         throw new IllegalArgumentException(Message);
     }
     else if(PPS.length() != 6)
     {
         String Message = "PPS invalid";
         throw new IllegalArgumentException(Message);
     }
     else if(phone.length() != 7)
     {
         String Message = "Phone invalid";
         throw new IllegalArgumentException(Message);
     }
     else if(!type.equals("Full-time") && !type.equals("Part-time"))
     {
         String Message = "type invalid";
         throw new IllegalArgumentException(Message);
     }
     else if(age < 18 )
     {
         String Message = "age invalid";
         throw new IllegalArgumentException(Message);
     }
    this. name = name;
    this. PPS = PPS;
    this.phone = phone;
    this.type = type;
    this.age = age;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPPS() {
        return PPS;
    }

    public void setPPS(String PPS) {
        this.PPS = PPS;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
