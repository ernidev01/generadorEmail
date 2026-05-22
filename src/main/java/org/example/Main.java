package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("*** Generador de Emails ***");

        // Nombre completo ingresado por el usuario
        var nombreCompleto = " Pepito Perez Ramirez ";
        System.out.println("nombreCompleto = " + nombreCompleto);

        // ===== Normalización del nombre =====

        // Eliminar espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();

        // Reemplazar los espacios entre palabras por puntos
        nombreNormalizado = nombreNormalizado.replace(" ", ".");

        // Convertir todo el texto a minúsculas
        nombreNormalizado = nombreNormalizado.toLowerCase();

        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // ===== Información de la empresa =====

        // Nombre de la empresa que formará parte del dominio del correo
        var nombreEmpresa = " Google ";
        System.out.println("\nNombre empresa: " + nombreEmpresa);

        // Extensión del dominio corporativo
        var extensionDominio = ".com.co";
        System.out.println("Extensión del dominio: " + extensionDominio);

        // Normalizar el nombre de la empresa:
        // 1. Eliminar espacios sobrantes
        // 2. Reemplazar espacios internos por puntos
        // 3. Convertir a minúsculas
        var nombreEmpresaNormalizado = nombreEmpresa
                .strip()
                .replace(" ", ".")
                .toLowerCase();

        // Construir el dominio del correo electrónico
        var dominioEmailNormalizado = "@"
                + nombreEmpresaNormalizado
                + extensionDominio;

        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        // ===== Generación del correo electrónico =====

        // Unir el nombre normalizado con el dominio de la empresa
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;

        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
