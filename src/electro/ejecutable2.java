/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electro;

import java.util.ArrayList;

/**
 *
 * @author SENA
 */
public class ejecutable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<televisores> t = new ArrayList<>());
        ArrayList<lavadoras> l = new ArrayList<>());
        ArrayList<licuadora> r = new ArrayList<>());

        t.add(new televisores("sansung", "tv2016"));
        t.add(new televisores("LG","TV21026"));
        t.add(new televisores("SONNY ","TV474",450000,7));
        t.add(new televisores("ERICCSON","TV48",1600000,9));
        t.add(new televisores("PANASONI","TV7348",1000000,12));
        t.add(new televisores("alcatel","TV76748",1200000,10));
        
        l.add(new lavadoras("sansung", "lvd2016"));
        l.add(new lavadoras("LG","lvd21026"));
        l.add(new lavadoras("SONNY ","lvd474",450000,7));
        l.add(new lavadoras("PANASONI","lvd7348",1000000,12));
        l.add(new lavadoras("alcatel","lvd76748",1200000,10));
        l.add(new lavadoras("alcatel","lvd76748",1200000,10));
        
        r.add(new licuadora("sansung", "lic2016"));
        r.add(new licuadora("LG","lic21026"));
        r.add(new licuadora("SONNY ","lic474",450000,7));
        r.add(new licuadora("PANASONI","lic7348",1000000,12));
        r.add(new licuadora("alcatel","lic76748",1200000,10));
        r.add(new licuadora("alcatel","lic76748",1200000,10));
        
        
        
   System.out.println("existencias de articulos\n");
        System.out.println("existencias de TELEVISORES\n");
        for (int i=0;i<=5;i++)
        { 
          if (t.get(i)existen()!= 0)
            {
              System.out.println(t.get(i).toString());
                                System.out.println("");
          }
        }
        
        System.out.println("EXISTENCIA DE LAVADORAS\n");
        for (int i=0;i<=5;i++)
        { 
          if (l.get(i).existen()!= 0)
            {
              System.out.println(l.get(i).toString());
                                System.out.println("");
          }
        } 
        System.out.println("EXISTENCIA DE LICUADORAS\n");
        for (int i=0;i<=5;i++)
        { 
          if (r.get(i).existen()!= 0)
            {
              System.out.println(r.get(i).toString());
                                System.out.println("");
          }
          
          
    t.get(2).vender(10);
    t.get(3).vender(5);
    l.get(3).vender(4);
    l.get(4).vender(9);
    r.get(3).vender(14);
    r.get(4).vender(9);
    }
        
    System.out.println("articulos agotados\n");
        System.out.println("TELEVISORES AGOTADOS\n");
        for (int i=0;i<=5;i++)
        { 
          if (t.get(i).existen() < 1)
            {
              System.out.println(t.get(i).toString());
                                System.out.println("");
          }
        }
          
    System.out.println("articulos MENORES DE 3 UNIDADES\n");
        System.out.println("ARTICULOS MENORES QUE 3\n");
        for (int i=0;i<=5;i++)
        { 
          if (t.get(i).existen() < 3)
            {
              System.out.println(t.get(i).toString());
                                System.out.println("");
          }
        }
        
        int indice = 0;
        int mayor = 0;
    
    for (int i=0;i<=5;i++)
        { 
          if (t.get(i).cantidad > mayor)
            {
            indice=i;
            mayor  =t.get(i).cantidad;
            }
        }  
        System.out.println("\nMENORES EXISTENCIA:\n");
        System.out.println(t.get(indice).toString());
    
          }
        }    
        
