package paquete; 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EjemploLogger {
    private static final Logger logger = LoggerFactory.getLogger(EjemploLogger.class);

    public static void main(String[] args) {
        // Ejemplo de mensajes de log con diferentes niveles de severidad
        logger.trace("Este es un mensaje de traza");
        logger.debug("Este es un mensaje de depuración");
        logger.info("Este es un mensaje informativo");
        logger.warn("Este es un mensaje de advertencia");
        logger.error("Este es un mensaje de error");

        // Ejemplo de mensaje con parámetros
        String usuario = "David";
        int edad = 25;
        logger.info("El usuario {} tiene {} años", usuario, edad);

        // También se pueden pasar excepciones al registroa
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("Error al dividir", e);
        }
    }
}
