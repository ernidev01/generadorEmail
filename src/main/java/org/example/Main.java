package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("*** Generador de Emails ***");

        var nombreCompleto = " Pepito Perez Ramirez ";  // Nombre completo del usuario
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Procesar o normalizar el nombrel del usuario
        // Limpiar los espacios en blanco al inicio y al final

        var nombreNormalizado = nombreCompleto.strip();
        nombreNormalizado = nombreNormalizado.replace(" ", "."); // Reemplazar los espacios en blanco por punto


        nombreNormalizado = nombreNormalizado.toLowerCase(); // Convertimos a minúsculas

        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // Datos de la empresa

        var nombreEmpresa = " Google ";
        System.out.println("\nNombre empresa: " + nombreEmpresa);
        var extensionDominio = ".com.co";
        System.out.println("Extensión del dominio: " + extensionDominio);

        // Quitamos los espacios en blanco y convertimos a minúsculas

        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        // Creamos el email final

        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
    }
}
