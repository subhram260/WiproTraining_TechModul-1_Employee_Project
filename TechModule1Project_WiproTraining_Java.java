class Employee{
    String id;
    String[] _employeeTableHeader = {"EmpNo","EmpName","JoinDate","DesignationCode","Department","Basic","HRA","IT"};
    String[][] _employeeTableData = new String[][]{
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
            {"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
            {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
            {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
            {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
    };

    String[] _designationTableHeader = {"DesignationCode", "Designation", "DA"};
    String[][] _designationTableData = new String[][]{
            {"e", "Engineer", "20000"},
            {"c", "Consultant", "32000"},
            {"k", "Clerk", "12000"},
            {"r", "Receptionist", "15000"},
            {"m", "Manager", "40000"}
    };
    Employee(String id){
        this.id=id;
    }
    public String[] getDesignationTableData(String code){
        String _designation = "",_da="";
        switch (code){
            case "e":
                _designation="Engineer";
                _da="20000";
                break;
            case "c":
                _designation="Consultant";
                _da="32000";
                break;
            case "k":
                _designation="Clerk";
                _da="12000";
                break;
            case "r":
                _designation="Receptionist";
                _da="15000";
                break;
            case "m":
                _designation="Manager";
                _da="40000";
                break;
        }
        return new String[]{_designation, _da};
    }
    public void getEmployeeData(){
        boolean _notFoundStatus=true;
        for(int i=0;i<_employeeTableData.length;i++)
        {
            if(this.id.equals(_employeeTableData[i][0])){

                _notFoundStatus=false;
                String[] dt=getDesignationTableData(_employeeTableData[i][3]);
                int salary=Integer.parseInt(_employeeTableData[i][5])+
                        Integer.parseInt(_employeeTableData[i][6])+
                        Integer.parseInt(dt[1])-
                        Integer.parseInt(_employeeTableData[i][7]);

                System.out.printf("%-5s %-11s %-11s %-18s %-15s\n",_employeeTableHeader[0],_employeeTableHeader[1],
                        _employeeTableHeader[4], _designationTableHeader[1],"Salary");
                System.out.printf("%-5s %-11s %-11s %-18s %-15d\n",_employeeTableData[i][0],_employeeTableData[i][1],
                        _employeeTableData[i][4], dt[0],salary);
            }
        }
        if(_notFoundStatus){
            System.out.println("There is no employee with empid : "+id);
        }
    }

}


public class TechModule1Project_WiproTraining_Java {
    public static void main(String...args){
        Employee e1=new Employee(args[0]);
        e1.getEmployeeData();
    }
}
