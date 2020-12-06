grammar Trabalho;

@header{ 
package teste.parser;
import java.util.*;

}

@members{
    private HashMap<String,Simbolo> memory = new HashMap<String,Simbolo>();
}

prog  returns [Integer val]     :
       (stmt)+                
      ;

stmt  returns [Integer val]     :    
        input  EOL                                      
      | output EOL       
      ;

input returns [Integer val]     :
        'int'  VAR            {Simbolo simbolo = new Simbolo("int",2);
                                 simbolo.valori=0;
                                 memory.put($VAR.text,simbolo);
                                 System.out.println($VAR.text+"="+0);              
                                   }    
      | 'int'  VAR  '=' expr0  {Simbolo simbolo = new Simbolo("int",2);
                                 simbolo.valori=$expr0.val;
                                 memory.put($VAR.text,simbolo);
                                 System.out.println($VAR.text+"="+$expr0.val);              
                                   }   
      | 'double'   VAR           {Simbolo simbolo = new Simbolo("double",1);
                                 simbolo.valord=0;
                                 memory.put($VAR.text,simbolo);
                                 System.out.println($VAR.text+"="+0);              
                                   }
      | 'double'  VAR  '=' expr0 {Simbolo simbolo = new Simbolo("double",1);
                                 simbolo.valord=$expr0.val;
                                 memory.put($VAR.text,simbolo);
                                 System.out.println($VAR.text+"="+$expr0.val);              
                                   }       
      | 'string'  VAR  '=' '"' PALA '"' {Simbolo simbolo = new Simbolo("String",0);
                                 simbolo.valors=$PALA.text;
                                 memory.put($VAR.text,simbolo);
                                 System.out.println($VAR.text+"="+$PALA.text);              
                                   }
      | 'string'   VAR           {Simbolo simbolo = new Simbolo("String",0);
                                 simbolo.valors="";
                                 memory.put($VAR.text,simbolo);
                                 System.out.println($VAR.text+"="+"");              
                                  }
      | expr0       {System.out.println($expr0.val);}   

      ;

output returns [String val]     : 
       'print' VAR                      {   if(memory.get($VAR.text).tiponum==0){
                                                System.out.println(memory.get($VAR).tipo+"="+memory.get($VAR).valors);
                                                }
                                            if(memory.get($VAR.text).tiponum==1){
                                                System.out.println(memory.get($VAR).tipo+"="+memory.get($VAR).valord);
                                                }
                                            if(memory.get($VAR.text).tiponum==2){
                                                System.out.println(memory.get($VAR).tipo+"="+memory.get($VAR).valori);
                                                }
                                          System.out.println(memory.get($VAR.text));
                                        }
      ;

expr0 returns [Integer val]     : 
        expr1  '+'  h1=expr0     {$val = $expr1.val + $h1.val;}
      | expr1  '-'  h2=expr0     {$val = $expr1.val - $h2.val;}
      | expr1                    {$val = $expr1.val;}
      ;

expr1 returns [Integer val]     :
        expr2   '*'  t1=expr1   {$val = $expr2.val * $t1.val;}
       |expr2   '/'  t2=expr1   {$val = $expr2.val / $t2.val;}
       |expr2   '%'  t3=expr1   {$val = $expr2.val % $t3.val;}
       |expr2                   {$val = $expr2.val;}
       ;
 
expr2 returns [Integer val]     : 
       PE  expr0  PD            {$val = $expr0.val;}  
       | NUM                    {$val = Integer.parseInt($NUM.text);}      
       ;

EOL     : ';';
PE      : '(';
PD      : ')';
ADIC    : '+' ;
RESTO   : '%' ;
MENOS   : '-' ;
MULT    : '*' ;
DIV     : '/' ;
IGUAL   : '=' ;
PALA    : [a-zA-Z0-9_]+;
VAR     : [a-zA-Z][a-zA-Z0-9_]*;
NUM     : [-]?[0-9]*[.]?[,]?[0-9]+;
WS      : [\n\r \t]+ -> skip;