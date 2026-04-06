public class ECommerce {
    public String productNames[] = new String[26];
    int index;
    public boolean addProductName(String productName) {
        boolean isAdded = false;
        if (index < productNames.length) {
            if (productName != null && !productName.isEmpty()) {
                productNames[index++] = productName;
                isAdded = true;
            } else System.out.println(productName + " is invalid");
        } else
            System.out.println("productNames index is full");
        return isAdded;
    }
    public void getProductDetails() {
        System.out.println("The products are : \n");
        for (String item : productNames)
            if (item != null) System.out.println(item);
    }
    public String getProductByIndex(int index) {
        String productName = null;
        if (index < productNames.length)
            productName = productNames[index];
        else
            System.out.println("Invalid index value: " + index);
        return productName;
    }
    public int getIndexByProduct(String productName) {
        int index = 0;
        if (productName != null) {
            for (String item : productNames) {
                if (item != null && item.equals(productName)) {
                    return index;
                }
                index++;
            }
        } else System.out.println("product name not found: " + productName);
        return index;
    }
    public boolean updateProduct(String existingName, String updateName) {
        boolean isUpdated = false;
        int index = 0;
        if (updateName != null && !updateName.isEmpty()) {
            for (String name : productNames) {
                if (existingName.equals(name)) {
                    productNames[index] = updateName;
                    isUpdated = true;
                }
                index++;
            }
            if (!isUpdated) System.out.println("The name is not found");
        } else {
            System.out.println("Invalid Input..");
        }
        return isUpdated;
    }
    public boolean deleteProduct(String deleteName) {
        boolean isDeleted = false;
        int index = 0;
        if (deleteName != null && !deleteName.isEmpty()) {
            for (String name : productNames) {
                if (deleteName.equals(name)) {
                    productNames[index] = null;
                    isDeleted = true;
                }
                index++;
            }
        } else {
            System.out.println("Invalid Input..");
        }
        return isDeleted;
    }
}