package unidad6;

import ed.ito.ListaDinamica;
import javax.swing.JOptionPane;

public class app {
    static ListaDinamica<Docente> [] docentes;
    static final int limite=150;
    
    static void inicializa(){
        docentes=new ListaDinamica[limite];
        for(int i=0; i<limite; i++)
            docentes[i]= new ListaDinamica <Docente>();
    }
    
    static void agregar(Docente d) {
        try{
            int k=d.hashCode();
            docentes[d.hashCode()].add(d);
        }catch(Exception e){
        }
    }
    
    static Docente buscar(long cedula){
        Docente d=null;
        int i=Docente.hashCode(cedula);
        ListaDinamica<Docente> de=docentes[i];
        for(i=0; i<de.size(); i++){
            try{
            Docente docente=de.getItem(i);
            if(docente.getCedula()==cedula){
                d=docente;
                break;
            } 
            }catch(Exception e){
                
            }
        }
        return d;
    }
    
    static void imprime(){
        try{
            for(int i=0; i<docentes.length; i++)
                for(int j=0; j<docentes[i].size(); j++)
                    System.out.println(docentes[i].getItem(j));
           System.out.println("");
            
        }catch(Exception e){
            
        }
    }
    
    static Docente ingresar(){
        long c=(Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese la cedula:")));
        String n=JOptionPane.showInputDialog(null, "Ingrese el nombre:");
        String p=JOptionPane.showInputDialog(null, "Ingrese la profesión:");
        int a=(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año de titulacion: ")));
        float s=(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el sueldo: ")));
        String pu=JOptionPane.showInputDialog(null, "Ingrese el puesto:");
        Docente d=new Docente (c,n,p,a,s,pu);
        return d; 
    }
    
    static void run(){
        inicializa();
        boolean salir=false;
        while(!salir){
          switch(menu()) {
            case 1:agregar(ingresar());break;
            case 2:JOptionPane.showMessageDialog(null, buscar(Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese la cedula:"))));break;
            case 3:imprime();break;
            case 4: salir=true;
          }
        }
    }
    
    static int menu(){
        int opc=0;
        String[] datos={"1.- Agregar nuevo docente",
                        "2.- Buscar docente",
                        "3.- Eliminar docente",
                        "4.- Listar docentes",
                        "5.- Terminar el programa"};
        String x=(String)JOptionPane.showInputDialog(null,"Seleccione uno", "Menu",
        JOptionPane.INFORMATION_MESSAGE, null,datos,datos[0]);
        opc=Integer.parseInt(x.charAt(0)+"");
        return opc;
    }
    
    public static void main (String [] args){
        run();
        
    }
}
