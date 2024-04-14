package com.cesde;

public class Ejercicios {

    public String ejercicio1(int num1, int num2) {
        if (num1 > num2) {
            return "El número mayor es: " + num1;
        } else if (num2 > num1) {
            return "El número mayor es: " + num2;

        } else {
            return "Los dos números son iguales.";
        }
    }

    public String ejercicio2(double calificacion) {
        return (calificacion >= 3.5) ? "¡Felicidades! Usted ha aprobado el examen."
                : "Lo siento, usted ha reprobado el examen.";
    }

    public double ejercicio3(double precio) {
        if (precio >= 50000) {
            double descuento = precio * 0.10;
            return precio - descuento;
        } else {
            return precio;
        }
    }

    public String ejercicio4(int tipoFigura, double ladoCuadrado, double baseTriangulo, double alturaTriangulo,
            double radioCirculo) {
        switch (tipoFigura) {
            case 1:
                return "El área de la figura es: " + ladoCuadrado * ladoCuadrado;

            case 2:
                return "El área de la figura es: " + baseTriangulo * alturaTriangulo / 2;
            case 3:
                return "El área de la figura es: " + Math.PI * Math.pow(radioCirculo, 2);

            default:
                return "Tipo de figura no válida.";
        }
    }

    public int ejercicio5(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num1 && num2 < num3) {
            return num2;
        }
        return num3;
    }
}
