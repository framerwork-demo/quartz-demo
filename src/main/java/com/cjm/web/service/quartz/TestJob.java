package com.cjm.web.service.quartz;

public class TestJob {  
    public void execute(){ 
        try{  
              System.out.print("hello quartz !");
         }catch(Exception ex){  
             ex.printStackTrace();  
         }  
     }  
}

