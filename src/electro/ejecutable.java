/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electro;
/**
 *
 * @author HP
 */
public class ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        televisores ListadoTelevisores []= new televisores [6];
        lavadoras ListadoLavadoras[]=new lavadoras[6];
        licuadora ListadoLicuadora[]=new licuadora[6];
        
        ListadoTelevisores[0]=new televisores("sansung", "tv2016");
        ListadoTelevisores[1]=new televisores("LG","TV21026");
        ListadoTelevisores[2]=new televisores("SONNY ","TV474",450000,7);
        ListadoTelevisores[3]=new televisores("ERICCSON","TV48",1600000,9);
        ListadoTelevisores[4]=new televisores("PANASONI","TV7348",1000000,12);
        ListadoTelevisores[5]=new televisores("alcatel","TV76748",1200000,10);
        
        ListadoLavadoras[0]=new lavadoras("sansung", "lvd2016");
        ListadoLavadoras[1]=new lavadoras("LG","lvd21026");
        ListadoLavadoras[2]=new lavadoras("SONNY ","lvd474",450000,7);
        ListadoLavadoras[3]=new lavadoras("PANASONI","lvd7348",1000000,12);
        ListadoLavadoras[4]=new lavadoras("alcatel","lvd76748",1200000,10);
        ListadoLavadoras[5]=new lavadoras("alcatel","lvd76748",1200000,10);
        
        ListadoLicuadora[0]=new licuadora("sansung", "lic2016");
        ListadoLicuadora[1]=new licuadora("LG","lic21026");
        ListadoLicuadora[2]=new licuadora("SONNY ","lic474",450000,7);
        ListadoLicuadora[3]=new licuadora("PANASONI","lic7348",1000000,12);
        ListadoLicuadora[4]=new licuadora("alcatel","lic76748",1200000,10);
        ListadoLicuadora[5]=new licuadora("alcatel","lic76748",1200000,10);
        
        
        
        
        
        System.out.println("existencias de articulos\n");
        System.out.println("existencias de TELEVISORES\n");
        for (int i=0;i<=5;i++)
        { 
          if (ListadoTelevisores[i].existen()!= 0)
            {
              System.out.println(ListadoTelevisores[i].toString());
                                System.out.println("");
          }
        }
        
        System.out.println("EXISTENCIA DE LAVADORAS\n");
        for (int i=0;i<=5;i++)
        { 
          if (ListadoLavadoras[i].existen()!= 0)
            {
              System.out.println(ListadoLavadoras[i].toString());
                                System.out.println("");
          }
        } 
        System.out.println("EXISTENCIA DE LICUADORAS\n");
        for (int i=0;i<=5;i++)
        { 
          if (ListadoLicuadora[i].existen()!= 0)
            {
              System.out.println(ListadoLicuadora[i].toString());
                                System.out.println("");
          }
          
          
    ListadoTelevisores[2].vender(10);
    ListadoTelevisores[3].vender(5);
    ListadoLavadoras[3].vender(4);
    ListadoLavadoras[4].vender(9);
    ListadoLicuadora[3].vender(14);
    ListadoLicuadora[4].vender(9);
    }
        
    System.out.println("articulos agotados\n");
        System.out.println("TELEVISORES AGOTADOS\n");
        for (int i=0;i<=5;i++)
        { 
          if (ListadoTelevisores[i].existen() < 1)
            {
              System.out.println(ListadoTelevisores[i].toString());
                                System.out.println("");
          }
        }
          
    System.out.println("articulos MENORES DE 3 UNIDADES\n");
        System.out.println("ARTICULOS MENORES QUE 3\n");
        for (int i=0;i<=5;i++)
        { 
          if (ListadoTelevisores[i].existen() < 3)
            {
              System.out.println(ListadoTelevisores[i].toString());
                                System.out.println("");
          }
        }
        
        int indice = 0;
        int mayor = 0;
    
    for (int i=0;i<=5;i++)
        { 
          if (ListadoTelevisores[i].cantidad > mayor)
            {
            indice=i;
            mayor  =ListadoTelevisores[i].cantidad;
            }
        }  
        System.out.println("\nMENORES EXISTENCIA:\n");
        System.out.println(ListadoTelevisores[indice].toString());
    
          }
        }    
        
    
    
