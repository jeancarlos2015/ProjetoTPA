/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd;

/**
 *
 * @author estagiario33601
 */
public class Complexo {
    private int real;
    private int imaginario;
    private String operador;
    final String[] getOperators(){
        String[] vector = {"+","-","/","*"};
        return vector;
    }
    final String preparedCase1(String expr){
        for(String op:getOperators()){
            if(expr.contains(op)){
                expr = expr.replace(op, " ");
                operador = op;
                break;
            }
        }
        return expr;
    }
    public void interpret(String text){
        boolean isSign = text.charAt(0)=='-';
        if(isSign){
            String[] buffer = text.split("-", 2);
            text = buffer[1];
        }
        String expr = preparedCase1(text).replace("i", "");
        String[] partes = expr.split(" ");
        
        if(isSign){
            real =  Integer.parseInt(partes[0])*-1;
        }else{
            real = Integer.parseInt(partes[0]);
        }
        if(operador.equals("-")){
            imaginario = Integer.parseInt(partes[1])*-1;
        }else{
            imaginario = Integer.parseInt(partes[1]);
        }
    }

    /**
     * @return the real
     */
    public int getReal() {
        return real;
    }

    /**
     * @param real the real to set
     */
    public void setReal(int real) {
        this.real = real;
    }

    /**
     * @return the maginario
     */
    public int getImaginario() {
        return imaginario;
    }

    /**
     * @param maginario the maginario to set
     */
    public void setImaginario(int maginario) {
        this.imaginario = maginario;
    }
    
    @Override
    public String toString(){
        if(real<0 && imaginario<0){
            return ""+real+""+imaginario;
        }else if(imaginario<0){
            return ""+real+""+imaginario;
        }
        return ""+real+""+operador+""+imaginario+"i";
    }
}
