
class SingleObject {  
    //static member holds only one instance of the JDBCSingleton class.  
             
    private static SingleObject jdbc;  
           
    //JDBCSingleton prevents the instantiation from any other class.  
    private SingleObject() {  }  
        
    //Now we are providing gloabal point of access.  
     public static SingleObject getInstance() {    
         if (jdbc==null)  
         {  
             jdbc=new  SingleObject();  
             System.out.println("New Object Created");
         }  
        //System.out.println("New Object Created");
        return jdbc;  
     }  
            
}