package com.example.android.xyz;

/**
 * Created by manuelperez on 9/30/17.
 */

public class Metodos {
    public static double precioPorCantidad(int cant, int precio){
        return cant * precio;
    }

    public static double calculoTotal(int cant, int gen, int tip, int mar){
        double res = 0;

        switch (gen) {
            case 0:
                switch (tip) {
                    case 0:
                        switch (mar) {
                            case 0:
                                res = precioPorCantidad(cant, 120000);
                                break;
                            case 1:
                                res = precioPorCantidad(cant, 140000);
                                break;
                            case 2:
                                res = precioPorCantidad(cant, 130000);
                                break;
                        }
                        break;
                    case 1:
                        switch (mar) {
                            case 0:
                                res = precioPorCantidad(cant, 50000);
                                break;
                            case 1:
                                res = precioPorCantidad(cant, 80000);
                                break;
                            case 2:
                                res = precioPorCantidad(cant, 100000);
                                break;
                        }
                        break;
                }
                break;
            case 1:
                switch (tip) {
                    case 0:
                        switch (mar) {
                            case 0:
                                res = precioPorCantidad(cant, 100000);
                                break;
                            case 1:
                                res = precioPorCantidad(cant, 130000);
                                break;
                            case 2:
                                res = precioPorCantidad(cant, 110000);
                                break;
                        }
                        break;
                    case 1:
                        switch (mar) {
                            case 0:
                                res = precioPorCantidad(cant, 60000);
                                break;
                            case 1:
                                res = precioPorCantidad(cant, 70000);
                                break;
                            case 2:
                                res = precioPorCantidad(cant, 120000);
                                break;
                        }
                        break;
                }
                break;
        }

        return res;
    }
}
