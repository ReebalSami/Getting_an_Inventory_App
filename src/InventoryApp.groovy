class InventoryApp {
    def inventory = [:]

    // Feature 1: Add a product to the inventory
    def addProduct(String name, int quantity) {
        if (inventory.containsKey(name)) {
            println("Product $name already exists. Updating quantity.")
            inventory[name] += quantity
        } else {
            inventory[name] = quantity
            println("Product $name added to the inventory with quantity $quantity.")
        }
    }



}
