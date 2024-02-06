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

    // Feature 2: Display the current inventory
    def displayInventory() {
        if (inventory.isEmpty()) {
            println("Inventory is empty.")
        } else {
            println("Current Inventory:")
            inventory.each { product, quantity ->
                println("$product: $quantity")
            }
        }
    }

    // Feature 3: Adjust stock quantity
    def adjustStock(String name, int quantity) {
        if (inventory.containsKey(name)) {
            inventory[name] += quantity
            println("Stock quantity for $name adjusted by $quantity.")
        } else {
            println("Product $name not found in the inventory.")
        }

    }
}
