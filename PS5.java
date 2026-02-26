
class PS5 {
    static String modelName;
    static int storageSize;
    static double price;
    static boolean isDigitalEdition;
    static String controllerColor;
    static int usbPorts;
    static boolean hasOpticalDrive;
    static double weight;
    static String firmwareVersion;
    static String bundledGame;

    public static boolean createPS5(String mName, int sSize, double prc, boolean digital, String cColor, int ports, boolean drive, double wgt, String firmware, String game) {
        boolean isPS5Created = false;
        
        boolean isModelValid = false;
        boolean isStorageValid = false;
        boolean isPriceValid = false;
        boolean isDigitalValid = true; 
        boolean isColorValid = false;
        boolean isPortsValid = false;
        boolean isDriveValid = true;
        boolean isWeightValid = false;
        boolean isFirmwareValid = false;
        boolean isGameValid = false;

        if (mName != null && !mName.isEmpty()) {
            System.out.println("Model name is Valid");
            modelName = mName;
            isModelValid = true;
        } else {
            System.out.println("Model name is invalid");
        }

        if (sSize > 0) {
            System.out.println("Storage size is Valid");
            storageSize = sSize;
            isStorageValid = true;
        } else {
            System.out.println("Storage size is invalid");
        }

        if (prc > 0) {
            System.out.println("Price is Valid");
            price = prc;
            isPriceValid = true;
        } else {
            System.out.println("Price is invalid");
        }

        isDigitalEdition = digital;

        if (cColor != null && !cColor.isEmpty()) {
            System.out.println("Controller color is Valid");
            controllerColor = cColor;
            isColorValid = true;
        } else {
            System.out.println("Controller color is invalid");
        }

        if (ports > 0) {
            System.out.println("USB ports count is Valid");
            usbPorts = ports;
            isPortsValid = true;
        } else {
            System.out.println("USB ports count is invalid");
        }

        hasOpticalDrive = drive;

        if (wgt > 0) {
            System.out.println("Weight is Valid");
            weight = wgt;
            isWeightValid = true;
        } else {
            System.out.println("Weight is invalid");
        }

        if (firmware != null && !firmware.isEmpty()) {
            System.out.println("Firmware version is Valid");
            firmwareVersion = firmware;
            isFirmwareValid = true;
        } else {
            System.out.println("Firmware version is invalid");
        }

        if (game != null && !game.isEmpty()) {
            System.out.println("Bundled game is Valid");
            bundledGame = game;
            isGameValid = true;
        } else {
            System.out.println("Bundled game is invalid");
        }

        if (isModelValid && isStorageValid && isPriceValid && isColorValid && isPortsValid && isWeightValid && isFirmwareValid && isGameValid) {
            isPS5Created = true;
        } else {
            System.out.println("The PS5 configuration is not valid");
        }

        return isPS5Created;
    }

    public static void getPS5Details() {
        System.out.println("PS5 System Details:");
        System.out.println("Model: " + modelName);
        System.out.println("Storage: " + storageSize + "GB");
        System.out.println("Price: $" + price);
        System.out.println("Digital Edition: " + isDigitalEdition);
        System.out.println("Controller Color: " + controllerColor);
        System.out.println("USB Ports: " + usbPorts);
        System.out.println("Optical Drive: " + hasOpticalDrive);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Firmware: " + firmwareVersion);
        System.out.println("Bundled Game: " + bundledGame);
    }
}
