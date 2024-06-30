package ru.topacademy.javaqa;

public class ProductRepository {
    private Product[] products = new Product[0];

    // Метод для добавления нового продукта в массив products
    public void add(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    // Метод получения всех продуктов
    public Product[] findAll() {
        return products;
    }

    // Метод удаления продукта по ID
    public void removeById(int id) {
        // Находим индекс продукта, который нужно удалить
        int indexToRemove = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                indexToRemove = i;
                break;
            }
        }

        // Если продукт не найден, выходим из метода
        if (indexToRemove == -1) {
            return;
        }

        // Создаем новый массив для хранения продуктов без удаленного
        Product[] tmp = new Product[products.length - 1];

        // Копируем все продукты, кроме того, который нужно удалить
        for (int i = 0, j = 0; i < products.length; i++) {
            if (i != indexToRemove) {
                tmp[j++] = products[i];
            }
        }

        // Обновляем массив продуктов
        products = tmp;
    }

}





