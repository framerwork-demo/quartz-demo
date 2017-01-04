package springQuartz;

public class TestJob {  
    public void execute(){ 
        try{  
              System.out.print("hello quartz !");
         }catch(Exception ex){  
             ex.printStackTrace();  
         }  
     }  
}

