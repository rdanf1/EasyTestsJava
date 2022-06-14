class MonProg2 {

  public static void main(String[] args) {
  
      /* display arguments passed to MonProg2 when launched :
          ie : 
             $ java MonProg2 "je" "tu" "il" "nous" "vous" "ils"
          outputs :
             6
             je,tu,il,nous,vous,ils 
             tu partiras
             tu réussiras
             tu gagneras
             tu rêveras
      */
      
      // Number of arguments passed
      System.out.println(args.length) ;
      
      // Browse and display args
      for (String s : args) System.out.print(s + ",") ;
      
      // Print backspace then a point:"." to remove last comma 
      System.out.print("\b" + ".") ;
      // Carriage return ( end of line )
      System.out.println("") ;
      
      /* 
          Creating an instance of MonProgramme defined elsewhere...
          (Class in other file with same name : MonProgramme.java )
          NB : It is compiled within MonProg2.java compilation 
               => Generates MonProg2.class but previously MonProgramme.java
      */
       
      MonProgramme monProgramme = new MonProgramme () ;
      
      // args[1] is actually the 2d parameter of MonProg2 in runtime
      monProgramme.futur(args[0], "partir", "réussir", "gagner", "rêver"); 
       
  }
}