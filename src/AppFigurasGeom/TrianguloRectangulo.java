package AppFigurasGeom;

import javax.swing.*;

public class TrianguloRectangulo {

    double base;
    double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
        return  ((base*altura)/2);

    }
    double calcularPerimetro(){
        return (base+altura+calcularHipotenusa());

    }
    double calcularHipotenusa(){
        return (Math.pow((base*base+altura*altura),0.5));

    }
    void determinarTipoTiangulo(){
        if((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){

            JOptionPane.showMessageDialog(null,
                    "ES UN TRIANGULO EQUILATERO",
                    "TIPO DE TRIANGULO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else if((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            JOptionPane.showMessageDialog(null,
                    "ES UN TRIANGULO ESCALENO",
                    "TIPO DE TRIANGULO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "ES UN TRIANGULO ISOSCELES",
                    "TIPO DE TRIANGULO",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
