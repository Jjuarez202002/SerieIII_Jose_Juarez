
package com.mycompany.serie_iii_hexadecimal_a_decimal_josejuarez;



 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HexToDecimalConverter converter = new HexToDecimalConverter();

        while (true) {
            System.out.println("1. Convertir número hexadecimal a decimal");
            System.out.println("2. Reiniciar");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingresa un número en base hexadecimal: ");
                    String hexNumber = scanner.next();
                    converter.setHexValue(hexNumber); // Establecer el valor hexadecimal
                    int decimalNumber = converter.convertToDecimal();
                    System.out.println("El número en base decimal es: " + decimalNumber);
                    break;
                case 2:
                    converter.setHexValue(""); // Restablecer el valor hexadecimal
                    System.out.println("Ajustes restablecidos.");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
            }
}




