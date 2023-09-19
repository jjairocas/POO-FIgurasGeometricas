package AppFigurasGeom;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFigGeometricas extends JFrame{
    private JTextField txtRadioCirc;
    private JTextField txtAlturaRect;
    private JTextField txtBaseRect;
    private JTextField txtLadoCuadr;
    private JTextField txtBaseTriangle;
    private JTextField txtAlturaTriangle;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnSALIR;
    private JPanel MainPanel;

    public AppFigGeometricas() {
        setContentPane(MainPanel);
        setTitle("Figuras Geometricas");
        setSize(500, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double RadioCircle=0,BaseRectangulo=0,AlturaRectangulo=0,LadoCuadrado=0;
                double BaseTriangle=0,AlturaTriangle=0;

                try{
                    RadioCircle=Double.parseDouble(txtRadioCirc.getText());
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "INGRESA EL VALOR NUMERICO DEL RADIO",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }
                try{
                    BaseRectangulo=Double.parseDouble(txtBaseRect.getText());
                    AlturaRectangulo=Double.parseDouble((txtAlturaRect.getText()));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "INGRESA EL VALOR NUMERICO DE LA BASE O ALTURA DEL RECTANGULO",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }
                try{
                    LadoCuadrado=Double.parseDouble(txtLadoCuadr.getText());

                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "INGRESA EL VALOR NUMERICO DEL LADO DEL CUADRADO",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);

                }
                try {
                    BaseTriangle=Double.parseDouble(txtBaseTriangle.getText());
                    AlturaTriangle=Double.parseDouble((txtAlturaTriangle.getText()));
                }
                catch (NumberFormatException exception){
                    JOptionPane.showMessageDialog(null,
                            "INGRESA EL VALOR NUMERICO DE LA BASE O ALTURA DEL TRIANGULO",
                            "INGRESA SOLO NUMEROS",
                            JOptionPane.WARNING_MESSAGE);
                }

                if((RadioCircle == 0) || (BaseRectangulo == 0) || (AlturaRectangulo == 0) || (LadoCuadrado == 0) || (BaseTriangle == 0) || (AlturaTriangle == 0)){

                    txtRadioCirc.setText("");
                    txtBaseRect.setText("");
                    txtAlturaRect.setText("");
                    txtLadoCuadr.setText("");
                    txtBaseTriangle.setText("");
                    txtAlturaTriangle.setText("");
                }
                else{
                    Circulo Circul=new Circulo(RadioCircle);
                    Rectangulo Rectang=new Rectangulo(BaseRectangulo,AlturaRectangulo);
                    Cuadrado Cuadrd=new Cuadrado(LadoCuadrado);
                    TrianguloRectangulo TrangleL=new TrianguloRectangulo(BaseTriangle,AlturaTriangle);


                    //Area y Perimetro del Circulo
                    JOptionPane.showMessageDialog(null,
                            "El Area del circulo es: "+Circul.calcularArea()+" El Perimetro del circulo es: "+Circul.calcularPerimetro(),
                            "AREA FIGURAS",
                            JOptionPane.INFORMATION_MESSAGE);

                    //Area y Perimetro Rectangulo
                    JOptionPane.showMessageDialog(null,
                            "El Area del rectangulo es: "+Rectang.calcularArea()+" El Perimetro del rectangulo es: "+Rectang.calcularPerimetro(),
                            "AREA FIGURAS",
                            JOptionPane.INFORMATION_MESSAGE);

                    //Area y Perimetro Cuadrado
                    JOptionPane.showMessageDialog(null,
                            "El Area del cuadrado es: "+Rectang.calcularArea()+" El Perimetro del cuadrado es: "+Rectang.calcularPerimetro(),
                            "AREA FIGURAS",
                            JOptionPane.INFORMATION_MESSAGE);

                    //Area y Perimetro Triangulo
                    JOptionPane.showMessageDialog(null,
                            "El Area del triangulo es: "+TrangleL.calcularArea()+" El Perimetro del triangulo es: "+TrangleL.calcularPerimetro(),
                            "AREA FIGURAS",
                            JOptionPane.INFORMATION_MESSAGE);

                    TrangleL.determinarTipoTiangulo();

                }


            }
        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txtRadioCirc.setText("");
               txtBaseRect.setText("");
               txtAlturaRect.setText("");
               txtLadoCuadr.setText("");
               txtBaseTriangle.setText("");
               txtAlturaTriangle.setText("");

            }
        });
        btnSALIR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });
    }

}
